package com.ict03.class03;

import java.util.Scanner;

public class Ex12_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�����ϼ��� (1) ����� (2) ������: ");
		int s1 = sc.nextInt();
		/*
		switch (s1) {
		case 1: {
			Ex10_Cat cat = new Ex10_Cat();
			cat.sound();
			cat.like();
			cat.hobby();
			cat.sleep();
			break;
		}
		case 2: {
			Ex11_Dog dog = new Ex11_Dog();
			dog.sound();
			dog.like();
			dog.hobby();
			dog.sleep();
			break;

		}
		}
		*/
		Ex09_Animal animal = null;
		switch (s1) {
			case 1: {
				animal = new Ex10_Cat();
				break;
			}
			case 2: {
				animal = new Ex11_Dog();
				break;
			}
			
		}
		// �θ�Ŭ������ ���� �ڽĸ��� �޼���� ��� �Ұ�.
		
		animal.sound();
		//animal.hobby();
		animal.like();
		animal.sleep();
		
	}
}
