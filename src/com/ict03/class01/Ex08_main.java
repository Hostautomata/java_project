package com.ict03.class01;

import java.util.Iterator;
import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		//class�� �������� = �ν��Ͻ�(new) ������();

		
		Ex08 coffee = new Ex08();
		coffee.setName("Ŀ������");
		coffee.setPrice(1800);
		
		Ex08 ion = new Ex08();
		ion.setName("�̿�����");
		ion.setPrice(1500);
		
		Ex08 cola = new Ex08();
		cola.setName("ź������");
		cola.setPrice(2000);
		
		Ex08 juice = new Ex08();
		juice.setName("��������");
		juice.setPrice(2200);

		
		
		//�����ڷ���(Ŭ������ �ڷ�������)
//		Ex08[]arr = new Ex08[4];
//		arr[0] = coffee;
//		arr[1] = ion;
//		arr[2] = cola;
//		arr[3] = juice;
		
		Ex08[] arr = {coffee, ion, cola, juice};
 		//arr �迭�� ���� �̸����� �������
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i].getName()+", "+arr[i].getPrice()+"��");
//		}

		Scanner sc = new Scanner(System.in);
		//���� ����
		System.out.print("������ �������ּ��� : ");
		int input = sc.nextInt();
		
		while(true) {
		
		//1500>�� = �ݾ׺���
		if(input<1500){
			System.out.println("�ݾ� ����"); break;
		}else {
			System.out.println("1.Ŀ ��\t 2.�� ��\t3.ź ��\t4.�� ��");
			for (int i = 0; i < arr.length; i++) {
				if(arr[i].getPrice() > input) {
					System.out.println("X\t");
				}else {
					System.out.print("O\t");
				}
			}
		}
		
		System.out.println();
		System.out.println("��ȣ�� �����ϼ���");
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
		System.out.println("�ܵ�: "+output);
		input = output;
		//1500<=�� = ���԰���
		//price>�� = ���� �Ұ�
		if(output<1500)break;
		
		
		
		
		}
		
		//�ܵ��� ������ �ٽ� �����ϵ��� while������ ����
	}
}
