package com.ict06.thread;

import java.util.ArrayList;
import java.util.List;

//Car
public class Car {
	//컬렉션 : 자동차를 저장하는 공간
	private List<String> carList = null;
	//생성자 : 해당클래스가 객체로 생성되며 carList를 생성
	public Car() {
		carList = new ArrayList<String>();
	}
	//getCar 랜덤으로 자동차 생산
	public String getCar() {
		String carName = null;
		switch ((int)(Math.random()*3)) {
		case 0: carName = "SM5"; break;
		case 1: carName = "매그너스"; break;
		case 2: carName = "카렌스"; break;
		}
		return carName;
	}
	//pop 소비자가 자동차를 사는 메서드
	public synchronized String pop() {
		String carName = null;
		if(carList.size()==0) {//제고가 없으면 
			try {
				System.out.println("차가 없어요 생산할 때 까지 기다려주세요");
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//재고가 있을 때 carList에 가장 마지막 차부터 판매/삭제
		carName = (String) carList.remove(carList.size()-1);
		System.out.println("손님이 차를 사갔습니다."+"손님이 구입한 차 이름은 "+carName+"\n");
		return carName;
	}
	//push 자동차를 carList에 넣기
	//차가 5대가 되면 판매시작
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("차가 만들어 졌습니다."+"차이름은"+car+"\n");
		
		
		if(carList.size()==5) this.notify();
	}
	
}
