package com.ict01.grammer04;
import java.util.Scanner;
class Ex01{
	public static void main(String[] args){
		//if문의 조건식 : boolean형, 비교연산, 논리연산
		//switch문은 byte, short, int, char, String
		//switch문은 if문으로 변환이 가능하다.




		System.out.println("A,a면 아프리카 B,b면 브라질, C,c면 캐나다, 아니면 한국을 출력한다.");
		Scanner sc = new Scanner(System.in);
		char k1 = sc.next().charAt(0);
		String res = "";		
		switch(k1){//breA,a면 아프리카 B,b면 브라질, C,c면 캐나다, 아니면 한국을 출력한다.

			
			case 'a' :
			case 'A' :
			res = "아프리카";
			break;

			case 'b' :
			case 'B' :
			res = "브라질";
			break;

			case 'c' :
			case 'C' :
			res = "캐나다";
			break;

			default :
			res = "한국";
			break;	
		}
		System.out.println("결과: "+res);


		//int k2가 1또는 3이면 남자, 2또는 4이면 여자
		System.out.println("1또는 3이면 남자, 2또는 4이면 여자를 출력한다.");
		
		int k2 = sc.nextInt();
		String str = "";
		switch(k2){
			case 1:
			case 3: str = "남자"; break;
			case 2:
			case 4: str = "여자"; break;
			default:str = "외국인";		
		}
		System.out.println("결과: "+str);
		
		//String k3이 한국이면 서울, 중국이면 베이징, 일본이면 도쿄
		String str2 = "";
		switch(res){
			case "아프리카": str2 = "1"; break;
			case "브라질": str2 = "2"; break;
			case "캐나다": str2 = "3"; break;
			case "한국": str2 = "4"; break;
			
		}
		System.out.println("결과: "+str2);
	}
}