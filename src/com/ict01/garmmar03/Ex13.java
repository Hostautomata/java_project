package com.ict01.garmmar03;
import java.util.Scanner;
class Ex13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("������ �Է��ϼ���: ");
		int k1 = sc.nextInt();

		if(k1>=60){
			System.out.println("�հ�");
		}
		else{
			System.out.println("���հ�");
		}
		
		
		System.out.println("���ڸ� �Է����ּ���: ");
		int k2 = sc.nextInt();
		if(k2%2==0){
			System.out.println("¦��");
		}
		else{
			System.out.println("Ȧ��");
		}
			
		System.out.println("���ڸ� �Է��� �ּ���: ");
		char k3 = sc.next().charAt(0);
		if(k3>='A'&&k3<'Z'){
			System.out.println("�빮���̴�.");
		}
		else{
			System.out.println("�빮�ڰ� �ƴϴ�.");
		}

		System.out.println("�ֹι�ȣ ���ڸ� �� ���ڸ��� �Է��� �ּ���: ");
		int k4 = sc.nextInt();
		if(k4==1||k4==3){
			System.out.println("���ڴ�.");
		}
		else if(k4==2||k4==4){
			System.out.println("���ڴ�.");
		}
		else{
			System.out.println("�ܱ����̴�.");
		}
		
		System.out.println("�ٹ��� �ð��� �Է��� �ּ���: ");
		int h = sc.nextInt();
		int dan = 8720;
		int mon = 0;
		if(h>8){
			mon= (int)((h-8)*1.5*dan+8*dan);
			System.out.println(mon);
		}
		else{
			mon = h*dan;
			System.out.println(mon);
			
		}

	}
}