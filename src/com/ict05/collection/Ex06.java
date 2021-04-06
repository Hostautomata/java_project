package com.ict05.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex06 {
	public static void main(String[] args) {
		//
		//List 인터페이스를 구현한 클래스들 : Stack, ArrayList, Vector;
		//배열과 흡사한 구조이지만, 삽입,삭제,추가가 자유롭다.
		//크기를 미리 정하지 않아도 된다.
		
		
		//ArrayList(동기화 지원X) 와 Vector(동기화 지원, 동시접속)
		//나중에 멀티스레드를 배우면 알게됨.
		
		//Set은 순서가 없다. 중복X
		//list구조는 순서가 존재, 중복 가능
		
		
		ArrayList<String> list = new ArrayList<String>();
		//추가
		list.add("박찬호");
		list.add("류현진");
		list.add("손흥민");
		System.out.println(list);
		//삽입
		list.add(1, "추신수");
		System.out.println(list);
		
		
		
		Vector<String> vector = new Vector<>();
		//추가
		vector.add("둘리");
		vector.add("도우너");
		vector.addElement("또치");
		System.out.println(vector);
		
		//삽입
		vector.add(2, "희동이");
		System.out.println(vector);
		
		if(list.contains("손흥민")) {
			System.out.println(list.indexOf("손흥민")+1+"번째 위치");//객체로 위치값 검색
			System.out.println(list.get(3));//위치값으로 객체 검색
			System.out.println(list.get(list.indexOf("손흥민")));
			
		}else {
			System.out.println("존재하지 않습니다.");
		}
		System.out.println("총 "+list.size()+"개의 요소가 존재한다.");
		
		//치환 : set
		list.set(3, "이대호");
		System.out.println(list);
		
		if(list.contains("추신수")) {
			list.set(list.indexOf("추신수"), "이종범");
		}else {
			System.out.println("없음");
		}
		System.out.println(list);
		
		for (String k : list) {
			System.out.println(k);
		}
		System.out.println("============");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s1 = (String) it.next();
			System.out.println(s1);
		}
		
	}
}
