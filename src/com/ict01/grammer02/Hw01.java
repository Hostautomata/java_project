package com.ict01.grammer02;
//ȯ�����
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
		System.out.println(won+"���� "+doll+"�޷� �Դϴ�.");
		System.out.println(won+"���� "+yen+"�� �Դϴ�.");
		System.out.println(won+"���� "+eur+"���� �Դϴ�.");
				
	}
}