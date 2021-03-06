package com.ict03.class02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02 {

	public static void main(String[] args) {
		// 날짜관련 클래스 : 현재사용하는 컴퓨터 기준
		// Date 클래스
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy. MM. dd. hh:mm:ss E");
		System.out.println(dateFormat.format(date));

		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy. M. d. h:m:s E");
		System.out.println(dateFormat2.format(date));

		// 년, 월, 일, 시, 분, 초, 요일 따로구하기
		System.out.println((date.getYear() + 1900) + "년도");
		System.out.println(date.getMonth() + 1 + "월");
		System.out.println(date.getDate() + "일");
		System.out.println(date.getHours() + "시");
		System.out.println(date.getMinutes() + "분");
		System.out.println(date.getSeconds() + "초");
		System.out.println(date.getDay() + "요일");// 요일인데 0이 일요일~ 6토요일

		System.out.println("======================================");
		// Calender 클래스
		// 현재 날짜와 시간을 구할 때는 new예약어를 사용하지 않고 객체를 생성함.=static
		// 년,월,일,시,분,초를 구할 때 Calendar.get(Calendar.상수)를 사용
		System.out.println(Calendar.getInstance().get(Calendar.YEAR) + "년도");
		Calendar now = Calendar.getInstance();// 컴퓨터의 현재 날짜와 시간, 요일을 뜻한다.
		System.out.println(now.get(Calendar.YEAR) + "년도");
		System.out.println(now.get(Calendar.MONTH) + 1 + "월");// 0-11
		System.out.println(now.get(Calendar.DATE) + "일");
		System.out.println(now.get(Calendar.DAY_OF_MONTH) + "일");

		// 12시간제는 오전/오후가 필요하다.(AM_PM)
		// AM = 0, PM = 1
		int res = now.get(Calendar.AM_PM);
		if (res == 0) {
			System.out.println("AM");
		} else if (res == 1) {
			System.out.println("PM");
		}
		// 시간(12시간제, 24시간제)
		System.out.println(now.get(Calendar.HOUR) + "시");// 12
		System.out.println(now.get(Calendar.HOUR_OF_DAY) + "시");// 24

		System.out.println(now.get(Calendar.MINUTE) + "분");
		System.out.println(now.get(Calendar.SECOND) + "초");
		
		//요일 1일요일~7토요일
		int res2 = now.get(Calendar.DAY_OF_WEEK);
		switch (res2) {
		case 1: {
			System.out.println("일요일");
			break;
		}
		case 2: {
			System.out.println("월요일");
			break;
		}
		case 3: {
			System.out.println("화요일");
			break;
		}
		case 4: {
			System.out.println("수요일");
			break;
		}
		case 5: {
			System.out.println("목요일");
			break;
		}
		case 6: {
			System.out.println("금요일");
			break;
		}
		case 7: {
			System.out.println("토요일");
			break;
		}
		}
	}
}
