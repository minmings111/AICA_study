package javalab.ch09;

public abstract class RunningRace {
	private void ready() {
		System.out.println("ready~");
	}
	
	protected abstract void run();

	private void finish() {
		System.out.println("finish line");
	}
	
	// template method DP
	// final method : can't override, 
	//              : cna't change the method sequence
	final public void race() {
		ready();
		run();
		finish();
	}
	
}
