package com.ict07.IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

//오버라이드한 메서드 안에 객체 직렬화할 맴버를 넣어준다.
public class Ex26_VO implements Externalizable{

	
	private String name;
	private int age;
	private double weight;
	private boolean gender;
	//생성자
	public Ex26_VO() {
		
	}
	public Ex26_VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}
	//직렬화
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		//직렬화 대상 입력
		out.writeObject(name);
		//out.writeObject(age);
		out.writeObject(weight);
		out.writeObject(gender);
	}
	
	//역직렬화
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		//역직렬화 대상 입력
		//직렬화를 안하는건 오류가 나지만 역직렬화를 안하는건 오류가 안난다.
		
		name = (String)in.readObject();
		//age = (int)in.readObject();
		weight = (double)in.readObject();
		gender = (boolean)in.readObject();
	}
	//Getter, Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
