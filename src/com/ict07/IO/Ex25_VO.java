package com.ict07.IO;

import java.io.Serializable;

public class Ex25_VO implements Serializable{

	private String name;
	transient private int kor;
	transient private int eng;
	transient private int math;
	private int sum;
	private double avg;
	private char hak;
	public Ex25_VO() {
		// TODO Auto-generated constructor stub
	}
	public Ex25_VO(String name, int kor, int eng,  int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		sum = kor + eng + math;
		avg = sum / 3;
		
		hak = 'F';
		if (avg >= 90.0)	hak = 'A';
		else if (avg >= 80.0)	hak = 'B';
		else if (avg >= 70.0) hak = 'C';
		else hak = 'F';

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getHak() {
		return hak;
	}
	public void setHak(char hak) {
		this.hak = hak;
	}
}
