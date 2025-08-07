package javalab.ch09;

public class ComputerTest {

	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		DeskTop desktop = new DeskTop();
		
//		notebook.display();
//		notebook.typing();
//		
//		desktop.display();
//		desktop.typing();
		
		//called under display class
		display(notebook);
		display(desktop);
		
	}
	
	// class name is display.
	public static void display(Computer computer) {
		computer.display();
		computer.typing();
	}
	
	
	
}
