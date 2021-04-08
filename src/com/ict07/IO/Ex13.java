package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex13 {
	public static void main(String[] args) {
		//DataOutputStream과 DataInputStream
		//기본자료형을 주고 받을 때 사용(기본자료형을 읽고 쓰는 메서드가 별도로 존재)
		//FileInputStream/FileOutputStream과 다른 점은
		//이진데이터를 입출력할 때 사용한다.(타 시스템과 입출력시에 유리)
		//**입력순서와 출력순서가 다르면 데이터의 결과가 달라질 수 있다.
		//BufferedInputStream/BufferedOutputStream을 활용할 수 있다.
		
		String pathname = "C:"+File.separator+"study"
				+File.separator+"util"+File.separator+"ict03.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			//file->buffer->data : dos의 메서드를 사용할 것이기 때문에 
			dos = new DataOutputStream(bos);
			//쓰기 메서드 : write~~~(~~~는 기본자료형)
			//메모장으로도 읽을 수 없다.
			dos.writeLong(10);
			dos.writeDouble(3.14);
			dos.writeBoolean(true);
			dos.writeFloat(3.10f);
			dos.writeInt(256);
			dos.writeChar('A');
			dos.flush();
			

			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			//file->buffer->data : dis의 메서드를 사용할 것이기 때문에
			dis = new DataInputStream(bis);
			
			//읽는 메서드 : read~~(~~는 기본 자료형) 순서도 중요!
			System.out.println(dis.readLong());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readFloat());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				dos.close();
				bos.close();
				fos.close();
				dis.close();
				bos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
