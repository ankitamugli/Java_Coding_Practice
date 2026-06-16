package com.String;

public class SubStringUsingTwoPointer {

    public static boolean palindrome(String s) {
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        return s.equals(rev);
    }

    public static void main(String[] args) {

        String s = "malayalam";
        String longPalSub = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {

                String res = s.substring(i, j);

                if (palindrome(res) && res.length() > longPalSub.length()) {
                    longPalSub = res;
                }
            }
        }

        System.out.println("Longest Palindromic Substring: " + longPalSub);
    }
}




//
//package com.String;
//
//public class SubStringUsingTwoPointer {
//	public static boolean plindrome( String s) {
//		String res="";
//		for (int i=0;i<res.length();i++) {
//			res= res.charAt(i)+res;
//		
//		}
//		if(res.equals(res)) {
//			return true;
//		}
//		
//		return false;
//	}
//
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String s="malayalam";
//		String long_pal_sub="";
//		for (int i=0;i<s.length();i++) {
//			for(int j=i;j<s.length();j++) {
//				String res="";
//				
//				if(plindrome(res.length()>long_pal_sub.length())) {
//					long_pal_sub=res;
//				
//				}
//				
//			}
//			
//		}
//		System.out.println(res);
//
//
//	}
//
//}
