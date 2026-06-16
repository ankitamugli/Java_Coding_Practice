package com.String;
//method2of substring
public class SubStringUsingInBulitSubStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				System.out.println(s.substring(i,j+1));
			}
		}
		

	}

}
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
