package com.ict01.garmmar03;
import java.util.Scanner;
class Ex10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	//class�ȿ��� �����ڿ� �޼���, �ʵ尡 �ִ�.
		System.out.print("����� �̸���? ");
		System.out.println(sc.next());
	

		System.out.println("���� ����: " );		
		int kor = sc.nextInt();

		System.out.println("���� ����: " );
		int eng = sc.nextInt();	

		System.out.println("���� ����: " );
		int math = sc.nextInt();

		int total = math + kor + eng;	
		System.out.println("����: " +total);

		System.out.print("����� Ű�� : ");
		double height = sc.nextDouble();
		System.out.println(height);

		System.out.print("����� �����Դϱ�?(true/false): ");
		boolean gender = sc.nextBoolean();
		String str = (gender==true)?"����":"����";
		System.out.println(str);
		
	}
}