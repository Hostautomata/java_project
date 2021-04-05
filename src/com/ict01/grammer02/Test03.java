package com.ict01.grammer02;
class Test03{
	public static void main(String[] args){
		int hour   = 2;
		int min  = 40;
		int sec  = 23;
		int time = (hour *60 + min )*60 + sec ;	
		System.out.println(time+"초");

		sec = 9630;
		min = sec /60;
		hour = min /60;

		min = min%60;
		sec = sec%60;

		
		System.out.println(hour +"시간"+min +"분"+sec +"초");
		
	}
}