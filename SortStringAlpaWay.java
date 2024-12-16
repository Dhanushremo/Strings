package com.dhanush.strings;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class SortStringAlpaWay {
	static void sort(String s) {
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(char c:s.toCharArray()) {
				hm.put(c,hm.getOrDefault(c,0) + 1);
		}
		for(Map.Entry<Character, Integer> entry:hm.entrySet()) {
			System.out.print(entry.getKey()+": "+entry.getValue());
		}
//		Collection c=hm.values();
//		Iterator itr1=c.iterator();
//		while(itr1.hasNext()) {
//			System.out.print(itr1.next()+" ");
//		}
//		Set set=hm.keySet();
//		Iterator itr=set.iterator();
//		while(itr.hasNext()) {
//			System.out.print(itr.next()+" ");
//		}
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		String s=new Scanner(System.in).nextLine();
		sort(s);

	}

}
