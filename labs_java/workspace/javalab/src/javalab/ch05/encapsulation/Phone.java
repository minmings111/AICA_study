package javalab.ch05.encapsulation;

public class Phone {
	
	private String model ;
	private double price ;
	
	public Phone(String model, double price) {
		this.model = model ;
		this.price = price ;
	} // end Phone

	
	
	// get!
	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}
	
	
	
	
	

}
