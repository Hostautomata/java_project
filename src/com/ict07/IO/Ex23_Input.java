package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex23_Input {
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"ict07.ser";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			//역직렬
			Ex23_VO vo = (Ex23_VO) ois.readObject();
			//자료형이 Ex23_VO가 아니라 Object형(클래스 상속의 최 정점에 있는)으로 나옴.
			System.out.println(vo.getName());
			System.out.println(vo.getAge());
			System.out.println(vo.getWeight());
			System.out.println(vo.isGender());
			

//통신속도가 직렬이 빠름.
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
