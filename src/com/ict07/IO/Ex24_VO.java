package com.ict07.IO;

import java.io.Serializable;

//객체 직렬화나 역직렬화를 위해 Serializable이나 Extermalizable을 상속받아야 한다.
//Serializable을 상속받으면 해당 클래스를 객체로 만들때 가지고있는 모든 맴버들이 직렬화 대상이 된다.
//단, 변수 앞에 transient예약어를 사용하면 직렬화 대상에서 제외한다.
//제외된 변수의 데이터는 기본값을 갖는다.(String = null, int = 0, double = 0.0 ,boolean = flase )

public class Ex24_VO implements Serializable{
	private String name;
	private int age;
	private double weight;//데이터를 제외시키는 방법
	private boolean gender;
	public Ex24_VO() {
		
	}
	public Ex24_VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}
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
