package com.ict06.thread;

//ProducerCustomerEx
public class ProducerCustomerEx {
	public static void main(String[] args) {
		Car c = new Car();//임계영역, 동기화 필요
		Producer producer = new Producer(c);
		Thread tProducer = new Thread(producer);
		Customer customer = new Customer(c);
		Thread tCustomer = new Thread(customer);
		tProducer.start();
		tCustomer.start();
	}
}
