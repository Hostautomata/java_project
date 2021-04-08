package com.ict07.IO;

import java.io.File;
import java.io.IOException;

public class Ex03_3 {
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"+File.separator+"util";
		File f1 = new File(pathname);
		try {
			boolean b1 = f1.createNewFile();
			if (b1) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pathname = "C:"+File.separator+"study"+File.separator+"util";
		File f2 = new File(pathname);
		boolean b2 = f2.mkdir();
		if (b2) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		
	}
}
