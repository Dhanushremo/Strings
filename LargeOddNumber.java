package com.dhanush.strings;

import java.util.Arrays;
import java.util.Scanner;

public class LargeOddNumber {
	static String biggestOddNumber(String s) {
		char arr[]=s.toCharArray();
		Arrays.sort(arr);
		reverse(arr);
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]%2==1) {
				return new String(arr);
			}
		}
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]%2==1) {
				char temp=arr[i];
				arr[i]=arr[arr.length-1];
				arr[arr.length-1]=temp;
				
				return new String(arr);
			}
		}
		
		return null;
	
	}
	static void reverse(char arr[]) {
		int st=0;
		int end=arr.length-1;
		while(st<end) {
			char temp=arr[st];
			arr[st]=arr[end];
			arr[end]=temp;
			st++;
			end--;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the String!!");
		String s=new Scanner(System.in).nextLine();
		System.out.println(biggestOddNumber(s));

	}

}
