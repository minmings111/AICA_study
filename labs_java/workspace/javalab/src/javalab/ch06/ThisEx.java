package javalab.ch06;

// When declaring two or more classes in one source code, 
// the access modifier A must be 1.
class BirthDay{
	int day;
	int month;
	int year;
	
	// Object address value 
	// when an object is created with the "new" keyword
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this); // print address of this
	}
	
	
}

class Person{
	String name;
	int age;
	
	public Person() {
		this("no name", 1); // 	using constructor overloading.
	}
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
	
}





public class ThisEx {

	public static void main(String[] args) {
		BirthDay bDay = new BirthDay();
		bDay.setYear(2000);
		System.out.println(bDay);
		bDay.printThis();

		BirthDay bDay1 = new BirthDay();
		System.out.println(bDay1);
		bDay1.printThis();
		
		//
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		noName.printThis();
		
	}

}
