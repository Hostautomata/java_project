package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//직렬화 : ObjectOutputStream : writeObject();
public class Ex24_Output {
	public static void main(String[] args) {
		//객체 직렬화 : 특정 클래스를 객체로 만들어 특정 위치에 .ser로 만들어서 저장한다.
		//			 객체들이 가지고있는 내용이 직렬화 되어있다.(사람은 정보를 제대로 볼 수 없다.)
		
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"ict08.ser";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			Ex24_VO vo1 = new Ex24_VO("고길동",34,77.7,true);
			Ex24_VO vo2 = new Ex24_VO("마이콜",19,59.3,true);
			Ex24_VO vo3 = new Ex24_VO("희동이",2,13.3,false);
			Ex24_VO vo4 = new Ex24_VO("도우너",17,45.2,true);
			Ex24_VO vo5 = new Ex24_VO("또치",24,34.5,false);
			
			//객체는 배열이나 컬렉션에 담을 수 있다.
			ArrayList<Ex24_VO> list = new ArrayList<Ex24_VO>(); //컬렉션공부부족
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			//객체직렬화
			oos.writeObject(list);
			oos.flush();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(oos!=null) {
					System.out.println("실행됐습니다.");
					oos.close();
					bos.close();
					fos.close();
				}
				else {
					System.out.println("실행되지 않았습니다.");
				}
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
