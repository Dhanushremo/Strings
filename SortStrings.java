package com.dhanush.strings;

import java.util.Scanner;

public class SortStrings {
	static void  sort(String s) {
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		String sortString=new String(arr);
		System.out.println(sortString);
	}
	public static void main(String[] args) {
		System.out.println("Enter the String");
		String s=new Scanner(System.in).nextLine();
		sort(s);

	}

}
