package com.ict01.grammer04;
class Ex02 
{
	public static void main(String[] args) 
	{
		//for�� : ������ ��Ģ�� ���� ���๮�� �ݺ� ó���ϴ� ��
		//���� : for (�ʱ��;���ǽ�;������){
		//			���ǽ��� ���� ��� ������ ����;
		//		}
		//for���� ������ ������ �ʱ������ �̵�
		//�ʱ�Ŀ����� ���ǽ����� �̵�
		//���ǽ��� ���� ��� for���� ����
		//���ǽ��� ������ ��� for�� ������ ��������
		//for�� ���� �� for���� ���� ������ ���������� �̵�
		//�������� ������ �ٽ� ���ǽ����� �̵�

		//�ȳ��ϼ��� *10
		int i = 0;
		for (i = 1;i < 11;i++)
		{
			System.out.println("�ȳ��ϼ���"+i);
		}
		//0~15���� ���
		for (i = 0;i <= 16;i++)
		{
			System.out.print(i+"  ");
			
		}
		System.out.println();
		//1~10���� ¦��
		for (i = 1;i < 11;i++)
		{
			if(i%2 == 0)
			System.out.print(i + " ");
		}
		System.out.println();
		//1~10���� Ȧ��
		for (i = 1;i < 11; i++ )
		{	
			if(i%2 == 1)
			System.out.print(i+" ");
		}
		System.out.println();
		//1~50���� 7�� ���
		for (i = 1; i < 51 ;i++ )
		{
			if(i%7==0){
				System.out.print(i+"  ");
			}
		}
		System.out.println();
		//5�� ���
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

		//1~10 ������
		int sum = 0;
		for(i = 0;i < 11;i++){
			sum = sum+i;
		}
		System.out.println("1~10 ������"+sum);
		
		
		//Ȧ���� ������
		sum = 0;
		for (i=1;i<11;i++ )
		{
			if(i%2==1)
				sum = sum + i;
		}
		System.out.println("Ȧ���� ������: "+sum);
		
		//¦���� ������
		sum = 0;
		for (i=1;i<11;i++ )
		{
			if(i%2==0)
				sum = sum + i;
		}
		System.out.println("¦���� ������: "+sum);
		

		//�Ѵ� ���� ���Ͻÿ�
		int sum1 = 0;
		int sum2 = 0;
		for (i=1;i<11;i++ )
		{
			if(i%2==1)
				sum1 = sum1 + i;
			if(i%2==0)
				sum2 = sum2 + i;

		}
		System.out.println("Ȧ���� ������: "+sum1+", ¦���� ������: "+sum2);
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