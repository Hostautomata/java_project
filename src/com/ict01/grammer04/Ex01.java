package com.ict01.grammer04;
import java.util.Scanner;
class Ex01{
	public static void main(String[] args){
		//if���� ���ǽ� : boolean��, �񱳿���, ������
		//switch���� byte, short, int, char, String
		//switch���� if������ ��ȯ�� �����ϴ�.




		System.out.println("A,a�� ������ī B,b�� �����, C,c�� ĳ����, �ƴϸ� �ѱ��� ����Ѵ�.");
		Scanner sc = new Scanner(System.in);
		char k1 = sc.next().charAt(0);
		String res = "";		
		switch(k1){//breA,a�� ������ī B,b�� �����, C,c�� ĳ����, �ƴϸ� �ѱ��� ����Ѵ�.

			
			case 'a' :
			case 'A' :
			res = "������ī";
			break;

			case 'b' :
			case 'B' :
			res = "�����";
			break;

			case 'c' :
			case 'C' :
			res = "ĳ����";
			break;

			default :
			res = "�ѱ�";
			break;	
		}
		System.out.println("���: "+res);


		//int k2�� 1�Ǵ� 3�̸� ����, 2�Ǵ� 4�̸� ����
		System.out.println("1�Ǵ� 3�̸� ����, 2�Ǵ� 4�̸� ���ڸ� ����Ѵ�.");
		
		int k2 = sc.nextInt();
		String str = "";
		switch(k2){
			case 1:
			case 3: str = "����"; break;
			case 2:
			case 4: str = "����"; break;
			default:str = "�ܱ���";		
		}
		System.out.println("���: "+str);
		
		//String k3�� �ѱ��̸� ����, �߱��̸� ����¡, �Ϻ��̸� ����
		String str2 = "";
		switch(res){
			case "������ī": str2 = "1"; break;
			case "�����": str2 = "2"; break;
			case "ĳ����": str2 = "3"; break;
			case "�ѱ�": str2 = "4"; break;
			
		}
		System.out.println("���: "+str2);
	}
}