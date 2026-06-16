package com.String;

public class SubStringLongestPalindromicSubString {
	public static boolean plindrome( String s) {
		String res="";
		for (int i=0;i<res.length();i++) {
			res= res.charAt(i)+res;
		
		}
		if(res.equals(res)) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		String long_pal_sub="";
		for (int i=0;i<s.length();i++) {
			for(int j=i;j<s.length();j++) {
				String res="";
				for(int k=i;k<=j;k++) {
					res +=s.charAt(k);
				}
				if(plindrome(res.length()>long_pal_sub.length())) {
					long_pal_sub=res;
				
				}
				
			}
			
		}
		System.out.println(res);

	}

}
