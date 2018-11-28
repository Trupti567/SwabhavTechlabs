package com.techlabs.args;

import java.net.URL;

public class UrlNaming {
	public static void main(String args[]) {

		int occurence[] = indexOfCharacter("http://www.google.com", 'o');
		for (int occurenec1 : occurence) {
			System.out.println(occurenec1);
		}
		
		String[] data = findcompanyAndQuery(
				"http://www.google.com?developer=trupti", '.', '?');
		System.out.println(data[0]);
		System.out.println(data[1]);
		
	}

	public static int isoccurence(String name, char chartofind) {
		int counter = 0;

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == chartofind) {
				counter = counter + 1;
			}
		}

		return counter;
	}

	public static int[] indexOfCharacter(String name, char chartofind) {
		int occurence[] = new int[isoccurence(name, chartofind)];
		int k = 0;

		for (int i = 0; i < name.length(); i++)
			if (name.charAt(i) == chartofind) {
				occurence[k] = i;
				k++;
			}

		return occurence;
	}

	public static String findNameofCompany(String url, char chartofind) {

		int index[] = indexOfCharacter(url, chartofind);

		String cname = url.substring(index[0] + 1, index[1]);
		return cname;

	}

	public static String findQueryString(String url, char chartofind) {
		int index2[] = indexOfCharacter(url, chartofind);
		String queryString = url.substring(index2[0] + 1);
		return queryString;
	}

	public static String[] findcompanyAndQuery(String url, char charfind,
			char chartofind) {
		String company = findNameofCompany(url, charfind);
		String queryString = findQueryString(url, chartofind);
		String substring[] = { company, queryString };
		return substring;
	}

}
