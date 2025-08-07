package javalab.ch05.encapsulation;

public class Customer {

	private String name ;
	private double budget ;
	
	public Customer(String name, double budget) {
		this.name = name;
		this.budget = budget;
	}

	public String getName() {
		return name;
	}

	public double getBudget() {
		return budget;
	}
	
	
	//
	public void buyPhone(PhoneStore store) {
		Phone phone = store.sellPhone("iphone", budget);
	
		if (phone != null) {
			System.out.println("customer: the phone perchase completed. ");
		}
		else {
			System.out.println("costomer: failed to purchase a phone");
		}
	}
	
	
	
	
}
