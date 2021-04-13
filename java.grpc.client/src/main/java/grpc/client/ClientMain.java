package grpc.client;

import java.io.File;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.net.ssl.SSLException;

import io.grpc.Channel;
import io.grpc.ClientInterceptor;
import io.grpc.ClientInterceptors;
import io.grpc.ManagedChannel;
import io.grpc.Metadata;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;
import sample.use.proto.JavaGrpcServerGrpc;
import sample.use.proto.JavaGrpcServerGrpc.JavaGrpcServerBlockingStub;
import sample.use.proto.JavaGrpcServerGrpc.JavaGrpcServerStub;
import sample.use.proto.JavaRequest;
import sample.use.proto.JavaResponse;

public class ClientMain {

	public static void main(String[] args) throws SSLException, InterruptedException {

		File key = new File(ClientMain.class.getResource("/cert.pem").getFile());
		ManagedChannel channel = NettyChannelBuilder.forAddress("localhost", 8083)
				.sslContext(GrpcSslContexts.forClient().trustManager(key).build()).build();
		JavaGrpcServerBlockingStub blockingClient = JavaGrpcServerGrpc.newBlockingStub(channel);
		JavaGrpcServerStub nonBlockingClient = JavaGrpcServerGrpc.newStub(channel);

//		sendMetadata(blockingClient);
//
//		sendUnaryCall(blockingClient);
//
//		serverStreaming(blockingClient);
//
//		clientStreaming(nonBlockingClient);

		biDirectional(nonBlockingClient);

		TimeUnit.SECONDS.sleep(1);
		channel.shutdown();
		channel.awaitTermination(2, TimeUnit.SECONDS);
	}

	private static void biDirectional(JavaGrpcServerStub nonBlockingClient) {
		try {
			StreamObserver<JavaRequest> serverObserver = nonBlockingClient
					.biDirectionalStreaming(new StreamObserver<JavaResponse>() {

						@Override
						public void onNext(JavaResponse response) {
							System.out.println("Client Streaming Server Response: " + response);
						}

						@Override
						public void onError(Throwable t) {
							System.err.println("Client Streaming Server Error: " + t);
						}

						@Override
						public void onCompleted() {

						}
					});

			JavaRequest request1 = JavaRequest.newBuilder().setRequest("Client Streaming Request 1").build();
			serverObserver.onNext(request1);
			JavaRequest request2 = JavaRequest.newBuilder().setRequest("Client Streaming Request 2").build();
			serverObserver.onNext(request2);
			JavaRequest request3 = JavaRequest.newBuilder().setRequest("Client Streaming Request 3").build();
			serverObserver.onNext(request3);
			
			serverObserver.onCompleted();
		} catch (Exception e) {
			System.err.print(e);
		}
	}

	private static void clientStreaming(JavaGrpcServerStub nonBlockingClient) {
		try {
			StreamObserver<JavaRequest> serverObserver = nonBlockingClient
					.clientStreaming(new StreamObserver<JavaResponse>() {

						@Override
						public void onNext(JavaResponse response) {
							System.out.println("Client Streaming Server Response: " + response);
						}

						@Override
						public void onError(Throwable t) {
							System.err.println("Client Streaming Server Error: " + t);
						}

						@Override
						public void onCompleted() {

						}
					});

			JavaRequest request1 = JavaRequest.newBuilder().setRequest("Client Streaming Request 1").build();
			serverObserver.onNext(request1);
			JavaRequest request2 = JavaRequest.newBuilder().setRequest("Client Streaming Request 2").build();
			serverObserver.onNext(request2);
			JavaRequest request3 = JavaRequest.newBuilder().setRequest("Client Streaming Request 3").build();
			serverObserver.onNext(request3);
			
			serverObserver.onCompleted();
		} catch (Exception e) {
			System.err.print(e);
		}
	}

	private static void serverStreaming(JavaGrpcServerBlockingStub blockingClient) {
		JavaRequest request = JavaRequest.newBuilder().setRequest("Server Streaming").build();
		Iterator<JavaResponse> responses = blockingClient.serverStreaming(request);
		while (responses.hasNext()) {
			JavaResponse response = responses.next();
			System.out.println(response);
		}
	}

	private static void sendUnaryCall(JavaGrpcServerBlockingStub blockingClient) {
		JavaRequest request = JavaRequest.newBuilder().setRequest("Unary Client Call").build();
		JavaResponse response = blockingClient.unaryCall(request);
		System.out.println("Server response: " + response);
	}

	private static void sendMetadata(JavaGrpcServerBlockingStub blockingClient) {
		Metadata md = new Metadata();
		md.put(Metadata.Key.of("username", Metadata.ASCII_STRING_MARSHALLER), "username");
		md.put(Metadata.Key.of("password", Metadata.ASCII_STRING_MARSHALLER), "pass");

		JavaRequest request = JavaRequest.newBuilder().setRequest("metadata request").build();
		JavaResponse response = blockingClient.withInterceptors(MetadataUtils.newAttachHeadersInterceptor(md))
				.unaryCall(request);
		System.out.println("Server Response: " + response);
	}
}
