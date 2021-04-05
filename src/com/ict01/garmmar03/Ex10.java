package com.ict01.garmmar03;
import java.util.Scanner;
class Ex10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	//class안에는 생성자와 메서드, 필드가 있다.
		System.out.print("당신의 이름은? ");
		System.out.println(sc.next());
	

		System.out.println("국어 점수: " );		
		int kor = sc.nextInt();

		System.out.println("영어 점수: " );
		int eng = sc.nextInt();	

		System.out.println("수학 점수: " );
		int math = sc.nextInt();

		int total = math + kor + eng;	
		System.out.println("총점: " +total);

		System.out.print("당신의 키는 : ");
		double height = sc.nextDouble();
		System.out.println(height);

		System.out.print("당신은 남성입니까?(true/false): ");
		boolean gender = sc.nextBoolean();
		String str = (gender==true)?"남성":"여성";
		System.out.println(str);
		
	}
}