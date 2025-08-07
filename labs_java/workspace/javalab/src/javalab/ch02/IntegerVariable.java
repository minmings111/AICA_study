package javalab.ch02;

import java.math.BigInteger;

public class IntegerVariable {
/*
 * 
 * integer type
 * 
 */
	public static void main(String[] args) {
		
		byte bVal = 20;
		short sVal = 10;
		
		System.out.println(bVal + sVal);

		// int num0 = 12345678900; // Range exceeding integer
		long numLong = 12345678900L; // literal about Long
		
		//
		int num10 = 10;
		int num20 = 20;
		System.out.println(num10 + num20);
		//
		System.out.println(10+20);
		
//		maximum in long
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MAX_VALUE + 1);

//		
		BigInteger c = new BigInteger("100000000000000000000000000000000000000");
		BigInteger d = new BigInteger("1");
		BigInteger e = c.add(d);
		System.out.println(e.toString());
	}

}




