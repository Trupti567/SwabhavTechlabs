package com.techlabs.maxcharfind;

public class MaximumOccurence {
	public static void main(String args[]) {
		String input = "geeksforgeek";
		char maxoccure=maximumoccurencefinding( input);
		System.out.println(maxoccure);
	}

	public static char maximumoccurencefinding(String input) {

		int storingArray[] = new int[255];
		int max=storingArray[0];
		int indexofarray=0;
		char result=0;
		for (int i = 0; i < input.length(); i++) {
        int index=(int)input.charAt(i);
        storingArray[index]++;
		}
		for(int i=0;i<storingArray.length;i++)
		{
			if(storingArray[i]>max)
			{
				max=storingArray[i];
				indexofarray=i;
				result=(char)i;
			}
		}
		
		
		
	    
		
		
		return result;

	}
}
