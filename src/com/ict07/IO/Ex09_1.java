package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex09_1 {
public static void main(String[] args) {
	String pathname = "C:" + File.separator+"study"
			+File.separator+"util"+File.separator+"test100.txt";
	File file = new File(pathname);
	FileOutputStream fos = null;
	BufferedOutputStream bos = null;
	try {
		fos = new FileOutputStream(file);
		bos = new BufferedOutputStream(fos);
		
		String msg = "이름 : 김찬희\n나이:25\n전화번호:010-7107-6620";
		byte[] b = msg.getBytes();
		bos.write(b);
		bos.flush();
			
	} catch (FileNotFoundException e) {

		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			bos.close();
			fos.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}
	}
	
}
}
