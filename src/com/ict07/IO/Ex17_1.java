package com.ict07.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex17_1 {
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"
				+File.separator+"util"+File.separator+"ict06.txt";
 		
 		File file = new File(pathname);
 		FileReader fr = null;
 		try {
			fr = new FileReader(file);
			
			
//			int k = fr.read();
//			System.out.println(k);
//			
//			k = 0;
//			while((k=fr.read())!=-1) {
//				System.out.print((char)k);
//			}
//			char[] c = new char[(int)file.length()];
//			fr.read(c);
//			for (char ch : c) {
//				System.out.println(ch);
//			}
			char[] c2 = new char[(int)file.length()];
			fr.read(c2);
			String str = new String(c2);
			System.out.println(str);
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
