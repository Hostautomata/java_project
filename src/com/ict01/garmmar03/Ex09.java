package com.ict01.garmmar03;
import java.util.Scanner;
class Ex09{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char k1 = sc.next().charAt(0);
		String result = (k1>='A'&&k1<='Z')?"대문자"
		:(k1>='a'&&k1<='z')?"소문자":"영어가아님";
		System.out.println(k1+"은(는) "+result);

		int k2 = sc.nextInt();
		result = (k2>=90)?"A":(k2>=80)?"B":"F";
		System.out.println(k2+"은(는) "+result);

		int k3 = sc.nextInt();
		result  = (k3==1||k3==3)?"남자"
		:(k3==2||k3==4)?"여자":"외국인";
		System.out.println(k3+"은(는) " +result);

		
	}
}