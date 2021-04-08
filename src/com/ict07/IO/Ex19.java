package com.ict07.IO;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("복사할 경로를 말해주세요 : ");
		String pathname1 = sc.next();
		System.out.println("붙여넣을 경로를 말해주세요 : ");
		String pathname2 = sc.next();
		
		File f1 = new File(pathname1);
		File f2 = new File(pathname2);
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fr = new  FileReader(f1);
			br = new BufferedReader(fr);
			String str = null;
			StringBuffer sb = new StringBuffer();
			while((str=br.readLine())!=null) {
				sb.append(str+"\n");
			}
			
			//쓰기
			fw = new FileWriter(f2);
			bw = new BufferedWriter(fw);
			
			//치환
			String msg = sb.toString();
			msg = msg.replace("대한민국", "大韓民國");
			bw.write(msg);
			bw.flush();
			
			
		} catch (Exception e) {
			
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (Exception e2) {
			}
		}
	}
}
