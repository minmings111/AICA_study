package javalab.ch13;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		List<TravelCustomer> customerList = new ArrayList<>();
		
		customerList.add(new TravelCustomer("이순신", 40, 100));
		customerList.add(new TravelCustomer("김유신", 20, 100));
		customerList.add(new TravelCustomer("홍길동", 13, 50));
		//
		System.out.println("====print customer name list=====");
		customerList.stream()
			.map(c -> c.getName())
			.forEach(s -> System.out.println(s));
		//
		System.out.println("print total travel coast");
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(total + "won");
		//
		System.out.println("print customer age list of over than 20");
		customerList.stream()
			.filter(c -> c.getAge() >= 20)
			.map(c -> c.getName())
			.sorted()
			.forEach(s -> System.out.println(s));
		
		

	}

}
