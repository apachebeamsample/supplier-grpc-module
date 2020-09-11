package server;

import java.util.HashMap;
import java.util.Map;

import com.order.generated.stubs.Address;
import com.order.generated.stubs.SupplierDetails;

public class SupplierList {

	public static SupplierDetails getSupplierInfo(String supplierId) {
		
		SupplierDetails supplier1 = SupplierDetails.newBuilder().setSupplierId("101").setSupplierName("Supplier1").addAddress(Address.newBuilder().setAddressType("Billing Address").setHouseNumber("#01").setPhone(12345).build()).addAddress(Address.newBuilder().setAddressType("Delivery Address").setHouseNumber("##01").setPhone(12345).build()).addAddress(Address.newBuilder().setAddressType("Shipping Address").setHouseNumber("###01").setPhone(99877).build()).build();
		SupplierDetails supplier2 = SupplierDetails.newBuilder().setSupplierId("102").setSupplierName("Supplier2").addAddress(Address.newBuilder().setAddressType("Billing Address").setHouseNumber("#02").setPhone(44222).build()).addAddress(Address.newBuilder().setAddressType("Delivery Address").setHouseNumber("##02").setPhone(67678).build()).addAddress(Address.newBuilder().setAddressType("Shipping Address").setHouseNumber("###02").setPhone(88766).build()).build();
		SupplierDetails supplier3 = SupplierDetails.newBuilder().setSupplierId("103").setSupplierName("Supplier3").addAddress(Address.newBuilder().setAddressType("Billing Address").setHouseNumber("#03").setPhone(90775).build()).addAddress(Address.newBuilder().setAddressType("Delivery Address").setHouseNumber("##03").setPhone(98765).build()).addAddress(Address.newBuilder().setAddressType("Shipping Address").setHouseNumber("###03").setPhone(11445).build()).build();
		SupplierDetails supplier5 = SupplierDetails.newBuilder().setSupplierId("105").setSupplierName("Supplier5").addAddress(Address.newBuilder().setAddressType("Billing Address").setHouseNumber("#05").setPhone(89776).build()).addAddress(Address.newBuilder().setAddressType("Delivery Address").setHouseNumber("##05").setPhone(87654).build()).addAddress(Address.newBuilder().setAddressType("Shipping Address").setHouseNumber("###04").setPhone(55432).build()).build();
		SupplierDetails supplier6 = SupplierDetails.newBuilder().setSupplierId("106").setSupplierName("Supplier6").addAddress(Address.newBuilder().setAddressType("Billing Address").setHouseNumber("#06").setPhone(98554).build()).addAddress(Address.newBuilder().setAddressType("Delivery Address").setHouseNumber("##06").setPhone(99855).build()).addAddress(Address.newBuilder().setAddressType("Shipping Address").setHouseNumber("###05").setPhone(22345).build()).build();
		SupplierDetails supplier7 = SupplierDetails.newBuilder().setSupplierId("107").setSupplierName("Supplier7").addAddress(Address.newBuilder().setAddressType("Billing Address").setHouseNumber("#07").setPhone(34521).build()).addAddress(Address.newBuilder().setAddressType("Delivery Address").setHouseNumber("##07").setPhone(14567).build()).addAddress(Address.newBuilder().setAddressType("Shipping Address").setHouseNumber("###06").setPhone(66543).build()).build();
		
		
		Map<String, SupplierDetails> userMap = new HashMap<>();
	    userMap.put("101",supplier1);
	    userMap.put("102",supplier2);
	    userMap.put("103",supplier3);
	    userMap.put("105",supplier5);
	    userMap.put("106",supplier6);
	    userMap.put("107",supplier7);
	    
	    SupplierDetails supplier= SupplierDetails.newBuilder().build();
	    if (null != userMap.get(supplierId))
	    	supplier= userMap.get(supplierId);

	    return supplier;
		
		
		
		
		
		
		
	}
}
