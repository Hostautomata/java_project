package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {
	public static void main(String[] args) {
		// 속도향상을 위해서 BufferOutputStream을 사용한다.
		// 혼자서는 사용할 수 없고 반드시 OutputStream을 받아서 사용한다.
		// 생성자: BufferedOutputStream(OutputStream out),
		// BufferedOutputStream(OutputStream out, int size)

		// 주요 메서드: flush(), write(int b), write(byte[] b, int off, int len)

		String pathname = "C:" + File.separator + "study"
		+ File.separator + "util" + File.separator + "ict02.txt";// 없는파일은
																													// 생성

		FileOutputStream fos = null;
		File file = new File(pathname);
		BufferedOutputStream bos = null;
		try {
			// 기존 파일이 있으면 덮어쓰기 하고 없으면 생성한다.
			fos = new FileOutputStream(file);// close를 하기위해 선언을 밖에 따로함.
			bos = new BufferedOutputStream(fos);
			
			
			bos.write(65);// 'A'
			bos.write(97);// 'a'
			bos.write('j');
			bos.write('a');
			bos.write('v');
			bos.write('a');

			bos.write(13);
			byte[] b = { 'H', 'i', 'J', 'A','V', 'A', 13 };
			String str = "Hello\r안녕\r123\r大韓\r";
			bos.write(str.getBytes());

			bos.write(b);
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null)
					bos.close();// 사용을 했으면 닫아라.
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
