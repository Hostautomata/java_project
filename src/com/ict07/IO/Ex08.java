package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 {
	public static void main(String[] args) {
		//속도향상을 위해 BufferedInputStream을 사용한다.
		//혼자서는 사용할 수 없고 반드시 InputStream을 통해 사용한다.
		//생성자 : BufferedInputStream(InputStream in)
		
		String pathname = "C:"+File.separator+"study"
		+File.separator+"util"+File.separator+"ict01.txt";
		
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = new BufferedInputStream(fis);
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			//한글자 읽어오기 : read() >숫자 > 형변환
			int k = bis.read();
			
			System.out.println((char)k);
			//한글자씩 계속 읽기 : 그림, 소리, 동영상, 파일은 무조건 이방법 이용
			//				  영어를 제외한 다른 문자는 읽을 수 없다.
			
			k = 0;
//			while(true) {
//				k = bis.read();
//				if(k == -1) break;
//				System.out.println((char)k);
//			}이걸 줄이면 밑에거가 됨
			
			
			//배열을 이용한 방법 : 비영어권 사용 불가
//			byte[] b = new byte[(int)file.length()];
//			bis.read(b);
//			for (byte x : b) {
//				System.out.println(x+": "+(char)x);
//			}
			//String을 이용하면 비영어권 문자도 사용가능
			//Strng 생성자에는 byte[]인자로 받는 생성자를 이용하면 된다.
			byte[] b = new byte[(int)file.length()];
			bis.read(b);
			String str = new String(b);
			System.out.println(str);
			
			
		} catch (FileNotFoundException e) {
			try {
				bis.close();
				fis.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
