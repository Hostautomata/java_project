package com.ict07.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex20 {
	public static void main(String[] args) {
		//바이트-문자결합 : 체인방식
		//입력 : InputStreamReader >> Reader
		//		InputStream -> *InputStreamReader -> Reader -> *BufferedReader
		//		*실제 사용하는 것		
		
		
	
//		Scanner sc = new Scanner(System.in);
//		System.out.print("원하는 문자를 입력 : ");
//		String msg = sc.next();
//		
//		System.out.println("받은 문자 : "+msg);
		
		
		//Scanner구현
		System.out.print("원하는 문자를 입력 : ");
		InputStreamReader isr = null;
		BufferedReader br = null;	
		try {
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			String msg = br.readLine();
			
			System.out.println("받은 정보 : "+msg);
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				isr.close();
			} catch (Exception e2) {
			}
		}
	}
}
