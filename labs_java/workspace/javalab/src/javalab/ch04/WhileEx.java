package javalab.ch04;

// when change the class name,
// class was make with STS. So if change with STS.
public class WhileEx {

	public static void main(String[] args) {
		// get the sum 1~10 and print.

		int num = 1;
		int sum = 0;
		
		// Check the condition first. 
		//It cannot guarantee that the code in the block will be executed.
		while(num <= 10) {
			sum += num ;
			++num ;
		} //end while
		
		System.out.println("The SUM of 1~10 is " + sum +".");
		
		
		// Do - while
		// Check the condition later. 
		// It ensures that the code within the block is executed at least once.		
		num = 1;
		sum = 0;
		
		do {
			sum += num;
			num++;
		} while (num <= 10);
		
		System.out.println("The SUM of 1~10 is " + sum +".");
		
		
		

	
	
	
	
	}

}
