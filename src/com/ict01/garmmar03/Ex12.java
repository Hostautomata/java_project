package com.ict01.garmmar03;
import java.util.Scanner;
class Ex12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int k1 = sc.nextInt();
		String res = "���հ�";
		if(k1 >= 80){
			res = "�հ�";
		}
		System.out.println("���: "+res);

		System.out.println("���� �� ���� �Է��ϼ���: ");
		int k2 = sc.nextInt();
		int k3 = sc.nextInt();
		int res2 = k3;
		if(k2>k3){
			res2 = k2;
		}
		System.out.println("ū ���� "+res2);
	}
}