package com.ict02.array;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//번호 국영수점수를 입력받아서
		//번호 총점 평균 학점 순위를 구하고 정렬하자.
		int[][] arr = new int[5][5];
		for(int i = 0;i <arr.length; i++ ) {
			System.out.println("번호 : ");
			int no = sc.nextInt();
			System.out.println("국어 : ");

			int kor = sc.nextInt();
			System.out.println("영어 : ");

			int eng = sc.nextInt();
			System.out.println("수학 : ");

			int math = sc.nextInt();
			
			int sum = kor+eng+math;
			int avg = sum/3;
			int rank = 1;
			
			
			arr[i][0] = no;
			arr[i][1] = sum;
			arr[i][2] = avg;
			arr[i][4] = rank;
		}
		for(int i = 0;i < arr.length; i++) {
			if(arr[i][2]>=90) {
				arr[i][3] = 'A';
			}
			else if(arr[i][2]>=80) {
				arr[i][3] = 'B';
			}
			else if(arr[i][2]>=70) {
				arr[i][3] = 'C';
			}
			else{
				arr[i][3] = 'F';
			}
		}
		for(int i = 0;i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				
				if(arr[i][2]<arr[j][2]) {
					arr[i][4]++;
				}
			}
		}

		System.out.println("번호\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j == 3) {
					System.out.print((char)arr[i][j]+"\t");
				}else {
					System.out.print(arr[i][j]+"\t");					
				}
				
			}
			System.out.println();
		}
		
		
	}
}
