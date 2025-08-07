package javalab.ch04;

import java.util.stream.IntStream;

public class ForEx {

	public static void main(String[] args) {
		
		// 
		int sum = 0;
		for (int i = 1 ; i < 11 ; i++) {
			// if a variable made in the FOR, 
			// it's a local variable.
			sum += i;
			System.out.println("i:" + i + ", sum: " + sum);
		}

		// the sum is using the FOR's OUTBLOCK.
		// that's the why the sum is made global variable.
		System.out.println("1~10's SUM is " + sum + ".");
		
		
		// multiplication table
		// variable name is "dan", "times". 
		
		for(int dan = 1; dan < 10; dan++) {
			for(int times = 1; times < 10; times++) {
				System.out.println(dan + "*" + times + "=" + (dan*times));
			} //end times
		} // end dan
		
		
		// print the odd numbers in 1~100
		int total = 0 ; 
		for(int i= 1; i <101; i++) {
			if(i % 2 == 0) {
				continue;
			}
			total += i;
		}

		System.out.println("SUM with odd numbers in 1~100: "+ total);
		
		
//		print the sum in 1~100, using BREAK with FOR and While
		int sum1 = 0;
		int num;
		
		for(num = 0; ; num++) {
			sum1 += num;
			if(sum1 >=100) {
				break;
			} // end if
		} // end for
		System.out.println("num: "+ num + ", sum: " + sum);
		
		
		
		
		//
		sum1 = 0;
		num = 0;
		
//		while(sum1 <= 100) {
//			num += sum1;				
//			}
//		System.out.println("num: "+ num + ", sum: " + sum1);
		
		while(sum1 <= 100) {
			++num;
			sum1 += num;
		}
		System.out.println("num: "+ num + ", sum: " + sum1);
	
//		
		System.out.println(IntStream.range(1,  11).sum());
		
		
		
		
		
		
		
		
	}

}
