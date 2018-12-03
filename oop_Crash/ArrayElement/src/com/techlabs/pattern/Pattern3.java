package com.techlabs.pattern;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String args[]) {
		int i, j = 0, n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			
			}
			for(int k=1;k<=i+(i-1);k++)
			{
				System.out.print("*");
			}
			for(int m=1;m<=n-i;m++)
			{
				System.out.print(" ");
			}
			
			System.out.println();

		}
	}

}
