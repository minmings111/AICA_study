package javalab.ch13;

public class MyNumberTest {

	// lambda method can have only one retrospection method
	public static void main(String[] args) {
		MyNumber max = (x, y) -> (x >= y) ? x : y   ;
		System.out.println(max.getMax(10, 20));
		
		showResult(max);
		
		MyNumber add = addNumber();
		System.out.println(add.getMax(10, 20));
	}
	
	public static void showResult(MyNumber pObj) {
		System.out.println(pObj.getMax(1, 2));
	}
	
	
	public static MyNumber addNumber() {
		return (x, y) -> x + y;
	}
	
	
	
	
	
	
	
}





