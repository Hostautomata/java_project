package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex16 {
	public static void main(String[] args) {
		//Buffered Writer : 속도향상과 줄바꾸기 메서드가 존재
		
		
		String pathname = "C:"+File.separator+"study"
				+File.separator+"util"+File.separator+"ict06.txt";
		
		File file  = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			//한글자 쓰기
			bw.write(97);//a
			bw.write(65);//A
			
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.newLine();//줄바꿈 메서드
			
			bw.write("대");//FileOutputStream은 안되지만 FileWriter는 가능
			bw.write("한");
			bw.write("J");
			bw.write("A");
			bw.write("V");
			bw.write("A");
			bw.newLine();
			
			
			char[] c  = {'k','o','r','e','a',13,'대','한','민','국',13};
			bw.write(c);
			
			bw.write("한국ICT인재개발원");
			bw.newLine();
			bw.write("1강의실");
			bw.newLine();
			bw.write("자바수업");
			bw.newLine();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
