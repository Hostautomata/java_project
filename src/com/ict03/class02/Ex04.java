package com.ict03.class02;

import java.util.Scanner;

//���������� while�� �ݺ� ���� -> �·�
public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double count = 0;
		double win = 0;

		while (true) {

			System.out.println("(0)����(1)����(2)�� :");

			int com = (int) (Math.random() * 3);

			int usr = sc.nextInt();

			if (usr == com) {
				System.out.println("�����ϴ�.");
				count++;
			} else if (usr == 0 && com == 1 || usr == 1 && com == 2 || usr == 2 && com == 0) {
				System.out.println("�̰���ϴ�.");
				count++;
				win++;
			} else {
				System.out.println("�����ϴ�.");
				count++;
			}
			double point = (win / count) * 100;
			System.out.println("�·�: " + point + "%");

			System.out.println("��� �Ͻðڽ��ϱ�? Y/N");

			char con = sc.next().charAt(0);

			if (con == 'N' || con == 'n')
				break;
		}

	}
}
