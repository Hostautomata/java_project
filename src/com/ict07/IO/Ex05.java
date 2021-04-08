package com.ict07.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		//FileOutputStream : 파일에 1byte씩 데이터 쓰기를 할 수 있는 Stream
		//생성자 : FileOutputStream(File file), FileOutputStream(File file, boolean append)
		//FileOutputStream(String name), FileOutputStream(String name, boolean append)
		//append = false나 생략하면 덮어쓰기 true하면 이어쓰기, 기본생성자가 없음.
		//File file, String name => 특정 위치+파일이름을 얘기함.
		//주요 메서드 : 
		//write(byte[] b) : 여러 글자를 byte[]에 넣어서 쓰기 가능
		//write(int[] b) : 한 글자 쓰기 가능(영문자 대소문자, 숫자, 일부 특수문자만 가능)
		//flush()		=>write후 반드시 실행 해야 함.
		//close()		=>오픈된 스트림을 닫음(사용 후 닫음), 보통 finally(무조건 실행)로 처리
		//*try-catch사용해야 함.
		
		//특정위치에 파일까지 지정
		String pathname = "C:"+File.separator+"study"
		+File.separator+"util"+File.separator+"ict01.txt";//없는파일은 생성
		
		FileOutputStream fos = null;
		File file = new File(pathname);
		try {
			//기존 파일이 있으면 덮어쓰기 하고 없으면 생성한다.
			fos = new FileOutputStream(file);//close를 하기위해 선언을 밖에 따로함.
			//기존 파일이 있으면 이어쓰기 하고 없으면 생성한다.
			//fos = new FileOutputStream(file,true);
			fos.write(65);//'A'
			fos.write(97);//'a'
			fos.write('j');
			fos.write('a');
			fos.write('v');
			fos.write('a');
			
			//자바에서 줄변경은 13(Carrige return = CR = \r) 이다.
			//다른 언어중에는 \r \n(Line feed = 10)을 같이 써야 하는 경우도 있다.
			fos.write(13);
			//배열을 이용해서 여러글자 쓰기
			byte[] b = {'b','o','y','s',13,'g','i','r','l','s',13};
			fos.write(b);
			//String을 이용하자(영어이외의 문자도 사용가능)
			String str = "Hello\r안녕\r123\r大韓\r";
			fos.write(str.getBytes());
			//사실 문자를 사용할거면 문자 스트림이 훨씬 쉬움.
			
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) fos.close();//사용을 했으면 닫아라.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
