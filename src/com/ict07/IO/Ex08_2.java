package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08_2 {
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"
				+File.separator+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			int k = bis.read();
			System.out.println(k);
			
//			byte[] b = new byte[(int)file.length()];
//			bis.read(b);
//			for (byte c : b) {
//				System.out.println(c);
//			}
			
			byte[] t = new byte[(int)file.length()];
			bis.read(t);
			String str = new String(t);
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
				bis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
