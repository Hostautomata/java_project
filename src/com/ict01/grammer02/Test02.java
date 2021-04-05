package com.ict01.grammer02;
class Test02{
	public static void main(String[] args){
		int Am = 2500;
		int monin = 10000;
		int su = 2;
		int total = Am*su;
		int vat = (int)(total*0.1);
		int monout = monin-(total+vat);
		System.out.println(monout+"¿ø");
	}
}