package com.ict01.grammer04;
class Ex06 
{
	public static void main(String[] args) 
	{
		//break�� : ���� �ݺ����� Ż�� �� �� ���
		//continue�� : continue�� ������ ���๮�� �����ϰ� ���� ȸ���� �ݺ� ����
		for (int i = 1;i < 11;i++ )
		{
			if(i == 4)break;
			System.out.print(i+" ");

		}
		System.out.println();
		for (int i = 1;i < 11;i++ )
		{
			if(i == 4) continue;//�ǾƷ� ������ ������ ����
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
			//if(k==17) continue;//(k<21)->(k==17)->(k<21)�ѹ�����
			//System.out.print(k+ " ");
			//k++;//������ ������ ����� ��.
		//}
		//j = 3�϶�
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
		//i = 2�϶�
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
