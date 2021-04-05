package com.ict01.garmmar03;
import java.util.Scanner;
class Ex07{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char k3 = sc.next().charAt(0);
		String result = (k3 >= 'A' && k3 <= 'Z')  ? ("대문자") : ("대문자가 아님");	
		System.out.println("k3는 : "+result);
		
	}
}