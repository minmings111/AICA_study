package javalab.ch02;

public class TypeConversion2 {

	public static void main(String[] args) {
		
		int a = 1 ;
		int b = 2 ;
		System.out.println(a + b);
		
		char SingleChar = 'a' ; // char assign only single character
		String a1 = "1", b1 = "2" ; // multiple characters , String is class type.
		System.out.println(a1 + b1);
		
		// string's value save in heap, address save in stack.
//		number, character, logic's value, variable name are saving in stack.
//		int a2 = (int)a1 ; // error. because memory space is different.
//		int b2 = (int)b2 ; 
		
//		to stack space from heap space == called "unboxing"
		int a2 = Integer.parseInt(a1); // get value of a1's address
		int b2 = Integer.parseInt(b1);
		
		System.out.println(a2 + b2); // print "3" because a1, b2 is int.
		
//		to heap space from stack space == called "boxing"
		String s1 = String.valueOf(a2);
		String s2 = String.valueOf(b2);
		System.out.println(s1 + s2); // print"12"

	}

}



