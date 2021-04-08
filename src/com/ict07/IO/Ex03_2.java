package com.ict07.IO;

import java.io.File;
import java.io.IOException;

public class Ex03_2 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io_test.txt";
		
		File file = new File(pathname);
		try {
			boolean b1 = file.createNewFile();
			if (b1) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "IO_Test";
		File file2 = new File(pathname);
		boolean b2 = file2.mkdir();
		if (b2) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
	}
}
