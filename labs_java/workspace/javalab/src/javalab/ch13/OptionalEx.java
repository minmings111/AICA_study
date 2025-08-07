package javalab.ch13;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		List<TravelCustomer> customerList = new ArrayList<>();
		
		customerList.add(new TravelCustomer("이순신", 40, 100));
		customerList.add(new TravelCustomer("김유신", 20, 100));
		customerList.add(new TravelCustomer("홍길동", 13, 50));

		// search the name
		TravelCustomer cust = getCustomerByName("김유신", customerList);
		System.out.println(cust.toString());
		
		TravelCustomer cust1 = getCustomerByName("고길동", customerList);
		
		
		if(cust1 != null ) { //If the object exists, run the under code
		System.out.println(cust1.toString()); 
		}
		
		// optional -> using 'optional object(class)'
		usingOptional(customerList);
		
		
		
		
	}

	// 1. search the name(find name, customer list) 
	// -> return value is Object
	public static TravelCustomer getCustomerByName(String name, List<TravelCustomer> list) {
		for(TravelCustomer item:list) {
			if(name.equals(item.getName())) {
				return item;
			}
		}
		// NullPointerException : the object has no address.
		return null; // no customer objects that satisfy the search.
	}
	
	// 2. search the name(find name, customer list)
	// -> return value is Optional
	public static Optional <TravelCustomer> getCustomerByNameOptional(String name, List<TravelCustomer> list) {
		for(TravelCustomer item:list) {
			if(name.equals(item.getName())) {
				return Optional.of(item); // when object is not null
			}
		}
		
		return Optional.empty(); // the status is not exist.
	}
	
	public static TravelCustomer generateDefaultUserInfo() {
		return new TravelCustomer("Customer", 0, 0);
	} 
	
	// 3. Ex. apply variable Optional
	public static void usingOptional(List<TravelCustomer> list) {
		Optional<TravelCustomer> customerOptional = getCustomerByNameOptional("고길동", list);
		
		// ifPresent() : If the object exists
		customerOptional.ifPresent(c -> System.out.println("1. customer name: " + c.getName()));
		
		// isPresent() : return the boolean
		if (customerOptional.isPresent()) {
			System.out.println("2. customer name: " + customerOptional.get().getName());
		}
		else {
			System.out.println("2. the customer can't not search");
		}
		
		
		// orElse() : Specify default value if object does not exist
		
		TravelCustomer cust = customerOptional.orElse(new TravelCustomer("visiter", 0, 0));
		System.out.println(cust.getName());
	}
	
		//orElseGet(): If the object does not exist, 
		// return the default value.
//		TravelCustomer custComputed = customerOptional.orElseGet(() -> generateDefaultCustomer);
//		System.out.println("4. " +  custComputed.getName());
	
	
}
