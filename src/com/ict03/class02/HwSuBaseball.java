package com.ict03.class02;

import java.util.Scanner;

public class HwSuBaseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Can = new int[3];
		// 칸에 서로다른 랜덤값 세개 저장
		for (int i = 0; i < Can.length; i++) {
			Can[i] = (int) (Math.random() * 9);
			if (i > 0 && Can[i] == Can[i - 1]) {
				while (true) {
					Can[i] = (int) (Math.random() * 9);
					if (Can[i] == Can[i - 1] == false)
						break;
				}
			}
		}
		int ball = 0;
		int strike = 0;
		int out = 0;
		int count = 0;
		int stack = 0;
		Loop:
		 while(true) {
			
			// 사용자가 값 입력
			System.out.print("값을 입력하세요 : ");
			int[] usr = new int[3];
			for (int i = 0; i < usr.length; i++) {
				usr[i] = sc.nextInt();
			}
			// 처리
			
			for(int i = 0; i < usr.length; i ++) {
				
				for(int j = 0; j < Can.length; j++) {
					//Win
					if(usr==Can) {
						System.out.println("Win"); break Loop;
					}
					//Strike
					else if(usr[i]==Can[i]) {
						strike++;
						System.out.println("Strike");
						continue;
					}
					//Ball
					else if(usr[i] == Can[j]) {
						ball++;
						System.out.println("Ball");
						continue;
					}
					
					
					
				}
				
			}
			
			stack = 3-(ball+strike);
			
			out = stack + out;
			count ++;
			if(count == 9) break Loop;
			System.out.println(strike+"스트라이크"+ball+"볼"+out+"아웃");
			if(out == 3) break Loop;
			
		}

	}
}
