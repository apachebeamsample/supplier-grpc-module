package server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class SupplierServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Strating server");
	        try {
	            Server server = ServerBuilder.forPort(9095)
	                   .addService(new SupplierServerServiceImpl())
	                    .build();
	            server.start();
	            System.out.println("Server started at port:" + server.getPort());

	            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
	                System.out.println("Received Shutdown Request");
	                server.shutdown();
	                System.out.println("Successfully stopped the server");
	            }));

	            server.awaitTermination();
	        }catch (IOException | IllegalStateException exception){
	            System.out.println("Exception occurred while starting the server." +exception.getMessage());}
	        catch (InterruptedException exception){
	            System.out.println("Exception occurred while waiting for server to be terminated." +exception.getMessage());
	        }catch (Exception ex){
	            System.out.println("Exception occurred:"+ex.getMessage());
	        }

	    }

	

}
