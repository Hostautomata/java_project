package com.ict07.IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Ex27_VO implements Externalizable{

	
	private String name;
	private int math;
	private int eng;
	private int kor;
	
	
	//생성자
	public Ex27_VO() {
		
	}
	
	public Ex27_VO(String name, int math, int eng, int kor) {
		super();
		this.name = name;
		this.math = math;
		this.eng = eng;
		this.kor = kor;
	}

	//직렬화
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		//직렬화 대상 입력
		out.writeObject(name);
		//out.writeObject(age);

		out.writeObject(kor);
		out.writeObject(math);
		out.writeObject(eng);
	}
	
	//역직렬화
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		//역직렬화 대상 입력
		//직렬화를 안하는건 오류가 나지만 역직렬화를 안하는건 오류가 안난다.
		
		name = (String)in.readObject();
		kor = (int)in.readObject();
		eng = (int)in.readObject();
		math = (int)in.readObject();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public double getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}
	
}
