package com.ict03.class01;

public class Ex09 {
	private String name;
	private int sum;
	private double avg;
	private String hak;
	private int rank = 1;
	
	//��� �޼��尡 void�̴�.
	//�̸��ޱ�
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	//�������ϱ�
	public void p_sum(int kor,int eng,int math) {
		sum = kor + eng + math;
		p_avg();
	}
	//��ձ��ϱ�
	public void p_avg() {
		avg = (int)(sum/3.0*10)/10;
		p_hak();
	}
	//�������ϱ�
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
	
	//������ ������ �迭�� ����� �־�� �ϹǷ� ���⼱ X
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
