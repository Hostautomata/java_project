package com.ict05.collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex09 {
	public static void main(String[] args) {
		//나라정보를 받으면 해당 나라의 수도를 출력하는 프로그램
		//1. 나라와 수도를 가지고있는 데이터
		HashMap<String, String> map = new HashMap<>();
		map.put("한국", "서울");
		map.put("대한민국", "서울");
		map.put("KOREA", "서울");
		map.put("korea", "서울");
		map.put("미국", "워싱턴");
		map.put("중국", "베이징");
		map.put("일본", "도쿄");
		map.put("태국", "방콕");
		map.put("캐나다", "오타와");
		
		//나라(key)를 set 컬렉션에 넣었다.
		Set<String> sets= map.keySet();
		
		Scanner sc = new Scanner(System.in);
		
		esc:
		while(true) {
			System.out.print("나라를 입력하세요 : ");
			String msg = sc.next();
			if(sets.contains(msg)) {
				String result = map.get(msg);
				System.out.println(msg+"의 수도는 "+result+"입니다.");
			}else {
				System.out.println("데이터에 없는 나라 입니다.");
			}
			while(true) {
				
				System.out.println("그만 하시겠습니까? Y/N");
				char stop = sc.next().charAt(0);
				if(stop == 'Y'||stop == 'y') break esc;
				else if(stop == 'N'||stop =='n') continue esc;
				else {
					System.out.println("잘못 입력하셨습니다. 다시 입력해주십시오.");
					continue;
				}
			}
			
		}
		System.out.println("감사합니다.");
		
	}
}
