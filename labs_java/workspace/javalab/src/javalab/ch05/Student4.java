package javalab.ch05;


	// all student are hiving a ID and Name. it's can't update.
	// they are having korean and math class. class name and score are can't update.
	

public class Student4 {
	//member field. 
	private int studentID ;
	private String studentName ;
	
	private Subject korean;
	private Subject math;
	
	// ID and name
	// constructor - reset the member variable, act only 1.
	public Student4(int pStudentID, String pStudentName) {
		studentID = pStudentID;
		studentName = pStudentName;
	} // end Student4
	
	
	//"getter and setter" desing pattern
	public int getStudentID() {
		return studentID;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	
	public void setStudentName(String pStudentName) {
		studentName = pStudentName ;
	}
	
	
//	
	
	
	
	
	public void showInfo() {
		System.out.println("ID:" + studentID + 
				", name: " + studentName);
	} // end showInfo

	
	public void showInfos() {
		System.out.println("ID"+ studentID + "name" + studentName);
		System.out.println("korean"+ korean.subjectName + korean.scorePoint + ", math" +
				math.subjectName + math.scorePoint);
	}
	
	
	
	
	
// get and set
	public Subject getKorean() {
		return korean;
	}


	public void setKorean(Subject korean) {
		this.korean = korean;
	}


	public Subject getMath() {
		return math;
	}


	public void setMath(Subject math) {
		this.math = math;
	}
	
	
	
	
		
		
		
		

	
	
}
