package com.ict02.array;

public class Ex04 {

	public static void main(String[] args) {
		//���� ���ϱ�
		//��� ����� ������ 1������ �ʱ�ȭ �Ѵ�.
		//��� ������ ���ؾ� �Ѵ�.
		//�ڱ� �ڽ��� ���� �ʿ䰡 ����.(i==j)continue���
		//������ ���� ũ�� �� ������ �����Ѵ�.
		int[] su1 = {270,265,280,290,285};
		int[] rank = {1,1,1,1,1};
		for(int i = 0; i< su1.length; i++) {
			for(int j = 0; j<su1.length; j++) {
				if(i == j) continue;
				if(su1[i]<su1[j]) {
					rank[i]++;
				}
			}
			System.out.println(rank[i]);
		}
		
	}

}
