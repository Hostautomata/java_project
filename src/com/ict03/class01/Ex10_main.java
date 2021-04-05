package com.ict03.class01;

import java.util.Scanner;

public class Ex10_main {
	
	public static void main(String[] args) {
		//인원수를 받는다. 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원: ");
		int su = sc.nextInt();
		
		//
		Ex10 moka = new Ex10();
		Ex10 americano = new Ex10();
		Ex10 latte = new Ex10();
		Ex10 juice = new Ex10();
		//메뉴이름 설정
		moka.setName("카페모카");
		americano.setName("아메리카노");
		latte.setName("카페라떼");
		juice.setName("자몽주스");
		//메뉴 가격설정
		moka.setPrice(3000);
		americano.setPrice(3000);
		latte.setPrice(3000);
		juice.setPrice(3000);
		
		System.out.println("1. "+moka.getName()+": "+moka.getPrice());
		System.out.println("2. "+americano.getName()+": "+americano.getPrice());
		System.out.println("3. "+latte.getName()+": "+latte.getPrice());
		System.out.println("4. "+juice.getName()+": "+juice.getPrice());
		int sum = 0;	
		int count = 0;
		int price = 0;
		while(true) {
		
		//각 사람마다 메뉴 설정
		System.out.println("주문해주세요 :");
		int menu = sc.nextInt();
		if(menu == 1) {
			price = moka.getPrice();
		}else if(menu == 2) {
			price = americano.getPrice();
		}else if (menu == 3) {
			price = latte.getPrice();
		}else if(menu ==4) {
			price = juice.getPrice();
		}
		sum = sum + price;
		count ++;
		if(count == su) break;
			
		}
		//총액 출력
		System.out.println("총액: "+sum);
		//돈 받기
		System.out.println("돈을 넣어 주세요");
		int input = sc.nextInt();
		//잔돈 출력
		int output = input-sum;
		System.out.println("잔돈: "+output);
	}
}
