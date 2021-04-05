package com.ict03.class02;

public class Ex01 {
	public static void main(String[] args) {
		// String 클래스
		String str1 = "abc";
		char[] data = { 'a', 'b', 'c' };
		String str2 = new String(data);

		byte[] data2 = { 97, 98, 99 };
		String str3 = new String(data2);

		String str4 = new String("abc");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println();
		String msg = "한국ICT인재 개발원 01강의장";
		// 1. charAt(int index) : char
		// 위치 값을 받아서 해당 위치에 존재하는 문자를 char형으로 반환한다.
		// index는 0부터 시작한다.+띄어쓰기도 자리이다.
		char c1 = msg.charAt(8);
		System.out.println(c1);
		// 다음 문자 중 소문자를 대문자로 변경하시오.
		// a = 97, A = 65이다.
		msg = "대한 I Love You 123";
		// 문자열의 길이를 구할때 : length() : int
		System.out.println(msg.length());
		for (int i = 0; i < msg.length(); i++) {
			char c2 = msg.charAt(i);
			if (c2 >= 'a' && c2 <= 'z') {
				c2 = (char) (c2 - 32);
			}
			System.out.print(c2);
		}
		System.out.println();
		// 2. concat(String str) : String
		// 지정한 문자열을 이 문자열 끝에 연결합니다.
		String msg1 = "대한민국";
		String msg2 = "KOREA";
		String msg3 = msg1.concat(msg2);
		System.out.println(msg3);
		System.out.println(msg1 + msg2);
		// String은 변하지 않는다. 따라서 문자열의 합을 하면 실제 값을 합치는게 아니라
		// 새로 생성하여 원래 값이 쓰레기 값으로 남는다.

		// 3. contains(String s) : boolean
		// 해당 문자열에 포함되있으면 true반환
		msg = "대한 I Love You 123";
		boolean b1 = msg.contains("You");
		if (b1) {
			System.out.println("포함되어 있다.");
		} else {
			System.out.println("포함되어 있지 않다.");
		}
		System.out.println();

		// 4.equals(Object anObject) : boolean
		// 받은 문자열 = 현재 문자열 -> true 아니면 false (대소문자 구별O)

		// 5. equalsIgnoreCase(String anotherString) : boolean
		// 받은 문자열 = 현재 문자열 -> true 아니면 false (대소문자 구별X)
		// **주의사항 : 문자열이나 객체를 비교할 때 '=='를 사용하면 내용이 아닌 주솟값으로 비교하게 된다.
		// 문자열에는 '==' 대신 eqquals, equalsIgnoreCase를 사용해야 내용을 비교할 수 있음.
		String s1 = "Korea";
		String s2 = "KOREA";
		String s3 = new String("Korea");
		String s4 = new String("Korea");
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s3 == s4);
		System.out.println();
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println();

		s1 = "seoul";
		s2 = "seoul";
		System.out.println(s1 == s2);// 주소가 같음.
		System.out.println(s1.equalsIgnoreCase(s2));// 내용이 같음.

		// 6. format(String format, Object... args) : static String
		// ... : 갯수가 정해져 있지 않다.
		// 형식을 지정하고 형식에 맞게 생성한다.
		// %s 는 문자열, %d는 정수, %f는 실수(**원하는 자릿수까지 반올림 가능)
		String msg4 = "한국 ICT 인재개발원";
		int s5 = 14;
		double s6 = 89.167;
		String msg5 = msg4.format("%s의 시작 년도는 %d년 이고 평균점수는 %.2f이다.", msg4, s5, s6);
		System.out.println(msg5);

