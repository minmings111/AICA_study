package javalab.ch02;

import java.math.BigInteger;

// change data type == explicit coercion
public class TypeConversion {

	public static void main(String[] args) {
		int iNum = 1000 ;
		// byte can get maximum "256", it called "overflow".
		// so if you change the data to byte from bigger than byte, you must check maximum the data.
		byte bNum = (byte)iNum ; // int -> byte
		
		
		System.out.println(iNum);
		System.out.println(bNum);
//
		
		double dNum = 3.14 ;
		int iNum2 = (int)dNum ; 
		
		System.out.println(dNum);
		System.out.println(iNum2);
		
//		print the result, sum "1.2" and "0.9F". 
//		variable name is "dNumq", "fNumq".
//		result name is "iNumq". and result type is "int".
		
		double dNumq = 1.2;
		float fNumq = 0.9F ;
		
		int iNumq = (int)(dNumq + fNumq) ;
//		int iNumq5 = (int) dNumq.add(fNumq) ; // add is can used in object method like list...
		int iNumq2 = (int)dNumq + (int)fNumq ; // wrong answer
		
		
		System.out.println(iNumq);
		System.out.println(iNumq2); // wrong answer
		
		
//		
		byte bNum1 = 10 ;
		int iNum1 = bNum1 ;
		System.out.println(bNum1);
		System.out.println(iNum1);
		
		int iNum5 = 20 ; 
		float fNum1 = iNum5;
		
		System.out.println(iNum5);
		System.out.println(fNum1);
		
		double dNum2; // basic type must need to assign value.
		dNum2 = fNum1 + iNum5; 
		System.out.println(dNum2); // double
		
		
	}

}

