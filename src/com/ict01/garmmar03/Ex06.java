package com.ict01.garmmar03;
import java.util.Scanner;
class Ex06{
	
	public static void main(String[] args){

	//int k2�� Ȧ������ ¦������ �Ǻ�
		Scanner sc = new Scanner(System.in);
		int k2 = sc.nextInt();
		String result = (k2%2 == 0) ? ("¦��") : ("Ȧ��");
		System.out.println("k2��: "+result);
	}
}