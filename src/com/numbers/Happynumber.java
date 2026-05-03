package com.numbers;
//question
//1,return the smallest integer greater than n,the  sum of whose digitss is twice as big as sum of didits of n in java 
//eg1: n=14 return 19
//eg2: n=10 return 11
//eg3: n=99 return 9999
public class Happynumber {
	public static int digit(int num) {
		int sum=0;
		while(num !=0) {
		int rem=num%10;
		sum=sum+rem;
		num=num/10;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		int num=14;
		int res=num+1;
		while(digit(num)*2!=digit(res)) {
			res++;
		}
		System.out.println(res);
	}

}
//19
