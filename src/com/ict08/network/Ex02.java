package com.ict08.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex02 {
	public static void main(String[] args) {
		//URL클래스 : URL(Uniform Resource Locator)  : 접근 가능한 자원의 주소를 의미한다.
		//			final클래스이기 때문에 상속 안됨.
		//http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/
		//https://www.kma.go.kr/XML/weather/sfc_web_map.xml
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		String pathname = "c:"+File.separator+"study"+File.separator+"util"+File.separator+"기상청.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			//웹페이지를 읽기
			URL url = new URL("https://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			is = url.openStream();
			isr = new InputStreamReader(is,"utf-8");
			br = new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg=br.readLine())!=null) {
				sb.append(msg+"\n");
			}
			System.out.println(sb.toString());
			
			//웹페이지를 쓰기
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
	}
}
