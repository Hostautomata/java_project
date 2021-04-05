package com.ict01.grammer02;
//환율계산
import java.util.Scanner;

class Hw01{
	public static void main(String[] args){
		double USD = 1134.50;
		double JPY = 10.434;
		double EUR = 1339.57;

		Scanner sc = new Scanner(System.in);
		int won = sc.nextInt();
		double doll = won / USD;
		double yen = won / JPY;
		double eur = won / EUR;
		System.out.println(won+"원은 "+doll+"달러 입니다.");
		System.out.println(won+"원은 "+yen+"엔 입니다.");
		System.out.println(won+"원은 "+eur+"유로 입니다.");
				
	}
}