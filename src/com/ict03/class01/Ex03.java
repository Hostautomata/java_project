package com.ict03.class01;

public class Ex03 {
	//메서드 : 기능, 동작
	// 		**메서드를 호출하면 해당 메서드가 실행된다.
	//		**실행이 끝나면 메서드를 호출한 곳으로 되돌아간다.
	//		**되돌아갈 때 결과를 가지고가는 경우와 아닌경우(void)로 나뉜다.
	//		반환형이 있는 경우 반드시 return+보낼 데이터 가 마지막에 있어야 한다.

	int s1 = 10;
	int s2 = 5;
	int result = 0;
	//		반환형 없음
	public void plus01() {
		System.out.println(2);
		result = s1 + s2;
	}
	
	//		반환형이 있는 경우
	public int sub01() {
		int res = s1 - s2;
		return res;
	}
	
	
}
