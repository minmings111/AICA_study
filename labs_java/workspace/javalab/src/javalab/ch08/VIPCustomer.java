package javalab.ch08;

public class VIPCustomer extends Customer {
	private double saleRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName); // called the parent class
		this.saleRatio = 0.1;
		this.agentID = agentID;
		bonusRatio = 0.05; 
		// bounusRatio is parent variable
		// so don't use "this"! because confused...
	}

	
	//
	public double getSaleRatio() {
		return saleRatio;
	}

	public int getAgentID() {
		return agentID;
	}
	
	
	//
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio;
		return price - (int)(price * this.saleRatio);
	}


	@Override
	public String toString() {
		return "VIPCustomer [saleRatio=" + saleRatio + ", agentID=" + agentID + ", bonusPoint=" + bonusPoint
				+ ", bonusRatio=" + bonusRatio + "]" + super.toString();
	}
	
	
	
	
	
}
