package javalab.ch04;

public class IfExample {

	public static void main(String[] args) {
		
		int age = 2;
		
		if (age >= 8) {
			System.out.println("The kid have to go to School");
		}
		else {
			System.out.println("The Kid does not go to School. ");
		}
		//
		age = 9;
		int charge ;
		
		
		
		if (age < 8) {
			charge = 1000;
			System.out.println("preschool child");
		}
		else if (age < 14) {
			charge = 2000;
			System.out.println("elementary school student");
		}
		else if (age < 20) {
			charge = 2500;
			System.out.println("middle school or high school student");
		}
		else {
			charge = 3000;
			System.out.println("adult");
		}
		
		System.out.println("Your charege is "+charge+ ".");
		System.out.println("Your charege is "+charge+charge+ ".");
		System.out.println(charge+charge);
		// 변수는 나이, 가격. 가격은 나이에 의존하여 변동.
		// 따라서 if문에 조건은 나이로 설정하고, 
		// if문이 참일 경우, 작동하는 내용 안에 가격을 설정.
		//               출력되는 안내문구 작성.
		// if문의 거짓일 경우, 맞는 조건을 찾을 때까지 else if를 통과.
		// 모든 조건에 거짓일 경우, else문 들어감.
		
		// 나이가 8살 미만: 가격은 1000, 취학 전 아동입니다 출력
		// 나이가 14살 미만: 가격은 2000, 초등학교 아동입니다 출력.
		
		
		//
		
		
		
		
		
		
	}

}
