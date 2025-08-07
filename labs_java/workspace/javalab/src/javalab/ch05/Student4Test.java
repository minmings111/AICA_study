package javalab.ch05;

public class Student4Test {

	public static void main(String[] args) {
		Student4 stud1 = new Student4(182647, "person1"); //using the constructor for immutable
		
		stud1.setStudentName("people1");
		//
		
		Subject korean = new Subject("korean", 95); // make the instance and pass the address to variable
		stud1.setKorean(korean); // pass the address of variable to parameter
		stud1.setMath(new Subject("math", 95)) ; // pass the object address
		
		
		stud1.showInfo();
		

		
		
		
		
		
		
		
		
	}

}
