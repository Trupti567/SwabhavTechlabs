package com.techlabs.pattern;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String args[])
	{
		int n ,i,j,k;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(j<=i)
				{
					System.out.print("#");
				}
				else{
				System.out.print("-");
				}
			}
			System.out.println();
		
			
		}
		
	}

}
