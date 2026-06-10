package com.String;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Dhee cODiNg lAb";
		System.out.println(s.charAt(1));
		System.out.println(s.length());
		
		char [] arr=s.toCharArray();
		System.out.println(arr);
		
		String ls=s.toLowerCase();
		System.out.println(ls);
		
		String us=s.toUpperCase();
		System.out.println(us);
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,4));
		
		

	}

}
