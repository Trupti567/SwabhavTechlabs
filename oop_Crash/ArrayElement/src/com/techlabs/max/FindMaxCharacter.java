package com.techlabs.max;

public class FindMaxCharacter {
	
	public char maxCharTofind(String inputString)
	{
		
		int count=0;
		char characterTostore=inputString.charAt(1);
		for(int i=0;i<inputString.length();i++)
		{
			int currentCount=1;
			for(int j=i+1;j<inputString.length();j++)
			{
				if(inputString.charAt(i)!=inputString.charAt(j))
				break;
				currentCount++;
				
			}
			if(currentCount>count)
			{
				count=currentCount;
				characterTostore=inputString.charAt(i);
			}
		}
			return characterTostore;
		}
	
	}

		
	
	
	
	
		
		
			
				


