package com.techlabs.args;

public class TestArgs {
	public static void main(String args[])
	{
		if(args.length==0)
		{
			System.out.println("Enter the parameter");
		}
		else
		{
			for(int i=0;i<args.length;i++)
			{
				System.out.println("Hello"+args[i]);
			}
		}

	
		
		
		
	}

}
