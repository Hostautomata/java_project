package com.ict01.grammer04;
class Ex02 
{
	public static void main(String[] args) 
	{
		//for문 : 정해진 규칙에 따라 실행문을 반복 처리하는 문
		//형식 : for (초기식;조건식;증감식){
		//			조건식이 참일 경우 실행할 문장;
		//		}
		//for문을 만나면 무조건 초기식으로 이동
		//초기식에서는 조건식으로 이동
		//조건식이 참일 경우 for문을 실행
		//조건식이 거짓일 경우 for문 밖으로 빠져나감
		//for문 실행 중 for문의 끝을 만나면 증감식으로 이동
		//증감식이 끝나면 다시 조건식으로 이동

		//안녕하세요 *10
		int i = 0;
		for (i = 1;i < 11;i++)
		{
			System.out.println("안녕하세요"+i);
		}
		//0~15까지 출력
		for (i = 0;i <= 16;i++)
		{
			System.out.print(i+"  ");
			
		}
		System.out.println();
		//1~10까지 짝수
		for (i = 1;i < 11;i++)
		{
			if(i%2 == 0)
			System.out.print(i + " ");
		}
		System.out.println();
		//1~10까지 홀수
		for (i = 1;i < 11; i++ )
		{	
			if(i%2 == 1)
			System.out.print(i+" ");
		}
		System.out.println();
		//1~50까지 7의 배수
		for (i = 1; i < 51 ;i++ )
		{
			if(i%7==0){
				System.out.print(i+"  ");
			}
		}
		System.out.println();
		//5단 출력
		for(i = 1;i <= 9 ;i++){
			System.out.println("5 * "+ i +" = "+5*i);
		}
		System.out.println();

		for(i = 0;i < 4 ;i++){
			for (int j = 0; j<4 ;j++ )
			{
				System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println();

		
		for(i = 1;i < 17 ;i++){
			System.out.print("0 ");
			if(i%4==0)
			{
				System.out.println();
			}
			
		}
		System.out.println();

		//1~10 누적합
		int sum = 0;
		for(i = 0;i < 11;i++){
			sum = sum+i;
		}
		System.out.println("1~10 누적합"+sum);
		
		
		//홀수의 누적합
		sum = 0;
		for (i=1;i<11;i++ )
		{
			if(i%2==1)
				sum = sum + i;
		}
		System.out.println("홀수의 누적합: "+sum);
		
		//짝수의 누적합
		sum = 0;
		for (i=1;i<11;i++ )
		{
			if(i%2==0)
				sum = sum + i;
		}
		System.out.println("짝수의 누적합: "+sum);
		

		//둘다 각각 구하시오
		int sum1 = 0;
		int sum2 = 0;
		for (i=1;i<11;i++ )
		{
			if(i%2==1)
				sum1 = sum1 + i;
			if(i%2==0)
				sum2 = sum2 + i;

		}
		System.out.println("홀수의 누적합: "+sum1+", 짝수의 누적합: "+sum2);
		int fac = 1;
		for (i = 7;i>0 ;i-- )
		{
			fac = fac*i;
			System.out.print(i+"* ");
			if(i==1)
			System.out.print("= ");
		}
		System.out.print(fac);
		System.out.println();
	}
}
