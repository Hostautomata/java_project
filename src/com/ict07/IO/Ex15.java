package com.ict07.IO;

import java.io.File;
import java.io.FileWriter;

public class Ex15 {
	public static void main(String[] args) {
		//문자스트림 모든 처리를 2byte씩 처리
		//대상 : 전세계 모든 언어로 구성된 문서파일들
		//최 상위 클래스 Reader(),Writer

		//FileOutputStream(바이트):
		//FileWriter(문자):
		
		//FileInputStream  = 아스키코드, 1byte처리 write(int b), write(byte[] b)
		//FileReader = 유니코드, 2byte write(int b), write(char[] b), write(String b)
		//통신에서도 사용
		
		String pathname = "C:"+File.separator+"study"
				+File.separator+"util"+File.separator+"ict05.txt";
		
		File file  = new File(pathname);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			//한글자 쓰기
			fw.write(97);//a
			fw.write(65);//A
			
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			fw.write(13);
			
			fw.write("대");//FileOutputStream은 안되지만 FileWriter는 가능
			fw.write("한");
			fw.write("J");
			fw.write("A");
			fw.write("V");
			fw.write("A");
			fw.write(13);
			
			
			char[] c  = {'k','o','r','e','a',13,'대','한','민','국',13};
			fw.write(c);
			
			fw.write("한국ICT인재개발원\n");
			fw.write("1강의실\n");
			fw.write("자바수업\n");
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fw.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
