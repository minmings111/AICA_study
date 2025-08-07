package javalab.ch05;

public class Person {

	// member field.
	String name ;
	int height;
	double weight ;
	char gender ;
	boolean married ;
	
	// 2. basic constructor : If there no user constrotor, auto-generate
	//                    If there is a user constrotor, manually generate.
	public Person() {}
	
	// 3. user constructor
	public Person(String pName){
		name = pName;
	}
	
	// 1. user constructor : name, height, weight is essential
	public Person(String pName, int pHeight, double pWeight) {
		if (pHeight < 1)
			System.out.println("Height is cant not lowwer than 1.");
					
		name = pName ;
		height = pHeight ;
		weight = pWeight ;
		
		
		
		
	}

	
}
