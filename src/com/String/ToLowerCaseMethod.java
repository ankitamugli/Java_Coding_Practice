package com.String;

public class ToLowerCaseMethod {
	public static String toLowerCase(String s) {
	String res="";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>=65 && ch<=90) {
			int ascii= ch+32;
			char nch=(char)ascii;
			res +=nch;
		}else {
			res +=ch;
		}
	}
	return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="AnKIta";
		String lwc=toLowerCase(s);
		System.out.println(lwc);
		

	}

}
