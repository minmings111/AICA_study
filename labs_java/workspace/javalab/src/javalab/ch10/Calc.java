package javalab.ch10;

public interface Calc {
	// auto insert "final"
	double PI = 3.14; // must write UPPER
	int ERROR = -99999;
	
	
	// auto insert "public abstract"
	int add (int num1, int num2); // abstract method.
	int substract (int num1, int num2);
	int times (int num1, int num2);
	int divide (int num1, int num2);

}
