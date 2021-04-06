package com.ict05.collection;

import java.util.HashSet;
import java.util.TreeSet;

//로또
public class Ex04 {
	public static void main(String[] args) {
		//로또 : 1~45(랜덤, 6자리, 중복X)
		HashSet<Integer> lotto = new HashSet<>();
		for (int i = 0; i < 6; i++) {
			int k = (int)(Math.random()*45);
			boolean b = lotto.add(k);
			if(!b) {//중복되었을 때
				i--;
			}
		}	
		System.out.println(lotto);
		
		TreeSet<Integer> lotto2 = new TreeSet<>();
		for (int i = 0; i < 6; i++) {
			int k = (int)(Math.random()*45);
			boolean b = lotto2.add(k);
			if(!b) {//중복되었을 때
				i--;
			}
		}	
		System.out.println(lotto2);
		
		
	}
}
