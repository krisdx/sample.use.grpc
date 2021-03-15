package grpc.server;

import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCall.Listener;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;

public class Interceptor implements ServerInterceptor {

	public <ReqT, RespT> Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata metadata,
			ServerCallHandler<ReqT, RespT> next) {
		if (call.getMethodDescriptor().getFullMethodName().equalsIgnoreCase("")) {
			for (String key : metadata.keys()) {
				String value = metadata.get(Metadata.Key.of(key, Metadata.ASCII_STRING_MARSHALLER));
				System.out.println("key: " + key + ", value: " + value);
			}
		}
		
		return next.startCall(call, metadata);
	}

}