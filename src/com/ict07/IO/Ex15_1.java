package com.ict07.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex15_1 {
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"
				+File.separator+"util"+File.separator+"ict05.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			fw.write(13);
			
			fw.write("대");
			fw.write("한");
			fw.write("민");
			fw.write("국");
			fw.write(13);
			
			char[] c = {'K','o','r','e','a','한','글','이','됨'};
			fw.write(c);
			fw.write("한국ICT인재개발원\n");
			fw.write("1강의실\n");
			fw.write("자바수업\n");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
