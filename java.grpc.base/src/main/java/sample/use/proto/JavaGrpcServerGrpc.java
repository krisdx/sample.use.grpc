package sample.use.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: server.proto")
public final class JavaGrpcServerGrpc {

  private JavaGrpcServerGrpc() {}

  public static final String SERVICE_NAME = "JavaGrpcServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sample.use.proto.JavaRequest,
      sample.use.proto.JavaResponse> getUnaryCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "unaryCall",
      requestType = sample.use.proto.JavaRequest.class,
      responseType = sample.use.proto.JavaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sample.use.proto.JavaRequest,
      sample.use.proto.JavaResponse> getUnaryCallMethod() {
    io.grpc.MethodDescriptor<sample.use.proto.JavaRequest, sample.use.proto.JavaResponse> getUnaryCallMethod;
    if ((getUnaryCallMethod = JavaGrpcServerGrpc.getUnaryCallMethod) == null) {
      synchronized (JavaGrpcServerGrpc.class) {
        if ((getUnaryCallMethod = JavaGrpcServerGrpc.getUnaryCallMethod) == null) {
          JavaGrpcServerGrpc.getUnaryCallMethod = getUnaryCallMethod =
              io.grpc.MethodDescriptor.<sample.use.proto.JavaRequest, sample.use.proto.JavaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "unaryCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sample.use.proto.JavaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sample.use.proto.JavaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JavaGrpcServerMethodDescriptorSupplier("unaryCall"))
              .build();
        }
      }
    }
    return getUnaryCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sample.use.proto.JavaRequest,
      sample.use.proto.JavaResponse> getClientStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clientStreaming",
      requestType = sample.use.proto.JavaRequest.class,
      responseType = sample.use.proto.JavaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<sample.use.proto.JavaRequest,
      sample.use.proto.JavaResponse> getClientStreamingMethod() {
    io.grpc.MethodDescriptor<sample.use.proto.JavaRequest, sample.use.proto.JavaResponse> getClientStreamingMethod;
    if ((getClientStreamingMethod = JavaGrpcServerGrpc.getClientStreamingMethod) == null) {
      synchronized (JavaGrpcServerGrpc.class) {
        if ((getClientStreamingMethod = JavaGrpcServerGrpc.getClientStreamingMethod) == null) {
          JavaGrpcServerGrpc.getClientStreamingMethod = getClientStreamingMethod =
              io.grpc.MethodDescriptor.<sample.use.proto.JavaRequest, sample.use.proto.JavaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "clientStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sample.use.proto.JavaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sample.use.proto.JavaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JavaGrpcServerMethodDescriptorSupplier("clientStreaming"))
              .build();
        }
      }
    }
    return getClientStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sample.use.proto.JavaRequest,
      sample.use.proto.JavaResponse> getServerStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serverStreaming",
      requestType = sample.use.proto.JavaRequest.class,
      responseType = sample.use.proto.JavaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<sample.use.proto.JavaRequest,
      sample.use.proto.JavaResponse> getServerStreamingMethod() {
    io.grpc.MethodDescriptor<sample.use.proto.JavaRequest, sample.use.proto.JavaResponse> getServerStreamingMethod;
    if ((getServerStreamingMethod = JavaGrpcServerGrpc.getServerStreamingMethod) == null) {
      synchronized (JavaGrpcServerGrpc.class) {
        if ((getServerStreamingMethod = JavaGrpcServerGrpc.getServerStreamingMethod) == null) {
          JavaGrpcServerGrpc.getServerStreamingMethod = getServerStreamingMethod =
              io.grpc.MethodDescriptor.<sample.use.proto.JavaRequest, sample.use.proto.JavaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "serverStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sample.use.proto.JavaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sample.use.proto.JavaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JavaGrpcServerMethodDescriptorSupplier("serverStreaming"))
              .build();
        }
      }
    }
    return getServerStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<sample.use.proto.JavaRequest,
      sample.use.proto.JavaResponse> getBiDirectionalStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "biDirectionalStreaming",
      requestType = sample.use.proto.JavaRequest.class,
      responseType = sample.use.proto.JavaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<sample.use.proto.JavaRequest,
      sample.use.proto.JavaResponse> getBiDirectionalStreamingMethod() {
    io.grpc.MethodDescriptor<sample.use.proto.JavaRequest, sample.use.proto.JavaResponse> getBiDirectionalStreamingMethod;
    if ((getBiDirectionalStreamingMethod = JavaGrpcServerGrpc.getBiDirectionalStreamingMethod) == null) {
      synchronized (JavaGrpcServerGrpc.class) {
        if ((getBiDirectionalStreamingMethod = JavaGrpcServerGrpc.getBiDirectionalStreamingMethod) == null) {
          JavaGrpcServerGrpc.getBiDirectionalStreamingMethod = getBiDirectionalStreamingMethod =
              io.grpc.MethodDescriptor.<sample.use.proto.JavaRequest, sample.use.proto.JavaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "biDirectionalStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sample.use.proto.JavaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sample.use.proto.JavaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new JavaGrpcServerMethodDescriptorSupplier("biDirectionalStreaming"))
              .build();
        }
      }
    }
    return getBiDirectionalStreamingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JavaGrpcServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JavaGrpcServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JavaGrpcServerStub>() {
        @java.lang.Override
        public JavaGrpcServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JavaGrpcServerStub(channel, callOptions);
        }
      };
    return JavaGrpcServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JavaGrpcServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JavaGrpcServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JavaGrpcServerBlockingStub>() {
        @java.lang.Override
        public JavaGrpcServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JavaGrpcServerBlockingStub(channel, callOptions);
        }
      };
    return JavaGrpcServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JavaGrpcServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JavaGrpcServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JavaGrpcServerFutureStub>() {
        @java.lang.Override
        public JavaGrpcServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JavaGrpcServerFutureStub(channel, callOptions);
        }
      };
    return JavaGrpcServerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class JavaGrpcServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void unaryCall(sample.use.proto.JavaRequest request,
        io.grpc.stub.StreamObserver<sample.use.proto.JavaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnaryCallMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<sample.use.proto.JavaRequest> clientStreaming(
        io.grpc.stub.StreamObserver<sample.use.proto.JavaResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getClientStreamingMethod(), responseObserver);
    }

    /**
     */
    public void serverStreaming(sample.use.proto.JavaRequest request,
        io.grpc.stub.StreamObserver<sample.use.proto.JavaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerStreamingMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<sample.use.proto.JavaRequest> biDirectionalStreaming(
        io.grpc.stub.StreamObserver<sample.use.proto.JavaResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBiDirectionalStreamingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUnaryCallMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                sample.use.proto.JavaRequest,
                sample.use.proto.JavaResponse>(
                  this, METHODID_UNARY_CALL)))
          .addMethod(
            getClientStreamingMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                sample.use.proto.JavaRequest,
                sample.use.proto.JavaResponse>(
                  this, METHODID_CLIENT_STREAMING)))
          .addMethod(
            getServerStreamingMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                sample.use.proto.JavaRequest,
                sample.use.proto.JavaResponse>(
                  this, METHODID_SERVER_STREAMING)))
          .addMethod(
            getBiDirectionalStreamingMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                sample.use.proto.JavaRequest,
                sample.use.proto.JavaResponse>(
                  this, METHODID_BI_DIRECTIONAL_STREAMING)))
          .build();
    }
  }

  /**
   */
  public static final class JavaGrpcServerStub extends io.grpc.stub.AbstractAsyncStub<JavaGrpcServerStub> {
    private JavaGrpcServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JavaGrpcServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JavaGrpcServerStub(channel, callOptions);
    }

    /**
     */
    public void unaryCall(sample.use.proto.JavaRequest request,
        io.grpc.stub.StreamObserver<sample.use.proto.JavaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnaryCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<sample.use.proto.JavaRequest> clientStreaming(
        io.grpc.stub.StreamObserver<sample.use.proto.JavaResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getClientStreamingMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void serverStreaming(sample.use.proto.JavaRequest request,
        io.grpc.stub.StreamObserver<sample.use.proto.JavaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getServerStreamingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<sample.use.proto.JavaRequest> biDirectionalStreaming(
        io.grpc.stub.StreamObserver<sample.use.proto.JavaResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getBiDirectionalStreamingMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class JavaGrpcServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<JavaGrpcServerBlockingStub> {
    private JavaGrpcServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JavaGrpcServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JavaGrpcServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public sample.use.proto.JavaResponse unaryCall(sample.use.proto.JavaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnaryCallMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<sample.use.proto.JavaResponse> serverStreaming(
        sample.use.proto.JavaRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getServerStreamingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JavaGrpcServerFutureStub extends io.grpc.stub.AbstractFutureStub<JavaGrpcServerFutureStub> {
    private JavaGrpcServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JavaGrpcServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JavaGrpcServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sample.use.proto.JavaResponse> unaryCall(
        sample.use.proto.JavaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnaryCallMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UNARY_CALL = 0;
  private static final int METHODID_SERVER_STREAMING = 1;
  private static final int METHODID_CLIENT_STREAMING = 2;
  private static final int METHODID_BI_DIRECTIONAL_STREAMING = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JavaGrpcServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JavaGrpcServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UNARY_CALL:
          serviceImpl.unaryCall((sample.use.proto.JavaRequest) request,
              (io.grpc.stub.StreamObserver<sample.use.proto.JavaResponse>) responseObserver);
          break;
        case METHODID_SERVER_STREAMING:
          serviceImpl.serverStreaming((sample.use.proto.JavaRequest) request,
              (io.grpc.stub.StreamObserver<sample.use.proto.JavaResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLIENT_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.clientStreaming(
              (io.grpc.stub.StreamObserver<sample.use.proto.JavaResponse>) responseObserver);
        case METHODID_BI_DIRECTIONAL_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.biDirectionalStreaming(
              (io.grpc.stub.StreamObserver<sample.use.proto.JavaResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class JavaGrpcServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JavaGrpcServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sample.use.proto.JavaGrpcServerBase.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JavaGrpcServer");
    }
  }

  private static final class JavaGrpcServerFileDescriptorSupplier
      extends JavaGrpcServerBaseDescriptorSupplier {
    JavaGrpcServerFileDescriptorSupplier() {}
  }

  private static final class JavaGrpcServerMethodDescriptorSupplier
      extends JavaGrpcServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JavaGrpcServerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (JavaGrpcServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JavaGrpcServerFileDescriptorSupplier())
              .addMethod(getUnaryCallMethod())
              .addMethod(getClientStreamingMethod())
              .addMethod(getServerStreamingMethod())
              .addMethod(getBiDirectionalStreamingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
