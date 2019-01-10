package com.techlabs.mapinteger;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInteger {
	public static void main(String args[])
	{
		Map<Integer,String> map;
		//map=new HashMap<Integer,String>();
		//map=new TreeMap<Integer,String>();
		map=new LinkedHashMap<Integer,String>();
		System.out.print("Adding = : ");
		map.put(1,"One");
		map.put(88, "Eleven");
		map.put(5,"Two");
		map.put(3, "Three");
		map.put(7, "Five");
		map.put(4, "four");
		map.put(999, "Twelve");
		System.out.println(map);
		
		if(map.containsKey(3))
		{
			map.remove(3);
		}
		else
		{
			System.out.println("Element not found");
		}
		System.out.print(" Removing Element : ");
		System.out.println(map);
		map.replace(1, "Ten");
		System.out.print(" Update : ");
		System.out.println(map);
		for(Map.Entry<Integer,String> temp:map.entrySet())
		{
			System.out.println(" key = : "+temp.getKey()+" Value : "+temp.getValue());
		}

	}
	  

}
