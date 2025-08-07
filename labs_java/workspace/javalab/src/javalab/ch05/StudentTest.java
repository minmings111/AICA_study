package javalab.ch05;

public class StudentTest {

	public static void main(String[] args) {
		// student1
		Student student1 = new Student();
		student1.studentName = "HongGilDong";
		System.out.println(student1.getStudentName());
		// student2
		Student student2 = new Student();
		student2.studentName = "LeeSunSin";
		System.out.println(student2.getStudentName());

		//
		Student student3 = new Student();
		student3.studentName = "GoGilDong";
		System.out.println(student3.getStudentName());

		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		
		
	}

}
