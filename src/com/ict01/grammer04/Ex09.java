package com.ict01.grammer04;
import java.util.Scanner;
class Ex09 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		esc:
		while(true){
			System.out.print("숫자 입력 : ");
			int k = sc.nextInt();
			String msg = "";
			if(k%2 == 0){
				msg = "짝수";
			}else
			{
				msg = "홀수";
			}
			System.out.println(k+"는 "+msg+"입니다.");

			while(true){
			System.out.println("계속할까요? Yes(1),No(2)");

				int k2 = sc.nextInt();
				if(k2 == 2) break esc;
				else if(k2 == 1) break;
				else System.out.println("잘못 입력하셨습니다.");
				
			}
		}
	}
}
