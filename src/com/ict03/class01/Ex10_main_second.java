package com.ict03.class01;

import java.util.Scanner;

public class Ex10_main_second {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ο�: ");
		int su = sc.nextInt();
		
		Ex10[] offer = new Ex10[su];
		
		for(int i = 0; i < offer.length; i++) {
			System.out.println("1. �Ƹ޸�ī�� 2500");
			System.out.println("2. ī���ī 3000");
			System.out.println("3. ī��� 3500");
			System.out.println("4. �ڸ��꽺 3000");
			int menu = sc.nextInt();
			
			Ex10 product = new Ex10();
			if(menu == 1) {
				product.setName("�Ƹ޸�ī��");
				product.setPrice(2500);
			}
			if(menu == 2) {
				product.setName("ī���ī");
				product.setPrice(3000);
			}
			if(menu == 3) {
				product.setName("ī���");
				product.setPrice(3500);
			}
			if(menu == 4) {
				product.setName("�ڸ��ֽ�");
				product.setPrice(3000);
			}
			offer[i] = product;
			
			
		}
		

		int sum = 0;	
		for(int i = 0; i < offer.length; i++) {
			sum = sum + offer[i].getPrice();
		}
		System.out.println("�Ѿ� : "+sum);
		System.out.println("�Աݾ�: ");
		int input = sc.nextInt();
		int output = input - sum;
		System.out.println(output);
	}
}
