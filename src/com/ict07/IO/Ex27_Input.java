package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex27_Input {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict11.txt";

		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);

			ArrayList<Ex27_VO> list = (ArrayList<Ex27_VO>) ois.readObject();
			for (Ex27_VO k : list) {
				int sum = (int) (k.getKor() + k.getEng() + k.getMath());
				double avg = sum / 3;
				char hak = 'F';
				if (avg >= 90.0)
					hak = 'A';
				else if (avg >= 80.0)
					hak = 'B';
				else if (avg >= 70.0)
					hak = 'C';
				else
					hak = 'F';
				System.out.print(k.getName() + " " + sum + " " + avg + " " + hak);
				System.out.println();
			}
			// 계산

			System.out.println();

		} catch (Exception e) {
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();

			} catch (Exception e2) {
			}
		}

	}
}
