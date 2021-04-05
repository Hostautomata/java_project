package com.ict01.garmmar03;
import java.util.Scanner;
class Ex12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int k1 = sc.nextInt();
		String res = "불합격";
		if(k1 >= 80){
			res = "합격";
		}
		System.out.println("결과: "+res);

		System.out.println("비교할 두 수를 입력하세요: ");
		int k2 = sc.nextInt();
		int k3 = sc.nextInt();
		int res2 = k3;
		if(k2>k3){
			res2 = k2;
		}
		System.out.println("큰 수는 "+res2);
	}
}