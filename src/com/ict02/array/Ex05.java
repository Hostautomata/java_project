package com.ict02.array;

public class Ex05 {

	public static void main(String[] args) {

		String[] name = {"ȫ","��","��","��","��"};
		int[] kor = {80,90,80,70,100};
		int[] eng = {80,95,85,75,100};
		int[] math = {100,100,80,100,100};
		int[] rank = {1,1,1,1,1};
		
		//����, ���, ����
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hack = new String[5];
		for(int i = 0; i < name.length; i++) {
			sum[i] = kor[i]+eng[i]+math[i];
			avg[i] = sum[i]/3;
			if(avg[i]>=90) {
				hack[i] = "A";
			}
			else if(avg[i]>=80) {
				hack[i] = "B";
			}
			else if(avg[i]>=70) {
				hack[i] = "C";
			}
			else {
				hack[i] = "F";				
			}
			//escape���� \t�� \n�ٹٲ�  
			
			
		}
		for(int i = 0; i < sum.length; i++) {
			for(int j = 0; j < name.length; j++) {
				if(i==j) continue;
				if(sum[i]<sum[j]) {
					rank[i]++;
				}
			
			}
		System.out.println("�� ��\t�� ��\t�� ��\t�� ��\t�� ��");	
		System.out.print(name[i]+"\t");
		System.out.print(sum[i]+"\t");
		System.out.print(avg[i]+"\t");
		System.out.print(hack[i]+"\t");
		System.out.print(rank[i]+"\t");
		}
		
	}

}
