package com.ict07.IO;
import java.io.File;
import java.io.FileReader;

public class Ex17 {
	public static void main(String[] args) {
		//FileInputStream : read() : int(아스키) => char형변환, 영어 대소문자만 가능
		//FileReader : read() : int(유니코드) => char형변환, 전세계문자 가능
		//						read(char[] b), String이용
 		String pathname = "C:"+File.separator+"study"
				+File.separator+"util"+File.separator+"ict06.txt";
 		
 		File file = new File(pathname);
 		FileReader fr = null;
 		try {
 			fr = new FileReader(file);
			
			//한글자 읽기
// 			int k = fr.read();
// 			System.out.println(k+":"+(char)(k));
 			
			//한글자씩 여러개 읽기
//			int k = 0;
//			while((k=fr.read())!=-1) {
//				System.out.print((char)k);
//			}
 			//char[]이용
//			char[] c = new char[(int)file.length()];
// 			fr.read(c);
// 			for (char k : c) {
//				System.out.print(k);
//			}
			

			//String이용 - 제일 많이 쓰는 방법
			char[] c = new char[(int)file.length()];
			fr.read(c);
			String str = new String(c);
			System.out.println(str);
			
			
 			
		} catch (Exception e) {
			try {
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
	}
}
