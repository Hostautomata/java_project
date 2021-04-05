package com.ict02.array;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		int[] rank = {1,1,1,1,1};

		for(int i = 0; i<name.length ;i++) {
			System.out.print("이름:");
			name[i] = sc.next();
			System.out.print("\t국어:");
			kor[i] = sc.nextInt();
			System.out.print("\t영어:");
			eng[i] = sc.nextInt();
			System.out.print("\t수학:");			
			math[i] = sc.nextInt();
			System.out.println();
			
			sum[i] = kor[i]+eng[i]+math[i];
			avg[i] = sum[i]/3;

			if(avg[i]>=90) {
				hak[i] = "A";
			}
			else if(avg[i]>=80) {
				hak[i] = "B";
			}
			else if(avg[i]>=70) {
				hak[i] = "C";
			}
			else {
				hak[i] = "F";				
			}
		}

		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for(int i = 0; i < sum.length; i++) {
			for(int j = 0; j < name.length; j++) {
				if(i==j) continue;
				if(sum[i]<sum[j]) {
					rank[i]++;
				}
			
			}	
		System.out.print(name[i]+"\t");
		System.out.print(sum[i]+"\t");
		System.out.print(avg[i]+"\t");
		System.out.print(hak[i]+"\t");
		System.out.print(rank[i]+"\t");
		System.out.println();
		}
	}
}
