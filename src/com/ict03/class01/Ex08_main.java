package com.ict03.class01;

import java.util.Iterator;
import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		//class명 참조변수 = 인스턴스(new) 생성자();

		
		Ex08 coffee = new Ex08();
		coffee.setName("커피음료");
		coffee.setPrice(1800);
		
		Ex08 ion = new Ex08();
		ion.setName("이온음료");
		ion.setPrice(1500);
		
		Ex08 cola = new Ex08();
		cola.setName("탄산음료");
		cola.setPrice(2000);
		
		Ex08 juice = new Ex08();
		juice.setName("과일음료");
		juice.setPrice(2200);

		
		
		//참조자료형(클래스를 자료형으로)
//		Ex08[]arr = new Ex08[4];
//		arr[0] = coffee;
//		arr[1] = ion;
//		arr[2] = cola;
//		arr[3] = juice;
		
		Ex08[] arr = {coffee, ion, cola, juice};
 		//arr 배열이 갖는 이름들을 출력하자
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i].getName()+", "+arr[i].getPrice()+"원");
//		}

		Scanner sc = new Scanner(System.in);
		//동전 투입
		System.out.print("동전을 투입해주세요 : ");
		int input = sc.nextInt();
		
		while(true) {
		
		//1500>돈 = 금액부족
		if(input<1500){
			System.out.println("금액 부족"); break;
		}else {
			System.out.println("1.커 피\t 2.이 온\t3.탄 산\t4.주 스");
			for (int i = 0; i < arr.length; i++) {
				if(arr[i].getPrice() > input) {
					System.out.println("X\t");
				}else {
					System.out.print("O\t");
				}
			}
		}
		
		System.out.println();
		System.out.println("번호로 선택하세요");
		int drink  = sc.nextInt();
		int output = 0;
		
		if(drink == 1) {
			output = input - arr[0].getPrice();
		}else if(drink == 2) {
			output = input - arr[1].getPrice();
		}else if(drink == 3) {
			output = input - arr[2].getPrice();
		}else if(drink == 4) {
			output = input - arr[3].getPrice();
		}
		System.out.println("잔돈: "+output);
		input = output;
		//1500<=돈 = 구입가능
		//price>돈 = 구입 불가
		if(output<1500)break;
		
		
		
		
		}
		
		//잔돈이 남으면 다시 구입하도록 while문으로 구현
	}
}
