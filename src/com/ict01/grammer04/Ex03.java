package com.ict01.grammer04;
class  Ex03
{
	public static void main(String[] args) 
	{
		//다중for문 시계를 생각하면 편함.
		for (int i =1 ;i < 4 ;i++ )
		{
			for (int j  = 1 ; j < 6 ;j++ )
			{
				System.out.println("i = "+i+", j = "+j);
			}
		}
		System.out.println();
		//구구단1
		for (int i =1 ;i < 10 ;i++ )
		{
			for (int j  = 1 ; j < 10 ;j++ )
			{
				System.out.println(i+" * "+j+" = " +i*j);
			}
		}
		System.out.println();
		//구구단2
		for (int i =1 ;i < 10 ;i++ )
		{
			for (int j  = 1 ; j < 10 ;j++ )
			{
				System.out.print(i+" * "+j+" = " +i*j+"  ");
			}System.out.println();
		
		}
		System.out.println();
		//구구단3
		for (int i =1 ;i < 10 ;i++ )
		{
			for (int j  = 1 ; j < 10 ;j++ )
			{
				System.out.print(j+" * "+i+" = " +i*j+"  ");
			}System.out.println();
		
		}
		System.out.println();

		for(int i = 0;i < 4 ;i++){
			for (int j = 0; j<4 ;j++ )
			{
				System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println();

		for(int i = 0;i < 4 ;i++){
			for (int j = 0; j<4 ;j++ )
			{
				if (i == j)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
		System.out.println();


	}
}
