package com.ict03.class01;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
		// 5���� �̸���. ����., ����., ���� ������ �޾Ƽ�
		// �̸�, ����, ���, ����, ���� ���ϰ� ����
		Scanner sc = new Scanner(System.in);

		Ex09[] arr = new Ex09[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("�̸�: ");
			String name = sc.next();
			System.out.print("����: ");
			int kor = sc.nextInt();
			System.out.print("����: ");
			int eng = sc.nextInt();
			System.out.print("����: ");
			int math = sc.nextInt();
			System.out.println();

			Ex09 person = new Ex09();
			person.setName(name);
			person.p_sum(kor, eng, math);

			arr[i] = person;
		}

		System.out.println();
		// ����
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() == arr[j].getSum())
					continue;
				if (arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}
		// ����
		Ex09 temp = new Ex09();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// ���
		System.out.println("�̸�\t����\t���\t����\t��ũ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + "\t");
			System.out.print(arr[i].getSum() + "\t");
			System.out.print(arr[i].getAvg() + "\t");
			System.out.print(arr[i].getHak() + "\t");
			System.out.print(arr[i].getRank() + "\t");
			System.out.println();
		}

	}
}
