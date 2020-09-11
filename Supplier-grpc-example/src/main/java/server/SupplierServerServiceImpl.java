package server;

import com.order.generated.stubs.SupplierDetails;
import com.order.generated.stubs.SupplierHistory;
import com.order.generated.stubs.SupplierHistoryResponse;
import com.order.generated.stubs.SupplierServiceGrpc;
public class SupplierServerServiceImpl extends SupplierServiceGrpc.SupplierServiceImplBase{
	
	@Override
	public void supplierHistory(com.order.generated.stubs.SupplierHistoryRequest request,
	        io.grpc.stub.StreamObserver<com.order.generated.stubs.SupplierHistoryResponse> responseObserver){
		
		 System.out.println("Request received for getting the supplier  details og account:"+request.getSupplierId());
	     SupplierDetails supplier = SupplierList.getSupplierInfo(request.getSupplierId());   
	  
	     SupplierHistory sph = SupplierHistory.newBuilder().setSupplier(SupplierDetails.newBuilder(supplier)).build();
	     SupplierHistoryResponse response = SupplierHistoryResponse.newBuilder().addSuppHist(sph).build();
	        responseObserver.onNext(response);
	        responseObserver.onCompleted();
	        System.out.println("Response sent successfully");
		
	}
	
}
