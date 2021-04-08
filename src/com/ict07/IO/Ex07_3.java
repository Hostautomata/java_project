package com.ict07.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex07_3 {
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			
			int k = fis.read();
			System.out.println(k);
			
//			byte[] b = new byte[(int)file.length()];
//			fis.read(b);
//			for (byte c : b) {
//				System.out.print((char)c);
//			}
			
			byte[] b = new byte[(int)file.length()];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
