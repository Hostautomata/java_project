package com.ict01.grammer04;
import java.util.Scanner;

class Ex05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("반복하실 횟수를 입력하세요 : ");

		int num = sc.nextInt();
		System.out.println();

		int i = 0;
		do
		{
			System.out.println("어서오세요");
			i++;
		}
		while (i<num);
		i = 0;
		System.out.print("반복하실 횟수를 입력하세요 : ");
		int num2 = sc.nextInt();
		while(i < num2){
			System.out.println("안녕하세요");
			i++;
		}

		//반복횟수와 일반 숫자를 받아서 홀수, 짝수를 출력

		System.out.print("반복할 횟수를 입력 : ");
		int loop = sc.nextInt();
		System.out.println();
		int l = 0;
		String msg = "";
		do
		{
			System.out.print("판별 할 수를 입력 : ");
			int su = sc.nextInt();
			if(su%2 == 0){
				msg = "짝수";
				
			}
			else{
				msg = "홀수";
			}
			System.out.println("입력한 수 "+su+"는 "+msg+"입니다.");
			l++;

		}
		while (l < loop);



	}
}
