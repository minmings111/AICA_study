package javalab.ch02;

public class TypeInference {

	public static void main(String[] args) {
		int i = 10;
		var j = 10.1; // 자료형 추론 double
		var str = "hello"; // 자료형 추론 string
		
		System.out.println(i); // sysout + [ctrl] + [space]);
		System.out.println(j);
		System.out.println(str);

		str = "test";
//		str = 1 ;
		
		
//		global variable
		int a = 1;
//		int a = 2;
		int b = 2;
		
		
//		
		{
//			global variable in block(Scope)
			a = 2;
			b = 3;
			
//			local variable in block.
//			JAVA want used local variable to user.
//			block을 탈출하는 순간에 메모리(스택:기본형)에서 제거됨.
			int c = 4;
		}
//		System.out.println(c); error because c is local variable.
		
		System.out.println(a);
		System.out.println(b);
		
//		constant is can't amend.

		final double PI = 3.14; // constant name spelling is all upper
		
		
		int aA = 3;
		
		
		
		
		
	}

}

