package javalab.ch13;

class Outer2{
		
	Runnable getRunnable(int i) {
		int num = 100;
		
	// to make anonymous interface
		return new Runnable() {
			public void run() {
				System.out.println("i= " + i);
				System.out.println("num= " + num);
			}
		};
	}
	
	
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("anonymous class variable");
		}
	};
}


public class AnonymousInnerClass {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		
		Runnable runner = out.getRunnable(100);
		runner.run();
		
		out.runner.run();
		
		
		

	}

}

