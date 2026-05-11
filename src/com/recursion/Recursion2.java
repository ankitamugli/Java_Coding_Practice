package com.recursion;

public class Recursion2 {
	public static int rec_rev(int num,int res) {
		if (num==0) {
			return res;
		}
		return rec_rev(num/10,(res*10)+num%10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=346;
		int res=0;
		int rev=rec_rev(num,res);
		System.out.println(rev);
	}

}//643
