package com.ict01.garmmar03;
import java.util.Scanner;
class Ex06{
	
	public static void main(String[] args){

	//int k2°¡ È¦¼öÀÎÁö Â¦¼öÀÎÁö ÆÇº°
		Scanner sc = new Scanner(System.in);
		int k2 = sc.nextInt();
		String result = (k2%2 == 0) ? ("Â¦¼ö") : ("È¦¼ö");
		System.out.println("k2´Â: "+result);
	}
}