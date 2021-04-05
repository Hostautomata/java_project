package com.ict01.grammer04;
class  Ex04
{
	public static void main(String[] args) 
	{
		//while¹® : for¹®°ú °°Àº ¹Ýº¹¹®

		//0-15 
		int i = 0;
		while(i<16){
			System.out.println(i+" ");
			i++;
		}
		System.out.println();

		//0-10 Â¦¼ö

		i = 1;
			while(i<11){
			if(i%2 == 0)
				System.out.print(i+" ");
			i++;
		}
		System.out.println();
		System.out.println();
		//0-10 È¦¼ö
		i = 0;
			while(i<11){
			if(i%2 == 1)
				System.out.print(i+" ");
			i++;
		}
		System.out.println();
		System.out.println();
		//0-50 7ÀÇ ¹è¼ö
		i = 1;
			while(i<51){
			if(i%7 == 0)
				System.out.print(i+" ");
			i++;
		}
		System.out.println();
		System.out.println();
		
		//5´Ü
		i = 1;
			while(i<10){
			System.out.println("5 * "+i+" = "+5*i);
			i++;
		}
		i = 1;
			while(true){
				if(i>=10) break;
			System.out.println("5 * "+i+" = "+5*i);
			i++;
		}


		System.out.println();
		System.out.println();
		
		//0(4*4)
		i = 1;
		while(i<5){
			int j = 1;
			while(j<5){
				System.out.print("0");
				j++;
			}
			System.out.println();
			i++;
		}
		i = 1;
		while(true){
			if(i>=5) break;
			int j = 1;
			while(true){
				if(j>=5) break;
				System.out.print("0");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		System.out.println();
		

		//È¦/Â¦´©ÀûÇÕ
		i = 1;
		int sum1 = 0;
		int sum2 = 0;
		while(i<11){
			if(i%2==0){
				sum1 += i;
			}
			else{
				sum2 += i;
			}
			i++;
		}
		System.out.println("Â¦¼öÀÇ ÇÕ= "+sum1+", È¦¼öÀÇ ÇÕ= " +sum2);
		System.out.println();
	}
}