		// 7. getBytes() : byte[]
		// 해당 문자열을 byte배열로 변경
		// 보통 입/출력 스트림 할 때 사용한다.(대소문자와 숫자만 가능)
		String msg6 = "java";
		byte[] b = msg6.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println((char) b[i] + ": " + b[i]);
		}
		// 반대로 해당 byte배열을 문자열로 만들 수 있다.(String생성자 이용)
		String msg7 = new String(b);
		System.out.println(msg7);

		// 8. toCharArray() : char[]
		// 해당 문자열을 char배열로 변경
		// 보통 입/출력 스트림 할 때 사용한다.(전세계 문자 가능)
		String msg8 = "자바8 java8 大韓民國123";
		char[] c = msg8.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		// 반대로 해당 char배열을 문자열로 만들 수도 있다.(String 생성자 이용)
		String msg9 = new String(c);
		System.out.println(msg9);

		// 9. indexOf(int ch) : int
		// 문자를 받아서 해당 문자의 위치값을 표시 (charAt()의 반대)
		// 시작위치는 처음부터 , 찾는 문자가 없으면 -1 이다.
		// 10. indexOf(int ch, int fromIndex) : int
		// 문자와 시작 위치를 받아서 해당 문자의 위치값을 표시 (charAt()의 반대)
		// 시작위치를 받아서 , 찾는 문자가 없으면 -1 이다.
		// 11. indexOf(String str) : int
		// 문자열을 받아서 해당 문자열의 위치값을 표시
		// 시작위치는 처음부터 , 찾는 문자가 없으면 -1 이다.
		// 12. indexOf(String str, int fromIndex) : int
		// 문자열과 시작 위치를 받아서 해당 문자열의 위치값을 표시 
		// 시작위치를 받아서 ,시찾는 문자가 없으면 -1 이다.
		String msg10 = "BufferedReader";
		// 'e'를 찾아라.
		int k1 = msg10.indexOf('e');
		System.out.println(k1);
		//두번 째 'e'를 찾아라 : 'e'의 위치값+1
		int k2 = msg10.indexOf('e', msg10.indexOf('e')+1);
		System.out.println(k2);
		//세번째 'e'를 찾아라 
		int k3 = msg10.indexOf('e',msg10.indexOf('e', msg10.indexOf('e')+1)+1);
		System.out.println(k3);
		
		//보통 contains로 여부를 판단해서 사용한다.
		
		
		//없는 글자 찾기('A')
		k1 = msg10.indexOf('A');
		System.out.println(k1);//없는 글자를 찾으면 -1 값 반환
		
		b1 = msg10.contains("A");
		System.out.println(b1);//false
		
		//char말고 String 으로 찾기
		k1 = msg10.indexOf("er");
		System.out.println(k1);
		k1 = msg10.indexOf("er",msg10.indexOf("er")+1);
		System.out.println(k1);
		
		//11. lastIndexOf(int ch) : int
		//		lastIndexOf(String str) : int
		// 		찾는 마지막 문자나 문자열의 위치를 표시
		k1 = msg10.lastIndexOf('e');
		System.out.println(k1);
		k1 = msg10.lastIndexOf("er");
		System.out.println(k1);
		
		
		//12. isEmpty()	: boolean
		//	문자열의 길이가 0이면 true, 아니면 false
		//	비어있으면 true, 아니면 false
		//13. length() : int
		//	문자열의 길이를 숫자로 표시
		String msg11 = "";//null과 다름.
		String msg12 = "java";
		
		System.out.println(msg11.isEmpty());//true
		System.out.println(msg12.isEmpty());//false
		
		System.out.println(msg11.length());	//0
		System.out.println(msg12.length());	//4
		
		//14. 	replace(char oldChar, char newChar)	: String
		//	replaceAll(String regex, String replacement) :String
		//		문자나 문자열을 받아서 치환하기
		String msg13 = "대한민국";
		String msg14 = msg13.replace("대한민국", "Korea");
		String msg15 = msg13.replace(msg13, "Korea");
		String msg16 = msg13.replace('한', '韓');
		System.out.println(msg14);
		System.out.println(msg15);
		System.out.println(msg16);
		
		//15. split(String regex) : String[]
		//	  구분자를 받아서 배열로 나눈다.(배열 크기는 자동으로)
		//	  split(String regex, int limit) : String[]
		//	  구분자를 받아서 배열로 나눈다.(배열 크기는 limit로)
		
		String msg17 = "사과, 딸기, 망고, 오렌지, 파인애플";
		String[] res = msg17.split(",");
		for(int i = 0; i < res.length; i++) {	
			System.out.print(res[i]);
		}
		System.out.println();
		String[] res2 = msg17.split(",",2);
		for(int i = 0; i < res2.length; i++) {	
			System.out.print(res2[i]);
		}
		System.out.println();

		String[] res3 = msg17.split(",",10);
		for(int i = 0; i < res3.length; i++) {	
			System.out.println("i= "+i+", res = "+ res3[i]);
		}
		
		//16. substring(int beginIndex) : String
		//		시작위치를 받아서 해당 문자열 끝까지 문자열 추출
		//16. substring(int beginIndex, int endIndex) : String
		//		시작위치와 끝 위치를 받아서 해당 문자열 추출(끝위치는 포함 안함)
		String msg18 = "010-7979-9999";
		String res4 = msg18.substring(4);
		String res5 = msg18.substring(4);
		String res6 = msg18.substring(msg18.indexOf('-')+1,msg18.lastIndexOf('-'));
		System.out.println(res4);
		System.out.println(res5);
		System.out.println(res6);
		
		String msg19 = "770707";
		//충생년도 추출
		String res7 = msg.substring(0,2);
		//태어난 달 추출
		String res8 = msg.substring(0,2);
		
		
		
		
		
		
		
		
		//17. toLowerCase() : String
		//		해당 문자열의 모든 대문자를 소문자로 치환
		//18. toUpperCase() : String
		//		해당 문자열의 모든 소문자를 대문자로 치환
		
		String msg20 = "자바8 java8 Java8";
		String res9 = msg20.toLowerCase();
		System.out.println(res9);
		String res10 = msg20.toUpperCase();
		System.out.println(res10);
		
		//19. toString() : String
		//	String의 toString(): 문자열 자체를 반환
		//	Object의 toString(): 모든 객체에서 사용가능
