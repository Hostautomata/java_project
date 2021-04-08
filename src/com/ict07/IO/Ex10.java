package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//c:\\study\\util\\test100.txt파일안에 내용을 읽는 파일을 작성하시오.

public class Ex10 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator+"study"
				+File.separator+"util"+File.separator+"test100.txt";
		
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		

		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] b = new byte[(int) file.length()];
			bis.read(b);
			String msg = new String(b);
			System.out.println(msg);
			
			
			
		}
		catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				fis.close();
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
