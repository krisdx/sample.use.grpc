package grpc.server;

import java.util.concurrent.atomic.AtomicInteger;

import io.grpc.stub.StreamObserver;
import sample.use.proto.JavaRequest;
import sample.use.proto.JavaResponse;
import sample.use.proto.JavaGrpcServerGrpc.JavaGrpcServerImplBase;

public class JavaGrpcService extends JavaGrpcServerImplBase {

	@Override
	public void unaryCall(JavaRequest request, StreamObserver<JavaResponse> responseObserver) {
		System.out.println("Unary call from client: " + request);
		boolean errorResponse = Boolean
				.parseBoolean(System.getProperty("sample.use.grpc.server.error.response", "false"));
		if (!errorResponse) {
			JavaResponse response = JavaResponse.newBuilder().setResponse("Success Server Unary Call Response").build();
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		} else {
			responseObserver.onError(new RuntimeException("Error Response"));
		}
	}

	@Override
	public StreamObserver<JavaRequest> clientStreaming(final StreamObserver<JavaResponse> clientObserver) {
		return new StreamObserver<JavaRequest>() {

			private AtomicInteger requestsCount = new AtomicInteger(0);

			public void onNext(JavaRequest request) {
				System.out.println(
						"clientStreaming call from client: " + request + ", [" + requestsCount.getAndIncrement() + "]");
			}

			public void onError(Throwable t) {
				System.err.print(t);
			}

			public void onCompleted() {
				System.out.println("clientStreaming, total calls: " + requestsCount.get());
				boolean errorResponse = Boolean
						.parseBoolean(System.getProperty("sample.use.grpc.server.error.response", "false"));
				if (!errorResponse) {
					JavaResponse response = JavaResponse.newBuilder().setResponse("Success Server Client Streaming Call").build();
					clientObserver.onNext(response);
					clientObserver.onCompleted();
				} else {
					clientObserver.onError(new RuntimeException("Error Response"));
				}
			}
		};
	}

	@Override
	public void serverStreaming(JavaRequest request, StreamObserver<JavaResponse> responseObserver) {
		System.out.println("ServerStreaming call from client: " + request);
		boolean errorResponse = Boolean
				.parseBoolean(System.getProperty("sample.use.grpc.server.error.response", "false"));
		if (!errorResponse) {
			int n = Integer.parseInt(System.getProperty("sample.use.grpc.server.server.streaming.messages.count", "5"));
			for (int i = 1; i <= n; i++) {
				JavaResponse response = JavaResponse.newBuilder().setResponse("Success Server Streaming Call Response " + i).build();
				responseObserver.onNext(response);
			}
			responseObserver.onCompleted();
		} else {
			responseObserver.onError(new RuntimeException("Error Response"));
		}
	}

	@Override
	public StreamObserver<JavaRequest> biDirectionalStreaming(final StreamObserver<JavaResponse> responseObserver) {
		return new StreamObserver<JavaRequest>() {

			private StringBuilder sb = new StringBuilder();

			public void onNext(JavaRequest request) {
				System.out.println("biDirectionalStreaming : " + request);
				sb.append(request.getRequest());
				boolean errorResponse = Boolean
						.parseBoolean(System.getProperty("sample.use.grpc.server.error.response", "false"));
				if (!errorResponse) {
					JavaResponse response = JavaResponse.newBuilder().setResponse("Success BiDirectional Call Response").build();
					responseObserver.onNext(response);
				} else {
					responseObserver.onError(new RuntimeException("Error Response"));
				}
			}

			public void onError(Throwable t) {
				System.err.print(t);
			}

			public void onCompleted() {
				// Assuming we have a symmetrical communication
				responseObserver.onCompleted();
			}
		};
	}
}