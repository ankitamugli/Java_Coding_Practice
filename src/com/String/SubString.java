package com.String;
//wap to print all the string from the given string (without using substring method)
public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		for(int i=0;i<s.length();i++) {
			for (int j=i;j<s.length();j++) {
				String res="";
				for(int k=i;k<=j;k++) {
					res +=s.charAt(k);
				}
				System.out.println(res);
			}
		}

	}

}
//output
//h
//he
//hel
//hell
//hello
//e
//el
//ell
//ello
//l
//ll
//llo
//l
//lo
//o

