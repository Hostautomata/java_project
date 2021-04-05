package com.ict02.array;


public class Ex09 {
	public static void main(String[] args) {
		int[][] persons = new int[5][];
		//번호, 총점, 평균, 학점, 순위
		int[] person01 = {1,270,90,'A',1};
		int[] person02 = {2,210,70,'C',1};
		int[] person03 = {3,180,60,'F',1};
		int[] person04 = {4,300,100,'A',1};
		int[] person05 = {5,285,95,'A',1};
		
		persons[0] = person01;
		persons[1] = person02;
		persons[2] = person03;
		persons[3] = person04;
		persons[4] = person05;
		
		for(int i = 0;i < persons.length; i++) {
			for(int j = 0; j < persons.length; j++) {
				
				if(persons[i][2]<persons[j][2]) {
					persons[i][4]++;
				}
			}
		}

		System.out.println("번호\t총점\t평균\t학점\t순위");
		for (int i = 0; i < persons.length; i++) {
			for (int j = 0; j < persons[i].length; j++) {
				if(j == 3) {
					System.out.print((char)persons[i][j]+"\t");
				}else {
					System.out.print(persons[i][j]+"\t");					
				}
				
			}
			System.out.println();
		}
		
		
		
	}
}
