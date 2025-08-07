package javalab.ch05;

public class Student1 {
	
	int studentID ;
	String studentName ;
	
	// using basic. old...
	String koreanName ;
	int koreanScore ;
	String mathName ;
	int mathScore ;
	
//	using subject. the latest way
	Subject korean;
	Subject math;
	
	
	@Override
	public String toString() {
		return "Student1 [studentID=" + studentID + ", studentName=" + studentName + ", koreanName=" + koreanName
				+ ", koreanScore=" + koreanScore + ", mathName=" + mathName + ", mathScore=" + mathScore + ", korean="
				+ korean + ", math=" + math + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
