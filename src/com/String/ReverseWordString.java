package com.String;

import java.util.Arrays;

public class ReverseWordString {
	public static String reverse(String s) {
		String res="";
		for(int i=0;i<s.length();i++) {
			res=s.charAt(i)+res;
			
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="dhee coding lab";
		String res="";
		String [] arr=s.split(" ");
		System.out.println(Arrays.toString(arr));
		for(String word:arr) {
			res+= reverse(word)+" ";
		}
		System.out.println(res);
		

	}

}
//output
//[dhee, coding, lab]
//eehd gnidoc bal 
