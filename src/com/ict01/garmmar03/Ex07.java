package com.ict01.garmmar03;
import java.util.Scanner;
class Ex07{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char k3 = sc.next().charAt(0);
		String result = (k3 >= 'A' && k3 <= 'Z')  ? ("�빮��") : ("�빮�ڰ� �ƴ�");	
		System.out.println("k3�� : "+result);
		
	}
}