package com.ict01.grammer04;
import java.util.Scanner;

class Ex05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݺ��Ͻ� Ƚ���� �Է��ϼ��� : ");

		int num = sc.nextInt();
		System.out.println();

		int i = 0;
		do
		{
			System.out.println("�������");
			i++;
		}
		while (i<num);
		i = 0;
		System.out.print("�ݺ��Ͻ� Ƚ���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		while(i < num2){
			System.out.println("�ȳ��ϼ���");
			i++;
		}

		//�ݺ�Ƚ���� �Ϲ� ���ڸ� �޾Ƽ� Ȧ��, ¦���� ���

		System.out.print("�ݺ��� Ƚ���� �Է� : ");
		int loop = sc.nextInt();
		System.out.println();
		int l = 0;
		String msg = "";
		do
		{
			System.out.print("�Ǻ� �� ���� �Է� : ");
			int su = sc.nextInt();
			if(su%2 == 0){
				msg = "¦��";
				
			}
			else{
				msg = "Ȧ��";
			}
			System.out.println("�Է��� �� "+su+"�� "+msg+"�Դϴ�.");
			l++;

		}
		while (l < loop);



	}
}
