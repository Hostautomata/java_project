package com.ict02.array;

import java.util.Arrays;
import java.util.Collections;

public class Ex03 {
	public static void main(String[] args) {
		//�迭 ����(��������)
		
		int[] su = {3,4,9,5,6,1,7,2,10,8};

		for (int i = 0; i < su.length; i++) {
			System.out.print(su[i]+" ");
		}
		
		for(int i = 0; i < 9; i++) {
			for(int j = i+1; j < 10; j++) {
				if(su[i]>su[j]) {
					int temp = su[j];
					su[j] = su[i];
					su[i] = temp;
					
				}
			}
		}
		System.out.println();
		for (int i = 0; i < su.length; i++) {
			System.out.print(su[i]+" ");
		}
		System.out.println();
		
		int[] su2 = {3,4,9,5,6,1,7,2,10,8};
		Arrays.sort(su2);//sort �޼ҵ�� �ش� �迭�� ���������ϴ� ����̴�.
		
		for(int i = 0; i < su2.length; i++) {
			System.out.print(su2[i]+" ");
		}

		System.out.println();
		//Integer���߿� ����
		Integer[] su3 = {3,4,9,5,6,1,7,2,10,8};
		Arrays.sort(su3, Collections.reverseOrder());
		for (int i = 0; i < su3.length; i++) {
			System.out.print(su3[i]+" ");
		}
	}
}
