package com.ict01.garmmar03;
import java.util.Scanner;
class Ex09{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char k1 = sc.next().charAt(0);
		String result = (k1>='A'&&k1<='Z')?"�빮��"
		:(k1>='a'&&k1<='z')?"�ҹ���":"����ƴ�";
		System.out.println(k1+"��(��) "+result);

		int k2 = sc.nextInt();
		result = (k2>=90)?"A":(k2>=80)?"B":"F";
		System.out.println(k2+"��(��) "+result);

		int k3 = sc.nextInt();
		result  = (k3==1||k3==3)?"����"
		:(k3==2||k3==4)?"����":"�ܱ���";
		System.out.println(k3+"��(��) " +result);

		
	}
}