package com.String;
//wap to reverse the string
public class ReverseStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="dhee coding lab";
		String res=" ";
		for(int i=s.length()-1;i>=0;i--) {
			res +=s.charAt(i);
			
		}System.out.println(res);

	}

}
