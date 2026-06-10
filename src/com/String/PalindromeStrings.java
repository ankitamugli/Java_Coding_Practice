package com.String;

public class PalindromeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		String resc= "";
		for(int i=s.length()-1;i>=0;i--) {
			resc +=s.charAt(i);
			
		}
		if(s.equals(resc)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}

	}

}
