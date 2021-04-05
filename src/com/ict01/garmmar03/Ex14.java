package com.ict01.garmmar03;


class Ex14{
	public static void main(String[] args){
		
		int k1 = 0;
		char res1 ;
		if(k1 >= 90){
			res1 = 'A';
		}
		else if(k1 >= 80&&k1 < 90){
			res1 = 'B';
		}
		else if(k1 >= 70&&k1 < 80){
			res1 = 'C';
		}
		else{
			res1 = 'F';
		}
		System.out.println(res1);

		char k2 = ' ';
		String res2 = "";
		if(k2 > 'A'&&k2 < 'Z'){
			res2 = "대문자";
		}
		else if(k2 > 'a'&&k2 < 'z'){
			res2 = "소문자";
		}
		else{
			res2="기타문자";
		}
		
		System.out.println(res2);
		
		char k3 = ' ';
		String res3 = "";
		if(k3 == 'A' || k3 == 'a'){
			res3 = "아프리카";
		}
		else if(k3 == 'B' || k3 == 'b'){
			res3 = "브라질";
		}
		else if(k3 == 'C' || k3 == 'c'){
			res3 = "캐나다";
		}
		else{
			res3 = "한국";
		}
		
		System.out.println(res3);


		int menu = 0;
		int su = 0;
		int pay = 0;
		
		if(menu == 1){
			pay = 3500;
		}
		else if(menu == 2){
			pay = 3000;	
		}		
		else if(menu == 3){
			pay = 3500;	
		}		
		else if(menu == 4){
			pay = 4000;
		}		
			
		int result = pay * su;

		System.out.println("총 금액은 :"+result);				
	}
}