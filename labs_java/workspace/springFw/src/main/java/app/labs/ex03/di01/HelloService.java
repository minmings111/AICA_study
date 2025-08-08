package app.labs.ex03.di01;

public class HelloService implements IHelloService {

	@Override
	public String sayHello(String name) {
		
		System.out.println("act HelloService.sayHello() method 실행");
		String message = "Hello~~~" + name;
		
		return message;
	}

}
