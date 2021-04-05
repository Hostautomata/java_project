package com.ict03.class07;

abstract class Car{
	//Anonymous �͸� ���� Ŭ���� : ����� ���� �߻� Ŭ������ �������̽����� ���� ����
	abstract void run();	
}
class Bus extends Car{

	@Override
	void run() {
		System.out.println("80km/h�� �޸���.");
	}
	
}
class Taxi extends Car{
	@Override
	void run() {
		System.out.println("160km/h�� �޸���.");
	}
}

	

class Ex05{
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		System.out.println();
		
		Car car = new Taxi();
		car.run();
		System.out.println();
		
		Car car2 = new Car() {
			@Override
			void run() {
				System.out.println("������ �޸���.");
			}
		};
		car2.run();
	}
}



