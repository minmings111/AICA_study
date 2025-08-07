package javalab.ch05;

public class Student1Test {
	
	public static void main(String[] args) {
		
		
		// basic
		Student1 stud1 = new Student1();
		stud1.koreanName = "Korean" ;
		stud1.koreanScore = 90;
		stud1.mathName = "math";
		stud1.mathScore = 90;
		
		// stud1.koreanScore = 100 ; // this is side effect!
		System.out.println(stud1.toString());
		
		
		// reference type(class): too long type... 
		Subject korean = new Subject();
		korean.subjectName = "Korean" ;
		korean.scorePoint = 90;
		Subject math = new Subject();
		math.subjectName = "math";
		math.scorePoint = 90;
		
		
		
		
		
//		stud1.korean = korean;
//		stud1.math = math;
//		
		
		
		// reference type(class): short type = constructor type
		Subject korean1 = new Subject("korean", 90);
		stud1.korean = korean1 ; //	Pass the object address
		Subject math1 = new Subject("math", 90);
		stud1.math = math1;
		
		
		
	}

}
