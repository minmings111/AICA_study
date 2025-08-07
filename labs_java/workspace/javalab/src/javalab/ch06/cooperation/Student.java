package javalab.ch06.cooperation;

public class Student {
	
	private String studentName;
	private int grade;
	private int money;
	
	private int studentNo; // instance variable
	private static int gsID; // global static ID // class variable
	
	
	public Student(String studentName, int grade, int money) {
		this.studentName = studentName;
		this.grade = grade;
		this.money = money;
		
		this.studentNo = ++gsID; 
	}
	
	public int getStudentNo() {
		return studentNo;
	}

	
	
	
	public void depoist(int amount) {
		this.money += amount;
	}
	
	public void withdraw(int amount) {
		this.money -= amount;
	}



	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", grade=" + grade + ", money=" + money + ", studentNo="
				+ studentNo + "]";
	}


	
	
	
	
	
	
	
	
	
	
}
