package com.dhanush.strings;

import java.util.Scanner;

public class ReverseWord {
	static String reverse(String s) {
		s=s.toLowerCase();
		String temp=" ";
		String demo=" ";
	String arr[]=s.split(" ");
	for(int i=0;i<arr.length;i++) {
		temp=arr[i]+" ";
		for(int j=temp.length()-1;j>=0;j--) {
			demo+=temp.charAt(j);
		}

	}
	
		return demo;
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		String s=new Scanner(System.in).nextLine();
		System.out.println("Reversed String "+reverse(s));
	}
}
