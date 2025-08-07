package javalab.ch06.cooperation;

public class CooperationTest {

	// main method is called "entry point method"
	// static: Keywords used when specifying variables and 
	//         methods accessed through a class
	public static void main(String[] args) {
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		
		Subway line1 = new Subway(1);
		
		//
		bus100.getIn();
		bus100.getOut();
		
		line1.getIn();
		line1.getOut();
		
		bus200.getIn();
		bus200.getOut();
		
		//
		Student stud1 = new Student("pp1", 1, 10000);
		System.out.println(stud1.toString());
		
		Student stud2 = new Student("pp2", 1, 20000);
		System.out.println(stud2.toString());
		
		//
		bus100.getIn(stud1);
		bus100.getIn(stud2);

		bus100.getOut(stud1);
		
		line1.getIn(stud1);
		line1.getOut(stud1);
		
		
		
	}

}