//								객체가 가지고 있는 정보나 값들을 문자열로 리턴할 때 사용
		//						(오버라이딩 때 다시배움.)
		//Android에서 반드시 사용해야 하는 것들.
		String msg21 = "java8 Java8 자바8";
		String res11 = msg21.toString();
		System.out.println();
		System.out.println(msg21);
		System.out.println();
		System.out.println(res11);
		
		//20. trim() : String
		//	해당 문자열의 앞, 뒤 공백을 제거, 중간 공백은 제거 못함. (중간 공백은 문자취급.)
		String msg22 = " 	java 자바 JAVA 	";
		System.out.println(msg22);
		System.out.println(msg22.length());
		System.out.println();
		String res12 = msg22.trim();
		System.out.println(res12);
		System.out.println(res12.length());
		System.out.println();
		//21. valueOf(각종 자료형) : static String
		//	어떤 자료형이든지 String으로 변경시킴
		boolean p1 = true;
		char p2 = 'd';
		int p3 = 100;
		long p4 = 100L;
		float p5 = 100.0f;
		double p6 = 100.0;
		
		//각종 자료형에 +1;
		//System.out.println(p1+1); // boolean은 + 연산을 할 수 없다.
		System.out.println(p2+1);
		System.out.println(p3+1);
		System.out.println(p4+1);
		System.out.println(p5+1);
		System.out.println(p6+1);
		System.out.println();
		
		System.out.println(String.valueOf(p1)+1);
		System.out.println(String.valueOf(p2)+1);
		System.out.println(String.valueOf(p3)+1);
		System.out.println(String.valueOf(p4)+1);
		System.out.println(String.valueOf(p5)+1);
		System.out.println(String.valueOf(p6)+1);
		System.out.println();
		
		//메모리상 쓰레기값이 6개 더 생성됨.
		System.out.println(p1 + "1");
		System.out.println(p2 + "1");
		System.out.println(p3 + "1");
		System.out.println(p4 + "1");
		System.out.println(p5 + "1");
		System.out.println(p6 + "1");
		
		
		//21의 반대 개념 (각종 자료형모양 문자열을 각각의 자료형으로 변경)
		//Wrapper Class(Boolean, Integer, Double, Byte, Long, Float, Character)
		//				parseXXXX(String s) 메서드를 이용해서 변경이 가능(Character제외)
		//				-> char형은 String.charAt();을 이용.
		//	 각 자료형의 형태를 가진 문자열을 진짜 자료형으로 변경 시키는 클래스들
		//	 원래는 기본 자료형을 객체로 만들 때 사용(이제는 자동으로 만들어짐.=오토박싱)
		//   오토박싱의 반대 : 오토 박싱

		// 1. boolean 형태의 문자열을 Boolean형으로 변경
		// boolean은 인자에 String을 받을 수 있기 때문에 
		//Boolean.parseBoolean("true"); Boolean.parseBoolean("아무글자")=>false;
		/*msg = "true"; boolean형이 아니라서 오류		
		if(msg) {
			break;
		}*/
		boolean a1 = Boolean.parseBoolean("true");//
		if(a1) {
			System.out.println("변경 성공");
		}
		
		//2. int 형태의 문자열을 int 형으로 변경 : Integer.parseInt(String s)
		//	byte,short도 마찬가지
		msg = "1";
		int a2 = Integer.parseInt(msg);
		System.out.println(a2+1);
		System.out.println(msg+1);
		
		//3. double 형태의 문자형을 double로 변경 : Double.parseDouble(String s)
		msg = "10.0";
		double a3 = Double.parseDouble(msg);
		System.out.println(a3+1);
		System.out.println(msg+1);
		//4. Char형태의 문자열을 char형으로 변경할 메서드는 존재하지 않는다.
		msg = "c";
		char a4 = msg.charAt(0);
		System.out.println(a4+1);
		System.out.println(msg+1);

		//주민번호 앞자리를 받았다. 나이를 구하라
		String jumin = "971212";
		String gender = "1";
		int y_year = Integer.parseInt(jumin.substring(0,2));
		if(gender.equals("1")||gender.equals("2")) {
			y_year = y_year + 1900;
		}else if(gender.equals("3")||gender.equals("4")) {
			y_year = y_year + 2000;
		}
		int age = 2021-y_year + 1;
		System.out.println("나이는 "+ age + "입니다.");
	}
}
