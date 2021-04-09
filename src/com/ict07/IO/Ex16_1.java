package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex16_1 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict05.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.write(13);

			bw.write("대");
			bw.write("한");
			bw.write("민");
			bw.write("국");
			bw.write(13);

			char[] c = { 'K', 'o', 'r', 'e', 'a', '한', '글', '이', '됨' };
			bw.write(c);
			bw.write("한국ICT인재개발원\n");
			bw.write("1강의실\n");
			bw.write("자바수업\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
