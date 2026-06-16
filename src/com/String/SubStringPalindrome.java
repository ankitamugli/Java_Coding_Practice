package com.String;
//wap to print all the palindromic substring from the string
public class SubStringPalindrome {
	public static boolean plindrome(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			res=s.charAt(i)+res;
			
		}
		if(s.equals(res)) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				String res="";
				for(int k=i;k<=j;k++) {
					res +=s.charAt(k);
				}
				if(plindrome(res)) {
					System.out.println(res);
				}
			}
		}

	}

}
//output
//m
//malayalam
//a
//ala
//alayala
//l
//layal
//a
//aya
//y
//a
//ala
//l
//a
//m

