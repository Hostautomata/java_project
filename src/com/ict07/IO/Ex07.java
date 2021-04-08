package com.ict07.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		//1. FileInputStream : 파일을 대상으로 1byte씩 데이터 읽기를 할수 있는 스트림
		//	생성자 : FileInputStream(File file), FileInputStream(String name)
		//		File file, String name => 특정 위치+파일이름을 얘기함.		
		//	주요 메서드 : 
		//read() : int 반환 (아스키코드로 나옴) -> char형으로 형변환
		//		더이상 읽을 수 없으면 -1이 나옴.
		//		비영어권 문자는 읽을 수 없다.
		//
		//		read(byte[] b) : int 배열을 만들어 인자에 넣으면 
		//						배열 크기만큼 문자를 읽을 수 있다.
		//						byte[] b에 읽을 문자들이 배열 크기만큼 저장된다.
		//		close() : 사용 후 닫기, 보통 final처리.
		//
		String pathname = "C:"+File.separator+"study"
		+File.separator+"util"+File.separator+"ict01.txt";
		
		File file = new File(pathname);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			
			//한글자 읽어오기 : read() >숫자 > 형변환
			int k = fis.read();
			
			System.out.println((char)k);
			//한글자씩 계속 읽기 : 그림, 소리, 동영상, 파일은 무조건 이방법 이용
			//				  영어를 제외한 다른 문자는 읽을 수 없다.
			
			k = 0;
//			while(true) {
//				k = fis.read();
//				if(k == -1) break;
//				System.out.println((char)k);
//			}이걸 줄이면 밑에거가 됨
			
			//fis를 이용해서 한글자를 읽었을 때 -1과 같지 않으면 실행한다.
			//	while(fis.read()!=-1) {
			//	System.out.println((char)k);
			//}
			
			//배열을 이용한 방법 : 비영어권 사용 불가
//			byte[] b = new byte[(int)file.length()];
//			fis.read(b);
//			for (byte x : b) {
//				System.out.println(x+": "+(char)x);
//			}
			//String을 이용하면 비영어권 문자도 사용가능
			//Strng 생성자에는 byte[]인자로 받는 생성자를 이용하면 된다.
			byte[] b = new byte[(int)file.length()];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);
			
			
		} catch (FileNotFoundException e) {
			try {
				fis.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
