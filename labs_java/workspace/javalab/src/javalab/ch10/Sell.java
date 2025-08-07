package javalab.ch10;

public interface Sell {
	void sell();
	
	default void order() {
		System.out.println("order to sell");
	}
	
	
	
}
