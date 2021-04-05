package com.ict01.garmmar03;
import java.util.Scanner;
class Ex08{
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		int workh = sc.nextInt();
		int overWorkh = workh-8;
		int pay = 8720;
		int overWorkPay = (int)(pay * 0.5);
		int result = (workh > 8) ? (pay*workh + overWorkh*overWorkPay) : (pay*workh);
		System.out.println("현재까지 수당: "+result);
		
	}

}