package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//Scanner만들어서 입력받고 print만들어서 출력해라
public class Ex22 {
	public static void main(String[] args) {
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			bw.write("문자를 입력하세요 :");
			bw.flush();
			
			String str = br.readLine();
//			int k = Integer.parseInt(str);
//			k++;
//			bw.write("\n입력받은 값은 : "+k);
			bw.write("\n입력받은 값은 : "+str);
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				bw.close();
				osw.close();
				br.close();
				isr.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
