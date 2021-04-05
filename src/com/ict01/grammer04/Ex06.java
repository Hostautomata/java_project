package com.ict01.grammer04;
class Ex06 
{
	public static void main(String[] args) 
	{
		//break문 : 현재 반복문을 탈출 할 때 사용
		//continue문 : continue문 이하의 수행문을 포기하고 다음 회차를 반복 수행
		for (int i = 1;i < 11;i++ )
		{
			if(i == 4)break;
			System.out.print(i+" ");

		}
		System.out.println();
		for (int i = 1;i < 11;i++ )
		{
			if(i == 4) continue;//맨아래 있으면 있으나 마나
			System.out.print(i+" ");

		}
		System.out.println();

		int k = 1;
		while (k < 21)
		{
			if(k==17) break;
			System.out.print(k+ " ");
			k++;
		}
		System.out.println();
		k = 1;

		//while (k < 21)
		//{
			
			//System.out.print(k+ " ");
			//if(k==17) continue;//(k<21)->(k==17)->(k<21)한무루프
			//System.out.print(k+ " ");
			//k++;//증감을 위에서 해줘야 함.
		//}
		//j = 3일때
		for(int i = 1; i<4; i++){
			for (int j = 1; j<6 ;j++ )
			{
				if(j == 3) continue;
				System.out.print("i= "+i+", j= "+j+" ");
			}	
			System.out.println();
		}
		System.out.println();
		System.out.println();
		//i = 2일때
		for(int i = 1; i<4; i++){
			for (int j = 1; j<6 ;j++ )
			{
				if(i == 2) continue;
				System.out.print("i= "+i+", j= "+j+" ");
			}	
			System.out.println();
		}
	}
}
