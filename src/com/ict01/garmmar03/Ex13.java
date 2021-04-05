package com.ict01.garmmar03;
import java.util.Scanner;
class Ex13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("점수를 입력하세요: ");
		int k1 = sc.nextInt();

		if(k1>=60){
			System.out.println("합격");
		}
		else{
			System.out.println("불합격");
		}
		
		
		System.out.println("숫자를 입력해주세요: ");
		int k2 = sc.nextInt();
		if(k2%2==0){
			System.out.println("짝수");
		}
		else{
			System.out.println("홀수");
		}
			
		System.out.println("문자를 입력해 주세요: ");
		char k3 = sc.next().charAt(0);
		if(k3>='A'&&k3<'Z'){
			System.out.println("대문자이다.");
		}
		else{
			System.out.println("대문자가 아니다.");
		}

		System.out.println("주민번호 뒷자리 맨 앞자리를 입력해 주세요: ");
		int k4 = sc.nextInt();
		if(k4==1||k4==3){
			System.out.println("남자다.");
		}
		else if(k4==2||k4==4){
			System.out.println("여자다.");
		}
		else{
			System.out.println("외국인이다.");
		}
		
		System.out.println("근무한 시간을 입력해 주세요: ");
		int h = sc.nextInt();
		int dan = 8720;
		int mon = 0;
		if(h>8){
			mon= (int)((h-8)*1.5*dan+8*dan);
			System.out.println(mon);
		}
		else{
			mon = h*dan;
			System.out.println(mon);
			
		}

	}
}