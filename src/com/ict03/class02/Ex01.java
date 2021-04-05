package com.ict03.class02;

public class Ex01 {
	public static void main(String[] args) {
		// String Ŭ����
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
		String msg = "�ѱ�ICT���� ���߿� 01������";
		// 1. charAt(int index) : char
		// ��ġ ���� �޾Ƽ� �ش� ��ġ�� �����ϴ� ���ڸ� char������ ��ȯ�Ѵ�.
		// index�� 0���� �����Ѵ�.+���⵵ �ڸ��̴�.
		char c1 = msg.charAt(8);
		System.out.println(c1);
		// ���� ���� �� �ҹ��ڸ� �빮�ڷ� �����Ͻÿ�.
		// a = 97, A = 65�̴�.
		msg = "���� I Love You 123";
		// ���ڿ��� ���̸� ���Ҷ� : length() : int
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
		// ������ ���ڿ��� �� ���ڿ� ���� �����մϴ�.
		String msg1 = "���ѹα�";
		String msg2 = "KOREA";
		String msg3 = msg1.concat(msg2);
		System.out.println(msg3);
		System.out.println(msg1 + msg2);
		// String�� ������ �ʴ´�. ���� ���ڿ��� ���� �ϸ� ���� ���� ��ġ�°� �ƴ϶�
		// ���� �����Ͽ� ���� ���� ������ ������ ���´�.

		// 3. contains(String s) : boolean
		// �ش� ���ڿ��� ���Ե������� true��ȯ
		msg = "���� I Love You 123";
		boolean b1 = msg.contains("You");
		if (b1) {
			System.out.println("���ԵǾ� �ִ�.");
		} else {
			System.out.println("���ԵǾ� ���� �ʴ�.");
		}
		System.out.println();

		// 4.equals(Object anObject) : boolean
		// ���� ���ڿ� = ���� ���ڿ� -> true �ƴϸ� false (��ҹ��� ����O)

		// 5. equalsIgnoreCase(String anotherString) : boolean
		// ���� ���ڿ� = ���� ���ڿ� -> true �ƴϸ� false (��ҹ��� ����X)
		// **���ǻ��� : ���ڿ��̳� ��ü�� ���� �� '=='�� ����ϸ� ������ �ƴ� �ּڰ����� ���ϰ� �ȴ�.
		// ���ڿ����� '==' ��� eqquals, equalsIgnoreCase�� ����ؾ� ������ ���� �� ����.
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
		System.out.println(s1 == s2);// �ּҰ� ����.
		System.out.println(s1.equalsIgnoreCase(s2));// ������ ����.

		// 6. format(String format, Object... args) : static String
		// ... : ������ ������ ���� �ʴ�.
		// ������ �����ϰ� ���Ŀ� �°� �����Ѵ�.
		// %s �� ���ڿ�, %d�� ����, %f�� �Ǽ�(**���ϴ� �ڸ������� �ݿø� ����)
		String msg4 = "�ѱ� ICT ���簳�߿�";
		int s5 = 14;
		double s6 = 89.167;
		String msg5 = msg4.format("%s�� ���� �⵵�� %d�� �̰� ��������� %.2f�̴�.", msg4, s5, s6);
		System.out.println(msg5);

		// 7. getBytes() : byte[]
		// �ش� ���ڿ��� byte�迭�� ����
		// ���� ��/��� ��Ʈ�� �� �� ����Ѵ�.(��ҹ��ڿ� ���ڸ� ����)
		String msg6 = "java";
		byte[] b = msg6.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println((char) b[i] + ": " + b[i]);
		}
		// �ݴ�� �ش� byte�迭�� ���ڿ��� ���� �� �ִ�.(String������ �̿�)
		String msg7 = new String(b);
		System.out.println(msg7);

		// 8. toCharArray() : char[]
		// �ش� ���ڿ��� char�迭�� ����
		// ���� ��/��� ��Ʈ�� �� �� ����Ѵ�.(������ ���� ����)
		String msg8 = "�ڹ�8 java8 ��������123";
		char[] c = msg8.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		// �ݴ�� �ش� char�迭�� ���ڿ��� ���� ���� �ִ�.(String ������ �̿�)
		String msg9 = new String(c);
		System.out.println(msg9);

