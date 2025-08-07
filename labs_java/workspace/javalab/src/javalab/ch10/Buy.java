package javalab.ch10;

public interface Buy {
	void buy();
	
	
	default void order() {
		System.out.println("order to buy");
	}
	
	
}
