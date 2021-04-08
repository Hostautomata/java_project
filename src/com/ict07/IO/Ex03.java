package com.ict07.IO;

import java.io.File;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) {
		// 작업할 위치 지정+파일지정(존재하지 않는 파일)
		//경로 표시
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io_test.txt";
				
		//파일생성
		File file = new File(pathname);
		try {
			boolean b1 = file.createNewFile();
			if (b1 == true) {
				System.out.println("파일생성 성공");
			} else {
				System.out.println("파일생성 실패");// 같은 이름의 파일이 존재
			}
			
			//디렉토리 생성
			pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "IO_Test";

			File file2 = new File(pathname);
			boolean b2 = file2.mkdir();
			if (b2) {
				System.out.println("디렉토리생성 성공");
			} else {
				System.out.println("디렉토리생성 실패");// 같은 이름의 디렉토리가 존재
			}

			//디렉토리 삭제
			boolean b3 = file2.delete();
			if (b3) {
				System.out.println("디렉토리삭제 성공");//디렉토리가 비어있어야만 삭제가 가능하다.
			} else {
				System.out.println("디렉토리삭제 실패");
			}
			
			//파일 삭제
			boolean b4 = file.delete();
			if (b4) {
				System.out.println("파일삭제 성공");
			} else {
				System.out.println("파일삭제 실패");// 디렉토리가 존재하지 않음
			}
			
			pathname = "C:"+File.separator+"study"+File.separator+"util";
			File file3 = new File(pathname);
			System.out.println(file3.getAbsolutePath());
			System.out.println(file3.getCanonicalPath());
			System.out.println(file3.getPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
