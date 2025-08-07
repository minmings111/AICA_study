package javalab.ch06.singleton;


// 1. singleton DP
// constructor private : can't use constructor in outer
// get 
//

public class Company {
	
	// class member variable for using class method
	private static Company instance = new Company();
	private Company() {}
	
	// constructor is private. 
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
	
	
	
	
}
