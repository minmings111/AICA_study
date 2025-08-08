package app.labs.ex03.di01;

public class HelloController {
	// 의존성 설정
	// 1. using member field 
//	private IHelloService helloService = new HelloService();
//	
//	public void hello(String name) {
//		System.out.println("HelloController:" + helloService.sayHello(name));
//	} // hello
	
	// 2. using Constructor
	private IHelloService helloService;
	public HelloController(IHelloService helloService) {
		this.helloService = helloService;
	}
	
	
	// 2) using Setter
	public HelloController() {}
	
	public void setHelloService(IHelloService helloService) {
		this.helloService = helloService;
	}
	
	public void hello(String name) {
		System.out.println("HelloController:" + helloService.sayHello(name));
	}
	
	
	
	
	
	
}
