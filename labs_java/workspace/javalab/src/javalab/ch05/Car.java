package javalab.ch05;

/* This is "Class Diagram".
 * Practice make class diagram.
 * 
 * -----------
 * Car
 * 
 * 
 * -----------
 * Speed | Status (attribute)
 * 
 * -----------
 * 
 * acceleration | State change function(method, member function)
 * deceleration |
 * 
 * 
 * 
 * 
 */

// blueprint

public class Car {
	int speed = 0;
	
	public void upSpeed(int amount) {
		speed += amount;
		System.out.println(speed);
	}

	public void downSpeed(int amount) {
		speed -= amount;
		System.out.println(speed);
	}

	
	
	
	
} // end. public class Car
