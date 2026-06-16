package com.String;

import java.util.Arrays;

public class REverseStringword1 {
	public static String reverse(String s) {
		String res="";
		for( int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(i==0||i==s.length()-1) {
				int ascii=ch-32;
				char nch=(char)ascii;
				res=nch+res;
				
			}else {
				res=ch+res;
			}
		}return  res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="dhee coding lab";
		String res=" ";
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
//		 EehD GnidoC BaL 
