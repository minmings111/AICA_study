package javalab.ch08;

public class Customer {
	private int customerID;
	private String customerName;
	private String customerGrade;
	
	
	// protected!
	// Accessible from inherited classes
	// If inherited, it is accessible from other packages as well
	protected int bonusPoint; 
	protected double bonusRatio; 
	
	
	//constructor - general customer
	public Customer() {
		this.customerGrade = "SILVER";
		this.bonusPoint = 0;
		this.bonusRatio = 0.01;
		
		System.out.println("called the Customer() constructor");
	}

	//constructor - special customer
	public Customer(int customerID, String customerName) {
		this(); // get the upper's constructor
		this.customerID = customerID;
		this.customerName = customerName;
		
		System.out.println("called the Customer(ID, Name) constructor");
	}

	//get
	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}
	
	
	// change the status of bonusPoint
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio;
		return price;
	}
	
	//
	
	
	
	
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + "]";
	}
	
	
	
	
	
	

}
