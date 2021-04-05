package com.ict03.class03;

import java.util.Scanner;

public class Ex12_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("선택하세요 (1) 고양이 (2) 강아지: ");
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
		// 부모클래스에 없는 자식만의 메서드는 사용 불가.
		
		animal.sound();
		//animal.hobby();
		animal.like();
		animal.sleep();
		
	}
}
