package client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SupplierClient {

	 public static ManagedChannel getChannelInstance(){
	        System.out.println("Eastablishing connection with server");
	        ManagedChannel channel = null;
	        try {
	            channel = ManagedChannelBuilder.forAddress("localhost", 9095)
	                    .usePlaintext()
	                    .build();
	        }catch (Exception ex){
	            System.out.println("Exception occurred while establishing connection"+ex.getMessage());
	        }
	        return channel;
	    }
}
