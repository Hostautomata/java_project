package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//c:\\study\\util\\test100.txt파일안에
//이름 : 000
//나이 : 00
//전화번호 : 000-0000-0000
//을 작성하는 코딩을 하시오

public class Ex09 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator+"study"
				+File.separator+"util"+File.separator+"test100.txt";
		
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null; 
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String msg = "이름 : 김찬희\n나이: 25\n전화번호 : 010-7107-6620";
			byte[] b = msg.getBytes();
			fos.write(b);
			fos.flush();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
