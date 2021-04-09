package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex12_2 {
	public static void main(String[] args) {
		String pathname1 = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"Java_2.png";
		File f1 = new File(pathname1);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		
		String pathname2 = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"res"+File.separator+"Java_2.png";
		File f2 = new File(pathname2);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(f1);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(f2);
			bos = new BufferedOutputStream(fos);
			
			int k =0;
			while((k=bis.read())!=-1) {
				bos.write(k);
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
				f1.delete();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
	}
}
