package com.techlabs.array;

public class EvenTest {
	public static void main(String args[])
	{
		int no[]=new int[]{1,2,3,4,5,6,7,8,9,10};
		int no2[]=identifyEven(no);
		for(int no3:no2)
		{
			System.out.println(no3);
		}
		
	}
	public static int[] identifyEven(int no1[])
	{
		int evenNo[]=new int[no1.length];
		int k=0;
	
		for(int i=0;i<no1.length;i++)
		{
			
			boolean isEven=true;
			
			if(no1[i]%2!=0)
			{
				isEven=false;
				
			}
			if(isEven)
			{
				evenNo[k]=no1[i];
				k++;
			}
				
		}
		return evenNo;
	}

}
