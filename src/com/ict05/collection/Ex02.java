package com.ict05.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		//Set 인터페이스를 상속받은 클래스 : HashSet,TreeSet
		//	- HashSet과 TreeSet의 사용 방법은 모두 같다.
		//	그러나 TreeSet은 내부에서 항상 오름 차순 정렬상태를 유지
		//	Set은 특정 기준으로 정렬을 할 수 없다.
		//  - Set은 둘다 중복이 안된다.(오류는 나지 않음)
		
		//컬렉션 생성
		//HashSet<제네닉 타입 = 객체타입 = 같은 클래스> 참조변수 = new HashSet<제네닉타입>();
		//HashSet<제네닉 타입 = 객체타입 = 같은 클래스> 참조변수 = new HashSet<>();
		HashSet<String> h1 = new HashSet<>();//문자열형 객체 모임
		HashSet<Integer> h2 = new HashSet<>();//정수형 객체 모임
		HashSet<Double> h3 = new HashSet<>();//실수형 객체 모임
		HashSet<Boolean> h4 = new HashSet<>();//논리형 객체 모임
		
		//h2(정수형)에 객체를 추가하는 방법
		//1. 기본 자료형 객체를 만들어서 넣기 = Boxing
		Integer k1 = new Integer(10);
		Integer k2 = new Integer("10");
		//2. 기본 자료형을 그냥 넣는다.
		//	기본 자료형이 자동으로 객체가 되어서(AutoBoxing) 넣어진다.
		
		//h2 컬렉션에 객체 넣기(add(요소))
		h2.add(k1);//				true
		h2.add(k2);//				false(중복 허용X)
		h2.add(10);//방법2  			false(중복 허용X)
		h2.add(new Integer(10)); // false(중복 허용X)
		//h2.add('A'); 같은 제네닉 타입이 아니면 무조건 오류
		
		h3.add(3.14);
		h3.add(new Double(31.4));
		//h3.add(10); 같은 제네닉 타입이 아니면 무조건 오류
		
		//내용보기	 (전체 내용 보기)
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		
		h1.add("java");
		h1.add("Java");
		h1.add("JAVA");
		h1.add("jsp");
		h1.add("JSP");
		h1.add("spring");
		System.out.println(h1);
		
		//하나씩 꺼내서 사용하기
		//1. 개선된 for문(일반for문은 사용 못함. index가 없음.)
		//2. iterator()
		for (String k : h1) {
			String msg = k;
			System.out.println(msg);
		}
		System.out.println("=============");
		Iterator<String> it = h1.iterator();
		while (it.hasNext()) {//it은 첫번째 값보다 앞에 있고 hasNext()는 그 뒤의 정보가 있는가?
							//	=> 있을 경우 true 없으면 false
			String msg = (String) it.next(); //다음 객체를 return 후 해당 객체로 이동
			System.out.println(msg);
		}
		
	}
}
