package com.recursion;

public class Recursion3 {
	public static int rec_count_digit(int num,int count) {
		if(num==0) {
			return count;
		}
		return rec_count_digit(num/10,count+=1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=346;
		int count=0;
		int digit=rec_count_digit(num,count);
		System.out.println(digit);

	}

}//3 
