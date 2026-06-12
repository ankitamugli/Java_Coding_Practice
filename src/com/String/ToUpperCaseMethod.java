package com.String;

public class ToUpperCaseMethod {
	public static String toUpperCase(String s) {
	String res="";
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		if(ch>=97 && ch<=122) {
			int ascii= ch-32;
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
		String s="ankita";
		String ul=toUpperCase(s);
		System.out.println(ul);

	}

}
