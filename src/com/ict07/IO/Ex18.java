package com.ict07.IO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		//BufferedReader : 속도향상을 위해서, 한줄씩 읽는 메서드 존재
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 말해주세요 : ");
		
		String pathname = "C:"+File.separator+"study"
				+File.separator+"util"+File.separator+"ict06.txt";
 		
 		File file = new File(pathname);
 		BufferedReader br = null;
 		FileReader fr = null;
 		try {
 			fr = new FileReader(file);
			br = new BufferedReader(fr);
			//한글자 읽기
// 			int k = br.read();
// 			System.out.println(k+":"+(char)(k));
 			
			//한글자씩 여러개 읽기
//			int k = 0;
//			while((k=br.read())!=-1) {
//				System.out.print((char)k);
//			}
 			//char[]이용
//			char[] c = new char[(int)file.length()];
// 			br.read(c);
// 			for (char k : c) {
//				System.out.print(k);
//			}
			

			//String이용 - 제일 많이 쓰는 방법
//			char[] c = new char[(int)file.length()];
//			br.read(c);
//			String str = new String(c);
//			System.out.println(str);
			
			
 			//첫줄읽기
//			String msg  = br.readLine();
//			System.out.println(msg);
			//모두 읽기
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while ((msg = br.readLine())!= null) {
				sb.append(msg+"\n");
			}
			System.out.println(sb.toString());
			
		} catch (Exception e) {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
	}
}
