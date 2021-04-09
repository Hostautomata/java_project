package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Ex21 {
	public static void main(String[] args) {
		//입력 : OutputStreamWriter >> Writer
		//		OutputStream -> OutputStreamWriter -> Writer -> BufferedWriter	
		
		//System.out.print(); 구현
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			
			bw.write("Welcome");
			bw.newLine();
			bw.flush();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				bw.close();
				osw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
