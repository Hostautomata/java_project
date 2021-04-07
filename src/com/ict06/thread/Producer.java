package com.ict06.thread;

//Producer
public class Producer implements Runnable {
	//클래스를 자료형으로 사용함. (참조 자료형)
	private Car car;

	//생성자에서 받은 인자는 무조건 전역변수로 만들자.
	public Producer(Car car) {
		this.car = car;
	}

	@Override
	public void run() {
		String carName = null;
		for (int i = 0; i < 20; i++) {
			carName = car.getCar();
			car.push(carName);
			try {
				Thread.sleep((int) (Math.random() * 200));
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
