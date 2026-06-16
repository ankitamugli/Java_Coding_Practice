package com.String;

public class HackerRankTimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="17:05:02PM";
		System.out.println(s.substring(3));//5:02PM
		System.out.println(s.substring(0,8));//17:05:02
		System.out.println(s.substring(0,8).concat("AM"));//17:05:02AM
		System.out.println(s.substring(2,8));//:05:02
		System.out.println(s.substring(8));//pm
		System.out.println(s.substring(5,8));//:02
		
		
		
		
		
		

	}

}
