package com.ict03.class07;
interface Remote{
	void on();
	void off();
}
class Radio{
	public void machineWork(Remote remote) {
		remote.on();
		remote.off();
	}
}

public class Ex07 {
	public static void main(String[] args) {
		Radio radio = new Radio();
		radio.machineWork(new Remote() {
			
			@Override
			public void on() {
				System.out.println("리모컨을 킨다.");
			}
			
			@Override
			public void off() {

				System.out.println("리모컨을 끈다.");
			}
		});
	}
	
}
