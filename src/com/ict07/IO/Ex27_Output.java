package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex27_Output {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict11.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		Scanner sc = new Scanner(System.in);
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

			ArrayList<Ex27_VO> list = new ArrayList<>();
			Outer: while (true) {
				System.out.println("이름\t국어\t영어\t수학을 입력하세요");
				String name = sc.next();
				int kor = sc.nextInt();
				int eng = sc.nextInt();
				int math = sc.nextInt();
				//**********************ArrayList에 배열 저장!!!!
				//하나만 저장되는게 아니라 추가로 계속 저장됨
				Ex27_VO vo = new Ex27_VO(name, kor, eng, math);
				list.add(vo);

				
				

				while (true) {
					System.out.println("계속 할까요?");
					char c = sc.next().charAt(0);
					if (c == 'N' || c == 'n')
						break Outer;
					else if (c == 'Y' || c == 'y')
						break;
					else {
						continue;
					}
				}
			}
			oos.writeObject(list);
			oos.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
