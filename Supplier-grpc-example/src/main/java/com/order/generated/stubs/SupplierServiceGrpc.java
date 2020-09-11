package com.order.generated.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: supplier.proto")
public final class SupplierServiceGrpc {

  private SupplierServiceGrpc() {}

  public static final String SERVICE_NAME = "SupplierService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.order.generated.stubs.SupplierHistoryRequest,
      com.order.generated.stubs.SupplierHistoryResponse> getSupplierHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SupplierHistory",
      requestType = com.order.generated.stubs.SupplierHistoryRequest.class,
      responseType = com.order.generated.stubs.SupplierHistoryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.order.generated.stubs.SupplierHistoryRequest,
      com.order.generated.stubs.SupplierHistoryResponse> getSupplierHistoryMethod() {
    io.grpc.MethodDescriptor<com.order.generated.stubs.SupplierHistoryRequest, com.order.generated.stubs.SupplierHistoryResponse> getSupplierHistoryMethod;
    if ((getSupplierHistoryMethod = SupplierServiceGrpc.getSupplierHistoryMethod) == null) {
      synchronized (SupplierServiceGrpc.class) {
        if ((getSupplierHistoryMethod = SupplierServiceGrpc.getSupplierHistoryMethod) == null) {
          SupplierServiceGrpc.getSupplierHistoryMethod = getSupplierHistoryMethod = 
              io.grpc.MethodDescriptor.<com.order.generated.stubs.SupplierHistoryRequest, com.order.generated.stubs.SupplierHistoryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SupplierService", "SupplierHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.order.generated.stubs.SupplierHistoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.order.generated.stubs.SupplierHistoryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new SupplierServiceMethodDescriptorSupplier("SupplierHistory"))
                  .build();
          }
        }
     }
     return getSupplierHistoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SupplierServiceStub newStub(io.grpc.Channel channel) {
    return new SupplierServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SupplierServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SupplierServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SupplierServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SupplierServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SupplierServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void supplierHistory(com.order.generated.stubs.SupplierHistoryRequest request,
        io.grpc.stub.StreamObserver<com.order.generated.stubs.SupplierHistoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSupplierHistoryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSupplierHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.order.generated.stubs.SupplierHistoryRequest,
                com.order.generated.stubs.SupplierHistoryResponse>(
                  this, METHODID_SUPPLIER_HISTORY)))
          .build();
    }
  }

  /**
   */
  public static final class SupplierServiceStub extends io.grpc.stub.AbstractStub<SupplierServiceStub> {
    private SupplierServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SupplierServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SupplierServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SupplierServiceStub(channel, callOptions);
    }

    /**
     */
    public void supplierHistory(com.order.generated.stubs.SupplierHistoryRequest request,
        io.grpc.stub.StreamObserver<com.order.generated.stubs.SupplierHistoryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSupplierHistoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SupplierServiceBlockingStub extends io.grpc.stub.AbstractStub<SupplierServiceBlockingStub> {
    private SupplierServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SupplierServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SupplierServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SupplierServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.order.generated.stubs.SupplierHistoryResponse supplierHistory(com.order.generated.stubs.SupplierHistoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getSupplierHistoryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SupplierServiceFutureStub extends io.grpc.stub.AbstractStub<SupplierServiceFutureStub> {
    private SupplierServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SupplierServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SupplierServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SupplierServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.order.generated.stubs.SupplierHistoryResponse> supplierHistory(
        com.order.generated.stubs.SupplierHistoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSupplierHistoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUPPLIER_HISTORY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SupplierServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SupplierServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUPPLIER_HISTORY:
          serviceImpl.supplierHistory((com.order.generated.stubs.SupplierHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.order.generated.stubs.SupplierHistoryResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SupplierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SupplierServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.order.generated.stubs.Supplier.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SupplierService");
    }
  }

  private static final class SupplierServiceFileDescriptorSupplier
      extends SupplierServiceBaseDescriptorSupplier {
    SupplierServiceFileDescriptorSupplier() {}
  }

  private static final class SupplierServiceMethodDescriptorSupplier
      extends SupplierServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SupplierServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SupplierServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SupplierServiceFileDescriptorSupplier())
              .addMethod(getSupplierHistoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
