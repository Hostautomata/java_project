package com.ict02.array;

public class Ex04 {

	public static void main(String[] args) {
		//순위 구하기
		//모든 사람의 순위를 1등으로 초기화 한다.
		//모든 사람들과 비교해야 한다.
		//자기 자신은 비교할 필요가 없다.(i==j)continue사용
		//나보다 남이 크면 내 순위를 증가한다.
		int[] su1 = {270,265,280,290,285};
		int[] rank = {1,1,1,1,1};
		for(int i = 0; i< su1.length; i++) {
			for(int j = 0; j<su1.length; j++) {
				if(i == j) continue;
				if(su1[i]<su1[j]) {
					rank[i]++;
				}
			}
			System.out.println(rank[i]);
		}
		
	}

}
