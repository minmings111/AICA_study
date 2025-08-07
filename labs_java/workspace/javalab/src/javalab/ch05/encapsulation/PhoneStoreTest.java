package javalab.ch05.encapsulation;

public class PhoneStoreTest {

	//when managing member variables by object, specify the this.
	public static void main(String[] args) {
		Phone phone = new Phone("iphone", 1000000);
		Phone phone1 = new Phone("galuxy", 1000000);
		
		Customer  customer = new Customer("honggildong", 1000000000);
		PhoneStore store = new PhoneStore("store1", phone);
		
		//
		customer.buyPhone(store);
		
		
		
		
		
	}

}