		// 9. indexOf(int ch) : int
		// ���ڸ� �޾Ƽ� �ش� ������ ��ġ���� ǥ�� (charAt()�� �ݴ�)
		// ������ġ�� ó������ , ã�� ���ڰ� ������ -1 �̴�.
		// 10. indexOf(int ch, int fromIndex) : int
		// ���ڿ� ���� ��ġ�� �޾Ƽ� �ش� ������ ��ġ���� ǥ�� (charAt()�� �ݴ�)
		// ������ġ�� �޾Ƽ� , ã�� ���ڰ� ������ -1 �̴�.
		// 11. indexOf(String str) : int
		// ���ڿ��� �޾Ƽ� �ش� ���ڿ��� ��ġ���� ǥ��
		// ������ġ�� ó������ , ã�� ���ڰ� ������ -1 �̴�.
		// 12. indexOf(String str, int fromIndex) : int
		// ���ڿ��� ���� ��ġ�� �޾Ƽ� �ش� ���ڿ��� ��ġ���� ǥ�� 
		// ������ġ�� �޾Ƽ� ,��ã�� ���ڰ� ������ -1 �̴�.
		String msg10 = "BufferedReader";
		// 'e'�� ã�ƶ�.
		int k1 = msg10.indexOf('e');
		System.out.println(k1);
		//�ι� ° 'e'�� ã�ƶ� : 'e'�� ��ġ��+1
		int k2 = msg10.indexOf('e', msg10.indexOf('e')+1);
		System.out.println(k2);
		//����° 'e'�� ã�ƶ� 
		int k3 = msg10.indexOf('e',msg10.indexOf('e', msg10.indexOf('e')+1)+1);
		System.out.println(k3);
		
		//���� contains�� ���θ� �Ǵ��ؼ� ����Ѵ�.
		
		
		//���� ���� ã��('A')
		k1 = msg10.indexOf('A');
		System.out.println(k1);//���� ���ڸ� ã���� -1 �� ��ȯ
		
		b1 = msg10.contains("A");
		System.out.println(b1);//false
		
		//char���� String ���� ã��
		k1 = msg10.indexOf("er");
		System.out.println(k1);
		k1 = msg10.indexOf("er",msg10.indexOf("er")+1);
		System.out.println(k1);
		
		//11. lastIndexOf(int ch) : int
		//		lastIndexOf(String str) : int
		// 		ã�� ������ ���ڳ� ���ڿ��� ��ġ�� ǥ��
		k1 = msg10.lastIndexOf('e');
		System.out.println(k1);
		k1 = msg10.lastIndexOf("er");
		System.out.println(k1);
		
		
		//12. isEmpty()	: boolean
		//	���ڿ��� ���̰� 0�̸� true, �ƴϸ� false
		//	��������� true, �ƴϸ� false
		//13. length() : int
		//	���ڿ��� ���̸� ���ڷ� ǥ��
		String msg11 = "";//null�� �ٸ�.
		String msg12 = "java";
		
		System.out.println(msg11.isEmpty());//true
		System.out.println(msg12.isEmpty());//false
		
		System.out.println(msg11.length());	//0
		System.out.println(msg12.length());	//4
		
		//14. 	replace(char oldChar, char newChar)	: String
		//	replaceAll(String regex, String replacement) :String
		//		���ڳ� ���ڿ��� �޾Ƽ� ġȯ�ϱ�
		String msg13 = "���ѹα�";
		String msg14 = msg13.replace("���ѹα�", "Korea");
		String msg15 = msg13.replace(msg13, "Korea");
		String msg16 = msg13.replace('��', '��');
		System.out.println(msg14);
		System.out.println(msg15);
		System.out.println(msg16);
		
		//15. split(String regex) : String[]
		//	  �����ڸ� �޾Ƽ� �迭�� ������.(�迭 ũ��� �ڵ�����)
		//	  split(String regex, int limit) : String[]
		//	  �����ڸ� �޾Ƽ� �迭�� ������.(�迭 ũ��� limit��)
		
		String msg17 = "���, ����, ����, ������, ���ξ���";
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
		//		������ġ�� �޾Ƽ� �ش� ���ڿ� ������ ���ڿ� ����
		//16. substring(int beginIndex, int endIndex) : String
		//		������ġ�� �� ��ġ�� �޾Ƽ� �ش� ���ڿ� ����(����ġ�� ���� ����)
		String msg18 = "010-7979-9999";
		String res4 = msg18.substring(4);
		String res5 = msg18.substring(4);
		String res6 = msg18.substring(msg18.indexOf('-')+1,msg18.lastIndexOf('-'));
		System.out.println(res4);
		System.out.println(res5);
		System.out.println(res6);
		
		String msg19 = "770707";
		//����⵵ ����
		String res7 = msg.substring(0,2);
		//�¾ �� ����
		String res8 = msg.substring(0,2);
		
		
		
		
		
		
		
		
		//17. toLowerCase() : String
		//		�ش� ���ڿ��� ��� �빮�ڸ� �ҹ��ڷ� ġȯ
		//18. toUpperCase() : String
		//		�ش� ���ڿ��� ��� �ҹ��ڸ� �빮�ڷ� ġȯ
		
