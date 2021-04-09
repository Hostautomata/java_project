package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex13_1 {
	public static void main(String[] args) {
		String pathname =  "C:"+File.separator+"study"
				+File.separator+"util"+File.separator+"ict03.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		FileInputStream fis = null;
		BufferedInputStream bis =  null;
		DataInputStream dis = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			
			dos.writeLong(10);
			dos.writeDouble(3.14);
			dos.writeChar('한');
			dos.writeInt(20);
			dos.flush();
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			System.out.println(dis.readLong());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				dos.close();
				bos.close();
				fos.close();
				
				dis.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
