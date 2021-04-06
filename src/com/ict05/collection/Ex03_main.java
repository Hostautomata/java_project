package com.ict05.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03 coffee = new Ex03();
		//setter를 이용해 이름과 값을 정함.  
		coffee.setName("커피음료");
		coffee.setPrice(2500);
		
		//생성자를 이용해 이름과 값을 정하기 
		Ex03 cola = new Ex03("콜라",1600);
		Ex03 juice = new Ex03("과일음료",2300);
		
		//객체들을 저장하고 관리하는 방법 : 배열, 컬렉션
		//1. 배열
		Ex03[] arr = new Ex03[3];
		arr[0] = coffee;
		arr[1] = cola;
		arr[2] = juice;
		
		//이름과 가격 꺼내기
		for (Ex03 k : arr) {
			System.out.println("이름 : "+ k.getName());
			System.out.println("가격 : "+ k.getPrice());
		}
		System.out.println("=======");
		
		//2. 컬렉션
		HashSet<Ex03> h1 = new HashSet<>();
		h1.add(coffee);
		h1.add(cola);
		h1.add(juice);
		//배열과 다르게 여기서 더 추가할 수 있음.
		h1.add(new Ex03("ion",1500));
		//꺼내기
		//1. 개선된 for문
		for (Ex03 k : h1) {
			System.out.println("이름 : "+ k.getName());
			System.out.println("가격 : "+ k.getPrice());
		}
		System.out.println("=======");
		
		//2. iterator()
		Iterator<Ex03> it = h1.iterator();
		while (it.hasNext()) {
			Ex03 s1 = (Ex03) it.next();
			System.out.println("이름 : "+s1.getName());
			System.out.println("가격 : "+s1.getPrice());
		}
		//포함여부 : contains() 꽤 자주쓰인다.
		if(h1.contains(coffee)) {
			System.out.println("있다.");
		}else {
			System.out.println("없다.");
		}
		//갯수 : size
		System.out.println(h1.size());
		
		//삭제 : remove(Object o), clear()
		//컬렉안에 해당 객체가 있으면 삭제,
		//없으면 삭제 안함.
		//cola가 있으면 삭제하시오
		if(h1.contains(cola)) {
			h1.remove(cola);
			System.out.println(cola.getName()+" 삭제");
		}else {
			System.out.println("존재하지 않습니다.");
		}
		System.out.println("===================");
		
		//비었는지 안비었는지
		if(h1.isEmpty()) {
			System.out.println("비어있다.");
		}else {
			System.out.println("비어있지 않다.");
		}
		System.out.println("===================");
		
		//전체삭제 후
		h1.clear();
		if(h1.isEmpty()) {
			System.out.println("비어있다.");
		}else {
			System.out.println("비어있지 않다.");
		}
		
		//Lotto
		//Set은 중복을 허용하지 않으니 랜덤으로 6자리 수를 뽑고 Set에 넣는다. 
		//-> 중복을 허용하지 않기 때문에 중복이 나오면 false가 나온다.
		//
	}
}
