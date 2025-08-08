package app.labs.ex03.di03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {
	
	@Autowired
//	IHelloService helloService; // Bean으로 등록된 클래스 객체를 주입 - type 기반
	IHelloService niceService; // id명과 동일하게 지정.
	
	public void hello(String name) {
//		System.out.println("HelloController:" + helloService.sayHello(name));
		System.out.println("HelloController: " + niceService.sayHello(name));
	}
	
	
}
