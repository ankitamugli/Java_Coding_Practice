package com.String;

import java.util.HashMap;

public class ByUsingHashmap {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
				
			}
			else {
				map.put(ch, 1);
				
			}
			
		}
		System.out.println(map);
		for(char ch:map.keySet()) {
			if(map.get(ch)==2) {
				System.out.println(ch);
			}
		}

	}

}
//output
//{a=4, y=1, l=2, m=2}
//l
//m
//given count vowels consotants whitespaces and special characteres