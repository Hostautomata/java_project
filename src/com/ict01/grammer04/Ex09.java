package com.ict01.grammer04;
import java.util.Scanner;
class Ex09 
{
	public static void main(String[] args) 
	{
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

			while(true){
			System.out.println("����ұ��? Yes(1),No(2)");

				int k2 = sc.nextInt();
				if(k2 == 2) break esc;
				else if(k2 == 1) break;
				else System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				
			}
		}
	}
}
