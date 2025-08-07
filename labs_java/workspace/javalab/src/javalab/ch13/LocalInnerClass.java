package javalab.ch13;

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {
		int num = 100;
		// Runnable is functional interface.
		// local inner class- assign in method inner
		// we needed class to make for the "run()" method. so we make class
		//         "          use        "               . so we make instance.            
		class MyRunnable implements Runnable {
			
			int localNum = 10;
			
			@Override
			public void run() {
//				num = 200;  // can't redefine.
//				i = 100;
				System.out.println("i= " + i);
			}	
		} // --MyRunnable
		
		
		return new MyRunnable();  //return the address
		
	}
}

public class LocalInnerClass {
	public static void main(String[] args) {
		
		Outer out = new Outer();
		
		Runnable runner = out.getRunnable(10);
		runner.run();
		
		
		
		
		
		
		
		
	}
}
