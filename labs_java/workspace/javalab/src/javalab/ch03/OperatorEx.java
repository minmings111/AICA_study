package javalab.ch03;

public class OperatorEx {

	public static void main(String[] args) {
int num = 0 ;
		
		System.out.println(++num); // num = num + 1
		System.out.println(num++); // num = num . after num + 1
		System.out.println(num) ; 

		System.out.println(--num); // num = return "num - 1" 
		System.out.println(num--); // num = first return "num". after assign "num - 1"
		System.out.println(num) ; 
		
		// short circuit
		
		int num1 = 10;
		int i = 2 ;
		
		// AND
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10) ;
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		// OR
		value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10) ;
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		// Assignment Operators
		num1 += 2; // num1 = num1 + 2;
		System.out.println(num1);
		
		// Ternary operator
		int fatherAge = 45 ;
		int motherAge = 47 ;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F' ;
		
		System.out.println(ch);
		
		
		// Practice: 
		// Integer division. If 0 is entered in the denominator variable a, division is not performed.
		
		int a = 0, b = 3 ;
		int result = 0 ; 
		
		//1
		result = (a != 0) ? a/b : 0 ;
		System.out.println(result);
		
		//2
		if (a != 0) {
			result = b/a;
		}
		
		//3 bad code!
		boolean isCheck = (a != 0) && ((result = b /a) >= 0) ;
		
		int bitt = 7;
		bitt = bitt >> 1 ;
		System.out.println(bitt);
		
		
	}

}

