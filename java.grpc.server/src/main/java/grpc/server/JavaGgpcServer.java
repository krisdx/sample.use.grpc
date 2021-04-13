package grpc.server;

import java.io.File;
import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerInterceptors;
import io.grpc.ServerServiceDefinition;

public class JavaGgpcServer {

	private static final int PORT = 8083;

	private Server server;
	private JavaGrpcService service;
	private Interceptor interceptor;

	public void start() throws IOException, InterruptedException {
		
		File key = new File(JavaGrpcService.class.getResource("/key.pem").getFile());
		File cert = new File(JavaGrpcService.class.getResource("/cert.pem").getFile());

		service = new JavaGrpcService();
		interceptor = new Interceptor();
		ServerServiceDefinition serviceDefinition = ServerInterceptors.interceptForward(service, interceptor);
		server = ServerBuilder.forPort(PORT).useTransportSecurity(cert, key).addService(serviceDefinition).build();
		server.start();
		System.out.println("Server started at port: " + PORT);
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.out.println("Shutting down server...");
				shutdown();
			}
		});

		server.awaitTermination();
	}

	public void shutdown() {
		if (server != null) {
			server.shutdown();
		}
	}

}
