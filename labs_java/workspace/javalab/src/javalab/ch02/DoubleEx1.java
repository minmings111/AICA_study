package javalab.ch02;

import java.math.BigDecimal;

public class DoubleEx1 {

	public static void main(String[] args) {
		double dnum = 3.14 ;
		float fnum = 3.14F ;
		
		System.out.println(dnum);
		System.out.println(fnum);		

//		error
		double dNum = 0.1 + 0.1 + 0.1;
		System.out.println(dNum);
		
//		
		BigDecimal dbNum = new BigDecimal("0.1");
		var dbNum1 = new BigDecimal("0.1"); // 자료형 추론
		
		BigDecimal result = dbNum.add(dbNum).add(dbNum);
		System.out.println(result);
		
//		
		
		
	}

}


