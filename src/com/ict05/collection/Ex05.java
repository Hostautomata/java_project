package com.ict05.collection;

import java.util.Iterator;
import java.util.Stack;

public class Ex05 {
	// List 인터페이스를 구현한 클래스들 : Stack, ArrayList, Vector;
	// Stack(스택) : LIFO 후입선출
	// 주요 메서드
	// add, push, addElement => 추가(insert), 뒤에붙는것.
	// add(index, E) => 삽입(apppend), 중간에 끼워 넣는 것.
	// pop() : 맨위에 존재하는 객체를 반환하고 삭제하는 것.(for문을 사용하면 위에부터 날아가면서 반환됨)
	// peek() : 맨 위에 존재하는 객체를 반환하는 것.(무한루프 조심 for문사용X)
	// search() : 검색(오른쪽, 1부터) => 스택구조대로
	// indexOf() : 검색(왼쪽, 0부터) => 배열방식
	// elementsAt(index) : 위치의 값을 받아서 해당 객체를 추출
	// get(index) : 위치의 값을 받아서 해당 객체를 추출
	// firstElement() : 맨 처음 요소 추출
	// lastElement() : 맨 마지막 요소 추출
	// setElement() : 치환
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.add("둘리");
		stack.addElement("공실");
		stack.push("마이콜");
		System.out.println(stack);

		stack.add(1, "도우너");// 삽입
		stack.add(0, "또치");// 삽입
		stack.add(1, "뿌끄");// 위치값은 중복이 아님.
		stack.add(1, "또치");// 중복사용 가능
		System.out.println(stack);
		System.out.println("=====================");
		// peek
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println("+++++++++++++++++++++");
		
		// contains
		if (stack.contains("둘리")) {
			//indexOf()
			System.out.println(stack.indexOf("둘리") + "번째 위치");
			//search()
			System.out.println(stack.search("둘리") + "번째 위치");
			//get()
			System.out.println(stack.get(1));
			System.out.println(stack.get(stack.indexOf("둘리")));//고오급방식
			System.out.println(stack.elementAt(stack.indexOf("둘리")));
			System.out.println(stack.firstElement());
			System.out.println(stack.lastElement());
			stack.setElementAt("고길동", 3);
			stack.set(1, "희동이");
			System.out.println(stack.get(1));
			
		} else {
			System.out.println("존재하지 않음");
		}
		System.out.println("xxxxxxxxxxxxxxxxxxxxx");
		
		//하나씩 꺼내기 (개선된 for문, iterator(데이터가 손실되지 않음), pop(데이터가 날아감))
		for (String k : stack) {
			System.out.println(k);
		}
		System.out.println(stack.size()+"요소가 존재함");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
		Iterator<String> it = stack.iterator();
		while (it.hasNext()) {
			String msg = (String) it.next();
			System.out.println(msg);
		}
		System.out.println(stack.size()+"요소가 존재함");
		System.out.println(":::::::::::::::::::::::::::");
		// pop()
		while (!stack.isEmpty()) {//isEmpty를 이용하면 편함.
			String k = stack.pop();
			System.out.println(stack+" "+k+"삭제됨, 크기는 "+stack.size());
			}

		
	}
}
