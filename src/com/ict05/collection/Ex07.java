package com.ict05.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ex07 {
	public static void main(String[] args) {
		//큐 인터페이스를 구현한 클래스 : LinkedList
		//선입선출
		LinkedList<String> linkedList = new LinkedList<String>();
		//추가,삽입
		linkedList.add("박찬호");
		linkedList.offer("박세리");
		linkedList.add("김미현");
		System.out.println(linkedList);
		
		linkedList.addFirst("김광현");
		System.out.println(linkedList);
		
		linkedList.offerFirst("둘리");
		System.out.println(linkedList);
		
		if(linkedList.contains("박세리")) {
			System.out.println(linkedList.indexOf("박세리"));
			System.out.println(linkedList.get(linkedList.indexOf("박세리")));
			System.out.println(linkedList.getFirst());
			System.out.println(linkedList.getLast());
		}
		System.out.println(linkedList.size()+"요소가 존재함");
		
		if(linkedList.contains("둘리")) {
			linkedList.set(linkedList.indexOf("둘리"), "이대호");
		}else {
			System.out.println("없음");
		}
		System.out.println(linkedList);
		
		//삭제 : remove, removeFirst. removeLast

		linkedList.removeFirst();
		System.out.println(linkedList);
		linkedList.removeLast();
		System.out.println(linkedList);
		System.out.println(linkedList.remove(1)+"님이 삭제되었습니다.");
		System.out.println(linkedList);
	}
}
