package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//직렬화 : ObjectOutputStream : writeObject();
public class Ex23_Output {
	public static void main(String[] args) {
		//객체 직렬화 : 특정 클래스를 객체로 만들어 특정 위치에 .ser로 만들어서 저장한다.
		//			 객체들이 가지고있는 내용이 직렬화 되어있다.(사람은 정보를 제대로 볼 수 없다.)
		
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"ict07.ser";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			Ex23_VO vo = new Ex23_VO("둘리",28,50,true);
			oos.writeObject(vo);
			oos.flush();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				oos.close();
				bos.close();
				fos.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
