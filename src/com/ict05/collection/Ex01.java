package com.ict05.collection;

public class Ex01 {
	public static void main(String[] args) {
		//제너닉 : 객체들을 모아놓은 타입
		//컬렉션 : 객체들을 모아서 관리하는 인터페이스를 구현한 것
		//API  	: <T> => 객체 타입, <E>=> 요소(컬렉션 안에 존재하는 객체 하나)
		//		: Map형식에서는 <K,V> => key(키),Value<값>
		//		  Key와 Value가 1:1대응, Key를 호출하면 Value가 나온다.
		//형식	: 컬렉션<제네닉>
		//최상위 컬렉션은 Collection<E>, Map<K,V>
		
		
		//인터페이스는 상수와 추상 메서드를 가지고있다. -> Collection은 인터페이스이다.
		//인터페이스는 객체 생성 X 이것들을 상속받은 클래스에서 객체 생성 가능. 
		//Collection<E>를 상속받은 인터페이스는 Set<E>, List<E>, Queue<E>
		
		//Collection의 주요 메서드
		//add(E a) : boolean > 해당 컬렉션에 객체 추가, 성공하면 true;
		//addAll(Collection<? extends E> c) : boolean
		//	=>	특정 컬렉션에 있는 모든 요소들을 다른 컬렉션에 추가
		
		// clear() : void => 모든 요소 삭제
		
		//contains(object o) : 해당 컬렉션에 인자로 들어온 객체가 존재하면 true, 아니면 false
		//containsAll(Collection<?> c) : boolean
		//		=>이 컬렉션에 지정된 컬렉션의 모든 요소가 포함된 경우 true
		
		//equals(Object o) : boolean => 지정된 객체와의 컬렉션이 같은지 비교
	
		//isEmpty() : boolean => 해당 컬렉션이 비어있으면 true
		
		//**iterator() : Iterator<E> 
		//	=> 컬렉션안에 존재하는 요소들을 순서대로 접근하기위한 Iterator 객체를 반환
		//	=> 컬렉션안에 존재하는 요소들을 하나씩 꺼내서 작업할 때 사용한다.
		
		//remove(Object o) : boolean 인자로 => 들어온 객체를 삭제할 때 사용. 성공하면 true
		
		//size() : int => 컬렉션안에 존재하는 요소들의 수(for문에 사용)
		
		//toArray() : Object[] => 컬렉션을 배열로 만든다.
		//
		
		
		
		
		//변수 : 한가지 데이터밖에 사용할 수 없다.
		//배열 : 같은 자료형만 모을 수 있고 크기를 미리 지정해야하며 변경이 안된다.
		//클래스 : 크기가 지정되야 하고 변경이 안됨.
		//클래스 배열 : 클래스를 모아서 사용 가능하지만 역시 크기를 미리 지정해야 하고 변경이 안됨.
		//컬렉션(자료구조) : 클래스를 마음대로 추가 저장 삭제 할 수 있음.
		//스택LIFO후입선출 큐FIFO선입선출 데크 링크드리스트(블록체인) 리니어리스트
		//
		
	}
}
