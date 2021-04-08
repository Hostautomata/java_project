package com.ict07.IO;

import java.io.File;
import java.io.FileOutputStream;

public class Ex05_03 {
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			fos.write('O');
			fos.write(95);
			fos.write(13);
			byte[] c = {'y','e','s'};
			fos.write(c);
			String str = "야이";
			fos.write(str.getBytes());
			
		} catch (Exception e) {
			
		}finally {
			try {
				if(fos!=null) fos.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
