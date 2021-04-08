package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//복사할 파일의 경로를 받는다
//붙여넣을 파일의 경로를 받는다
public class Ex19_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("복사할 파일의 경로: ");
		String pathname1 = sc.next();
		System.out.print("붙여넣을 파일의 경로: ");
		String pathname2 = sc.next();
		
		File f1 =new File(pathname1);
		File f2 =new File(pathname2);
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			//읽기
			fr = new FileReader(f1);
			br = new BufferedReader(fr);
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine())!=null) {
				sb.append(msg+"\n");
			}
			System.out.println(sb.toString());
			
			//쓰기
			fw = new FileWriter(f2);
			bw = new BufferedWriter(fw);
			String str = sb.toString();
			str = str.replace("대한민국", "大韓民國");
			bw.write(str);
			bw.flush();
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}