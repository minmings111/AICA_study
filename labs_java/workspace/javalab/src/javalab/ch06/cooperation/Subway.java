package javalab.ch06.cooperation;

public class Subway {
	// member variable
	private int lineNumber;

	private int passengerCount;
	private int money;
	
	//
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
		this.passengerCount = 0;
		this.money = 0;
	}

	//get
	public int getLineNumber() {
		return lineNumber;
	}

	public int getPassengerCount() {
		return passengerCount;
	}
	
	public int getMoney() {
		return money;
	}
	
	//
	
	@Override
	public String toString() {
		return "Subway [lineNumber=" + lineNumber + ", passengerCount=" + passengerCount + ", money=" + money + "]";
	}

	public void getIn() {
		++this.passengerCount;
		this.money += 1000;
		
		System.out.println("subway getIn: " + this.toString());
		
	}
	
	public void getOut() {
		--this.passengerCount;
		
		System.out.println("subway getOut: " + this.toString());
		
	}
	
	//over
	public void getIn(Student stud) {
		++this.passengerCount;
		this.money += 800;
		
		stud.withdraw(800);
		
		System.out.println("subway getIn: " + this.toString());
		System.out.println("subway getIn: " + stud.toString());
		
	}
	
	public void getOut(Student stud) {
		--this.passengerCount;
		
		System.out.println(stud.toString());
	}
	
	
	
	

}
