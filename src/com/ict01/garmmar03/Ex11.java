package com.ict01.garmmar03;
import java.util.Scanner;
class Ex11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		String result = (num%2 == 0) ? "짝수" : "홀수";
		System.out.print("해당 수는 "+result+"입니다.");
		System.out.println();
		
		System.out.print("국어 점수: ");
		int kor = sc.nextInt();
		System.out.println();
		System.out.print("수학 점수: ");
		int math = sc.nextInt();
		System.out.println();
		System.out.print("영어 점수: ");
		int eng = sc.nextInt();
		System.out.println();
		double avg = (kor+math+eng)/3;
		System.out.println(avg);
		result = ((avg>=60)&&(kor>=40)&&(eng>=40)&&(math>=40))?"합격":"불합격";	
		System.out.println(result);

		System.out.println();
		System.out.print("현재까지 일한 시간을 적어주세요: ");
		
		int workh = sc.nextInt();
		int overWorkh = workh-8;
		int pay = 8720;
		int overWorkPay = (int)(pay * 0.5);
		int res1 = (workh > 8) ? (pay*workh + overWorkh*overWorkPay) : (pay*workh);
		System.out.println("현재까지 수당: "+res1);		
	}
}