package com.ict03.class01;

import java.util.Scanner;

public class Ex10_main {
	
	public static void main(String[] args) {
		//�ο����� �޴´�. 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ο�: ");
		int su = sc.nextInt();
		
		//
		Ex10 moka = new Ex10();
		Ex10 americano = new Ex10();
		Ex10 latte = new Ex10();
		Ex10 juice = new Ex10();
		//�޴��̸� ����
		moka.setName("ī���ī");
		americano.setName("�Ƹ޸�ī��");
		latte.setName("ī���");
		juice.setName("�ڸ��ֽ�");
		//�޴� ���ݼ���
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
		
		//�� ������� �޴� ����
		System.out.println("�ֹ����ּ��� :");
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
		//�Ѿ� ���
		System.out.println("�Ѿ�: "+sum);
		//�� �ޱ�
		System.out.println("���� �־� �ּ���");
		int input = sc.nextInt();
		//�ܵ� ���
		int output = input-sum;
		System.out.println("�ܵ�: "+output);
	}
}
