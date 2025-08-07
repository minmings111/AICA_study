package javalab.ch10;


// compiler say.. order method is two. what the fuck?
// so we need to override.
public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("try to Sell");

	}

	@Override
	public void buy() {
		System.out.println("try to Buy");
	}
	
	@Override
	public void order() {
		System.out.println("customer sell order");
	}

}
