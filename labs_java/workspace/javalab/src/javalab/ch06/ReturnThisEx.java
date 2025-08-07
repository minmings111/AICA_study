package javalab.ch06;

class Student {
	private int id;
	private String name;
	private int grade;
	
	// get
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getGrade() {
		return grade;
	}
	
	// set
	public Student setId(int id) {
		this.id = id;
		return this;
	}
	public Student setName(String name) {
		this.name = name;
		return this;
	}
	public Student setGrade(int grade) {
		this.grade = grade;
		return this;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	

	
}






public class ReturnThisEx {

	public static void main(String[] args) {
		Student stud = new Student();
		stud.setId(13245)
			.setName("student1")
			.setGrade(1); // method chaining
		System.out.println(stud.toString());

	}

}
