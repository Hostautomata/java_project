package com.ict01.garmmar03;
import java.util.Scanner;
class Ex11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		int num = sc.nextInt();
		String result = (num%2 == 0) ? "¦��" : "Ȧ��";
		System.out.print("�ش� ���� "+result+"�Դϴ�.");
		System.out.println();
		
		System.out.print("���� ����: ");
		int kor = sc.nextInt();
		System.out.println();
		System.out.print("���� ����: ");
		int math = sc.nextInt();
		System.out.println();
		System.out.print("���� ����: ");
		int eng = sc.nextInt();
		System.out.println();
		double avg = (kor+math+eng)/3;
		System.out.println(avg);
		result = ((avg>=60)&&(kor>=40)&&(eng>=40)&&(math>=40))?"�հ�":"���հ�";	
		System.out.println(result);

		System.out.println();
		System.out.print("������� ���� �ð��� �����ּ���: ");
		
		int workh = sc.nextInt();
		int overWorkh = workh-8;
		int pay = 8720;
		int overWorkPay = (int)(pay * 0.5);
		int res1 = (workh > 8) ? (pay*workh + overWorkh*overWorkPay) : (pay*workh);
		System.out.println("������� ����: "+res1);		
	}
}