		String msg20 = "�ڹ�8 java8 Java8";
		String res9 = msg20.toLowerCase();
		System.out.println(res9);
		String res10 = msg20.toUpperCase();
		System.out.println(res10);
		
		//19. toString() : String
		//	String�� toString(): ���ڿ� ��ü�� ��ȯ
		//	Object�� toString(): ��� ��ü���� ��밡��
//								��ü�� ������ �ִ� ������ ������ ���ڿ��� ������ �� ���
		//						(�������̵� �� �ٽù��.)
		//Android���� �ݵ�� ����ؾ� �ϴ� �͵�.
		String msg21 = "java8 Java8 �ڹ�8";
		String res11 = msg21.toString();
		System.out.println();
		System.out.println(msg21);
		System.out.println();
		System.out.println(res11);
		
		//20. trim() : String
		//	�ش� ���ڿ��� ��, �� ������ ����, �߰� ������ ���� ����. (�߰� ������ �������.)
		String msg22 = " 	java �ڹ� JAVA 	";
		System.out.println(msg22);
		System.out.println(msg22.length());
		System.out.println();
		String res12 = msg22.trim();
		System.out.println(res12);
		System.out.println(res12.length());
		System.out.println();
		//21. valueOf(���� �ڷ���) : static String
		//	� �ڷ����̵��� String���� �����Ŵ
		boolean p1 = true;
		char p2 = 'd';
		int p3 = 100;
		long p4 = 100L;
		float p5 = 100.0f;
		double p6 = 100.0;
		
		//���� �ڷ����� +1;
		//System.out.println(p1+1); // boolean�� + ������ �� �� ����.
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
		
		//�޸𸮻� �����Ⱚ�� 6�� �� ������.
		System.out.println(p1 + "1");
		System.out.println(p2 + "1");
		System.out.println(p3 + "1");
		System.out.println(p4 + "1");
		System.out.println(p5 + "1");
		System.out.println(p6 + "1");
		
		
		//21�� �ݴ� ���� (���� �ڷ������ ���ڿ��� ������ �ڷ������� ����)
		//Wrapper Class(Boolean, Integer, Double, Byte, Long, Float, Character)
		//				parseXXXX(String s) �޼��带 �̿��ؼ� ������ ����(Character����)
		//				-> char���� String.charAt();�� �̿�.
		//	 �� �ڷ����� ���¸� ���� ���ڿ��� ��¥ �ڷ������� ���� ��Ű�� Ŭ������
		//	 ������ �⺻ �ڷ����� ��ü�� ���� �� ���(������ �ڵ����� �������.=����ڽ�)
		//   ����ڽ��� �ݴ� : ���� �ڽ�

		// 1. boolean ������ ���ڿ��� Boolean������ ����
		// boolean�� ���ڿ� String�� ���� �� �ֱ� ������ 
		//Boolean.parseBoolean("true"); Boolean.parseBoolean("�ƹ�����")=>false;
		/*msg = "true"; boolean���� �ƴ϶� ����		
		if(msg) {
			break;
		}*/
		boolean a1 = Boolean.parseBoolean("true");//
		if(a1) {
			System.out.println("���� ����");
		}
		
		//2. int ������ ���ڿ��� int ������ ���� : Integer.parseInt(String s)
		//	byte,short�� ��������
		msg = "1";
		int a2 = Integer.parseInt(msg);
		System.out.println(a2+1);
		System.out.println(msg+1);
		
		//3. double ������ �������� double�� ���� : Double.parseDouble(String s)
		msg = "10.0";
		double a3 = Double.parseDouble(msg);
		System.out.println(a3+1);
		System.out.println(msg+1);
		//4. Char������ ���ڿ��� char������ ������ �޼���� �������� �ʴ´�.
		msg = "c";
		char a4 = msg.charAt(0);
		System.out.println(a4+1);
		System.out.println(msg+1);

		//�ֹι�ȣ ���ڸ��� �޾Ҵ�. ���̸� ���϶�
		String jumin = "971212";
		String gender = "1";
		int y_year = Integer.parseInt(jumin.substring(0,2));
		if(gender.equals("1")||gender.equals("2")) {
			y_year = y_year + 1900;
		}else if(gender.equals("3")||gender.equals("4")) {
			y_year = y_year + 2000;
		}
		int age = 2021-y_year + 1;
		System.out.println("���̴� "+ age + "�Դϴ�.");
	}
}
