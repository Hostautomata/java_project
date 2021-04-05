package com.ict03.class01;

public class Ex09 {
	private String name;
	private int sum;
	private double avg;
	private String hak;
	private int rank = 1;
	
	//모든 메서드가 void이다.
	//이름받기
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	//총점구하기
	public void p_sum(int kor,int eng,int math) {
		sum = kor + eng + math;
		p_avg();
	}
	//평균구하기
	public void p_avg() {
		avg = (int)(sum/3.0*10)/10;
		p_hak();
	}
	//학점구하기
	public void p_hak() {
		if(avg >= 90) {
			hak = "A";
		}else if(avg >= 80) {
			hak = "B";
		}else if(avg >= 70) {
			hak = "C";	
		}else {
			hak = "F";			
		}
	}
	
	//순위와 졍렬은 배열에 담겨져 있어야 하므로 여기선 X
	public String getName() {
		return name;
	}
	
	public int getSum() {
		return sum;
	}
	public double getAvg() {
		return avg;
	}
	public String getHak() {
		return hak;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	

}
