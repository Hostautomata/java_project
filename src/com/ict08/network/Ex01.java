package com.ict08.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {
//InetAddress : 자바에서 IP주소를 표현하는 클래스
//생성자가 존재하지만 사용하지 않는다.
//6개의 static메서드를 이용하여 생성한다.
//	localhost : 현재 내가 사용중인 컴퓨터
//	
//
//
//
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getByName("www.naver.com");
			System.out.println("이름: "+addr.getHostName());
			System.out.println("주소: "+addr.getHostAddress());
			System.out.println("toString: "+addr.toString());
			System.out.println("==========================");
			
			addr = InetAddress.getLocalHost();
			System.out.println("이름: "+addr.getHostName());
			System.out.println("주소: "+addr.getHostAddress());
			System.out.println("toString: "+addr.toString());
			System.out.println("===========================");
			
			InetAddress[] addrs = InetAddress.getAllByName("m.naver.com");
			for (InetAddress k : addrs) {
				System.out.println("이름: "+k.getHostName());
				System.out.println("주소: "+k.getHostAddress());
				System.out.println("toString: "+k.toString());
				System.out.println("----------------------");
				
			}
			
			//125.209.222.137
			byte[] b  = {125,(byte)209,(byte)222,(byte)137};
			addr = InetAddress.getByAddress(b);
			
				System.out.println("이름: "+ addr.getHostName());
				System.out.println("주소: "+ addr.getAddress());
				System.out.println("toString: "+ addr.toString());
				System.out.println("----------------------");
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
