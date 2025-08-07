package javalab.ch08;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		cust1.calcPrice(1000);
		System.out.println(cust1.toString());
		
		Customer cust2 = new Customer(10000, "MJ");
		cust2.calcPrice(10000);
		System.out.println(cust2.toString());
		
		//
		VIPCustomer vip1 = new VIPCustomer(200000, "JM", 12345);
		vip1.calcPrice(1000000);
		System.out.println(vip1.toString());
		
		
		// up casting(children -> parent)
		// Check if the child's structure satisfies(SPEC) the parent's structure.
		// check only signature.
		// so can use only Customer's function.
		Customer vip3 = new VIPCustomer(20002, "VIPcust3", 12345);
		vip3.calcPrice(1000000);
		System.out.println(vip3.toString());
		// vip3.getAgentID(); // <- can't use. because child's function..
		
		//down casting
		VIPCustomer vip4 = (VIPCustomer)vip3;
		System.out.println(vip4.getAgentID());
		
		//parent
//		Customer vip5 = new Customer();
//		
//		//child
		VIPCustomer vip6 = new VIPCustomer(20002, "VIPcust6", 12345);
//		
//		
		// up casting
		Customer vip5 = (Customer) vip6;
//		System.out.println(vip5.getAgentID());
		
		

	}

}
