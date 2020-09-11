package client;

import java.util.ArrayList;
import java.util.List;

import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.options.PipelineOptionsFactory;

import com.order.generated.stubs.SupplierHistory;
import com.order.generated.stubs.SupplierHistoryRequest;
import com.order.generated.stubs.SupplierHistoryResponse;
import com.order.generated.stubs.SupplierServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;

public class PipelineMain {

	public static void main(String[] args) {

		ManagedChannel channel=SupplierClient.getChannelInstance();
        SupplierServiceGrpc.SupplierServiceBlockingStub stub= SupplierServiceGrpc.newBlockingStub(channel);
        Pipeline pipeline = Pipeline.create(PipelineOptionsFactory.fromArgs().withValidation().create());
         getUserPurchaseBehaviour(stub,pipeline);
	}
	
	public static void getUserPurchaseBehaviour(SupplierServiceGrpc.SupplierServiceBlockingStub stub, Pipeline pipeline){
        System.out.println("Sending request to server for getting user details");
        try {
            SupplierHistoryResponse response=stub.supplierHistory(SupplierHistoryRequest.newBuilder().setSupplierId("103").build());
            List<SupplierHistory> sph= new ArrayList<>();
            sph= response.getSuppHistList();
            System.out.println("user purhase history:"+"\n"+sph);
        }catch (StatusRuntimeException exception){
            System.out.println("Exception occurred while getting the response from server, reason: "+ exception.getMessage());
        }catch (Exception ex){
            System.out.println("Exception occurred "+ex.getMessage());
        }
    }

}
