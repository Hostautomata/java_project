package com.ict03.class01;

import java.util.Scanner;

public class Ex07_main {
	public static void main(String[] args) {
		Ex07 test = new Ex07();
		String name = test.getName();
		int age = test.getAge();
		double height = test.getHeight();
		boolean human = test.isHuman();
		char rank = test.getRank();
		
		System.out.println("�̸� : "+name+" ���� : "+age+"\n"
				+ "Ű : "+height+" ��ũ : "+rank+" ��� :"+human);

		System.out.println();
		Scanner sc = new Scanner(System.in);


			System.out.print("�̸� : ");
			name = sc.next();
			System.out.print("���� : ");
			age = sc.nextInt();
			System.out.print("Ű : ");	
			height = sc.nextDouble();
			System.out.print("��ũ : ");		
			rank = (char)sc.next().charAt(0);
			System.out.print("��� : ");		
			human = sc.nextBoolean();
			
			test.setName(name);
			test.setAge(age);
			test.setHeight(height);
			test.setRank(rank);
			test.setHuman(human);
			
			name = test.getName();
			age = test.getAge();
			height = test.getHeight();
			rank = (char)test.getRank();
			human = test.isHuman();
			
			System.out.println("�̸� : "+name+" ���� : "+age+"\n"
					+ "Ű : "+height+" ��ũ : "+rank+" ��� :"+human);

	}
}
