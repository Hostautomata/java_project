package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//c:\\study\\util\\Java_1.png을
//c:\\study\\util\\res\\안에 복사
public class Ex11 {
	public static void main(String[] args) {
		//읽는 위치
		String pathname1 = "C:" + File.separator + "study"
	+ File.separator + "util" + File.separator + "Java_1.png";

	File read_file = new File(pathname1);
	
	//쓰는 위치
	String pathname2 = "C:" + File.separator + "study"
			+ File.separator + "util" + File.separator 
			+ "res"+File.separator+ "Java_1.png";
	File write_file = new File(pathname2);
	
	
	FileInputStream fis = null;
	BufferedInputStream bis = null;
	
	FileOutputStream fos = null;
	BufferedOutputStream bos = null;
	
	try {
		fis = new FileInputStream(read_file);
		bis = new BufferedInputStream(fis);
		
		fos = new FileOutputStream(write_file);
		bos = new BufferedOutputStream(fos);
		
		//그림, 음악, 동영상 파일들을 처리할 때는 무조건 1byte씩 처리해야 한다.
		int k  = 0;
		while((k=bis.read())!=-1) {//여기까지가 읽기
			//여기가 쓰기
			bos.write(k);
		}
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
			bis.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	}
}
