package com.ict07.IO;

import java.io.File;

public class Ex02 {
	public static void main(String[] args) {
		//File 클래스를 사용하기 전에 특정 위치를 지정해야 함.
		String pathname_1 = "C:\\study\\util";//운영체제가 Windows일 경우
		String pathname_2 = "C:/study/util";//운영체제가 Linux,Unix일 경우
		
		//원래는 운영체제와 상관없이 사용하는게 맞음.
		String pathname_3 = "C:"+File.separator+"study"+File.separator+"util";
		
		File file = new File(pathname_3);
		String[] arr = file.list();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("======================================");
		for (String k : arr) {
			//System.out.println(k);
			File file2 = new File(pathname_3, k);
//			System.out.println();
//			System.out.println(file2);
//			System.out.println("///////////////////////////////////");
			if(file2.isDirectory()) {
				System.out.println("디렉토리 :" +file2);
			}else {
				System.out.println("파일 :" +file2);
			}
		}
		
	}
}
