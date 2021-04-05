package com.ict01.grammer04;
import java.util.Scanner;
class Ex08 
{
	public static void main(String[] args) 
	{
		//1~10까지 짝수만 출력(continue사용)
		for (int i = 1; i <11 ;i++ )
		{
			if(i%2==1) continue;
			System.out.println(i);

		}

		//무한 루프에서 숫자를 받아서 홀/짝 판별

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

			System.out.println("계속할까요? Yes(1),No(2)");

		}
	}
}
