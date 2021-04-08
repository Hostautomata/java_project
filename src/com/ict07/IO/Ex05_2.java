package com.ict07.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05_2 {
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"
				+File.separator+"util"+File.separator+"ict01.txt";
		
		File file = new File(pathname);
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file);
			
			fos.write('a');
			fos.write('b');
			fos.write('c');
			fos.write(95);
			fos.write(13);
			
			byte[] b = {'H','A'};
			fos.write(b);
			String str = "ㅇㅇ";
			fos.write(str.getBytes());
			fos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fos!=null) fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
