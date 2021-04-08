package com.ict07.IO;

import java.io.File;
import java.io.FileOutputStream;

public class Ex05_1 {
	public static void main(String[] args) {
		String pathname ="C:"+File.separator+"study"
				+File.separator+"util"+File.separator+"ict01.txt";
		FileOutputStream fos = null;
		File file = new File(pathname);
		try {
			fos = new FileOutputStream(file);
			
			//한개씩 입력
			fos.write(65);
			fos.write(97);
			fos.write('j');
			fos.write(13);
			
			//배열을 사용해 한번에 여러개 출력
			byte[] b = {'h','e','l','l','o'};
			fos.write(b);
			fos.write(13);
			//String 이용(영어 외에도 사용가능)
			String str = "무야호";
			fos.write(str.getBytes());
			fos.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(fos!=null)fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
