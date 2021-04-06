package com.ict05.collection;

import java.util.HashMap;
import java.util.Iterator;

public class Ex08 {
	public static void main(String[] args) {
		//Map인터페이스 : Key와 Value를 매핑하는 구조로 이루어짐
		//				Key가 중복되면 덮어쓰기가 된다.(value는 상관 없음)
		//				Key를 호출하면 value가 나온다.
		//				Key를 set컬렉션에 별도로 관리 => keySet();
		//key가 중요하다.				
						
		//주요메서드		Key와 Value를 같이 넣어야 해서 add를 사용 못한다.
		
		//삽입 : put(K key,V value)
		
		//*keySet(): key를 set에서 관리
		
		//containsKey(Object key) : boolean
		
		//containsValue(Object value) : boolean
		//	인자로 받은 key/value가 존재하면 true, 아니면 false
		
		//get(Object key) : 키를 받아서 value를 return
		
		//remove(Object key) : 키를 받아서 삭제
		
		//replace(바꿀key, 바꿀value) : 치환
		
		
		//1. key를 순서있는 숫자로 만들면 for문 사용 가능
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "한국");
		map1.put(2, "미국");
		map1.put(3, "중국");
		map1.put(4, "영국");
		map1.put(5, "태국");
		System.out.println(map1);
		
		map1.put(3,"일본");//key값 중복(덮어쓰기)
		System.out.println(map1);
		
		map1.put(6, "한국");//value값 중복(상관없음)
		System.out.println(map1);

		//하나씩 추출하는 방법
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		System.out.println(map1.get(3));
		System.out.println(map1.get(4));
		System.out.println(map1.get(5));
		System.out.println("for===============");
		for (int i = 1; i < map1.size(); i++) {
			System.out.println(map1.get(i));
		}
		System.out.println();
		System.out.println("foreach===============");
		//개선된 for문 사용 => keySet()을 사용해야 함.
		for (Integer k : map1.keySet()) {
			System.out.println(map1.get(k));
		}
		System.out.println("Iterator===============");
		//Iterator사용
		Iterator<Integer> it = map1.keySet().iterator();
		while (it.hasNext()) {
			int su1 = (int) it.next();

			System.out.println(map1.get(su1));	
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
		//2. key를 문자로 만들면 출력시 무조건 Iterator를 사용해야 한다.
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("이름", "고길동");
		map2.put("나이", "34");
		map2.put("주소", "도봉구");
		map2.put("성별", "남");
		map2.put("취미", "잠자기");
		
		System.out.println(map2.get("이름"));
		System.out.println(map2.get("나이"));
		System.out.println(map2.get("주소"));
		System.out.println(map2.get("성별"));
		System.out.println(map2.get("취미"));
		System.out.println("foreach------------------------");
		//개선된 for문
		for (String k : map2.keySet()) {
			System.out.println(map2.get(k));
		}
		System.out.println("Iterator+++++++++++++++++++++++");
		//Iterator사용
		Iterator< String> it2 = map2.keySet().iterator();
		while (it2.hasNext()) {
			String st = (String) it2.next();
			System.out.println(map2.get(st));
		}
		
		
		
	}
}
