package com.ict07.IO;

import java.io.File;
import java.io.FileInputStream;

public class Ex07_1 {
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"
				+File.separator+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			int k = fis.read();
			System.out.println((char)k);
			
//			k = 0;
//			while(true) {
//				k = fis.read();
//				if(k == -1) break;
//				System.out.print((char)k);
//			}
//			k = 0;
//			while(fis.read()!=-1) {
//				System.out.println((char)k);
//			}
//			배열이용
//			byte[] b = new byte[(int)file.length()];
//			fis.read(b);
//			for (byte c : b) {
//				System.out.print((char)c);
//			}
			byte[] b = new byte[(int)file.length()];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
