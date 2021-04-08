package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Ex14 {
	public static void main(String[] args) {
		//PrintStream : 모든 자료형을 출력한다.
		//				화면에 출력하려면 System.out을 활용
		//				파일에 출력하려면 FileOutputStream과 BufferedOutputStream활용
		//flush()를 자동으로 처리한다./
		//모든 메서드에 예외처리를 하지 않는다.
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"ict04.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);
			
			
			//화면에 출력
			System.out.println(24.1);
			System.out.println(20);
			System.out.println('C');
			System.out.println(true);
			System.out.println("대한민국");
			
			//파일에 출력
			ps.println(24.1);
			ps.println(20);
			ps.println('C');
			ps.println(true);
			ps.println("대한민국");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				bos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}
}
