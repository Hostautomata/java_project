package com.ict03.class01;

import java.util.Scanner;

public class Ex07_main {
	public static void main(String[] args) {
		Ex07 test = new Ex07();
		String name = test.getName();
		int age = test.getAge();
		double height = test.getHeight();
		boolean human = test.isHuman();
		char rank = test.getRank();
		
		System.out.println("이름 : "+name+" 나이 : "+age+"\n"
				+ "키 : "+height+" 랭크 : "+rank+" 사람 :"+human);

		System.out.println();
		Scanner sc = new Scanner(System.in);


			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("나이 : ");
			age = sc.nextInt();
			System.out.print("키 : ");	
			height = sc.nextDouble();
			System.out.print("랭크 : ");		
			rank = (char)sc.next().charAt(0);
			System.out.print("사람 : ");		
			human = sc.nextBoolean();
			
			test.setName(name);
			test.setAge(age);
			test.setHeight(height);
			test.setRank(rank);
			test.setHuman(human);
			
			name = test.getName();
			age = test.getAge();
			height = test.getHeight();
			rank = (char)test.getRank();
			human = test.isHuman();
			
			System.out.println("이름 : "+name+" 나이 : "+age+"\n"
					+ "키 : "+height+" 랭크 : "+rank+" 사람 :"+human);

	}
}
