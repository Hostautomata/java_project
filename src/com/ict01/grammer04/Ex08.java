package com.ict01.grammer04;
import java.util.Scanner;
class Ex08 
{
	public static void main(String[] args) 
	{
		//1~10���� ¦���� ���(continue���)
		for (int i = 1; i <11 ;i++ )
		{
			if(i%2==1) continue;
			System.out.println(i);

		}

		//���� �������� ���ڸ� �޾Ƽ� Ȧ/¦ �Ǻ�

		Scanner sc = new Scanner(System.in);
		esc:
		while(true){
			System.out.print("���� �Է� : ");
			int k = sc.nextInt();
			String msg = "";
			if(k%2 == 0){
				msg = "¦��";
			}else
			{
				msg = "Ȧ��";
			}
			System.out.println(k+"�� "+msg+"�Դϴ�.");

			System.out.println("����ұ��? Yes(1),No(2)");

		}
	}
}
