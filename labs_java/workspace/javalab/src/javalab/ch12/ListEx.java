package javalab.ch12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// List
// 중복허용, 입력순서유지
// 인덱스, 순차적인 저장
public class ListEx {

	public static void main(String[] args) {

		
		// list interface
		System.out.println("===== ArrayList ======");
		
		List<Integer> array_list = new ArrayList<>();
	
		array_list.add(1);  // 등록
		array_list.add(2);
		array_list.add(3);
		array_list.add(4);
		array_list.add(5);
		
		for(Integer i : array_list) {
			System.out.println(i);
		}
		
		System.out.println(array_list.size());
		System.out.println(array_list.indexOf(3));
		System.out.println(array_list.indexOf(7)); // 없는 요소는 -1을 반환
		
		array_list.set(2, 7); // index 2가 7로 변경
		array_list.remove(3); // index 3 제거
	
		for(Integer i : array_list) {
			System.out.println(i);
		}
		
		array_list.clear();
			
		System.out.println("===== LinkedList ======");
		
		List<Integer> link_list = new LinkedList<>();
	
		link_list.add(1);  // 등록
		link_list.add(2);
		link_list.add(3);
		link_list.add(4);
		link_list.add(5);
		
		
		
		
		
		for(Integer i : link_list) {
			System.out.println(i);
		}
		
		System.out.println(link_list.size());
		System.out.println(link_list.indexOf(3));
		System.out.println(link_list.indexOf(7)); // 없는 요소는 -1을 반환
		
		
		
		
		List<Integer> link_list2 = new LinkedList<>() {
			//Double bracket initialization - Using anonymous class
			// It is generated as many times as the anonymous user uses it.
		};
		link_list2.forEach((item) -> System.out.println(item));
		
		
		//set
		System.out.println("=====SET=====");
		
		Set<Integer> hashSet = new HashSet<>(); // ctrl + shift + O
		
		hashSet.add(1);  // 등록
		hashSet.add(3); 
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(3);
		hashSet.add(5);
		hashSet.add(4);
		
		for(Integer i : hashSet) {
			System.out.println(i);
		}
		
		System.out.println(hashSet.size());
		
		
		
		
	}

}
