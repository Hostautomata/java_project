package com.ict03.class01;

import java.util.Scanner;

public class Ex10_main_second {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원: ");
		int su = sc.nextInt();
		
		Ex10[] offer = new Ex10[su];
		
		for(int i = 0; i < offer.length; i++) {
			System.out.println("1. 아메리카노 2500");
			System.out.println("2. 카페모카 3000");
			System.out.println("3. 카페라떼 3500");
			System.out.println("4. 자몽쥬스 3000");
			int menu = sc.nextInt();
			
			Ex10 product = new Ex10();
			if(menu == 1) {
				product.setName("아메리카노");
				product.setPrice(2500);
			}
			if(menu == 2) {
				product.setName("카페모카");
				product.setPrice(3000);
			}
			if(menu == 3) {
				product.setName("카페라떼");
				product.setPrice(3500);
			}
			if(menu == 4) {
				product.setName("자몽주스");
				product.setPrice(3000);
			}
			offer[i] = product;
			
			
		}
		

		int sum = 0;	
		for(int i = 0; i < offer.length; i++) {
			sum = sum + offer[i].getPrice();
		}
		System.out.println("총액 : "+sum);
		System.out.println("입금액: ");
		int input = sc.nextInt();
		int output = input - sum;
		System.out.println(output);
	}
}
