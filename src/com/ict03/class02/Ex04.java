package com.ict03.class02;

import java.util.Scanner;

//가위바위보 while로 반복 선택 -> 승률
public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double count = 0;
		double win = 0;

		while (true) {

			System.out.println("(0)가위(1)바위(2)보 :");

			int com = (int) (Math.random() * 3);

			int usr = sc.nextInt();

			if (usr == com) {
				System.out.println("비겼습니다.");
				count++;
			} else if (usr == 0 && com == 1 || usr == 1 && com == 2 || usr == 2 && com == 0) {
				System.out.println("이겼습니다.");
				count++;
				win++;
			} else {
				System.out.println("졌습니다.");
				count++;
			}
			double point = (win / count) * 100;
			System.out.println("승률: " + point + "%");

			System.out.println("계속 하시겠습니까? Y/N");

			char con = sc.next().charAt(0);

			if (con == 'N' || con == 'n')
				break;
		}

	}
}
