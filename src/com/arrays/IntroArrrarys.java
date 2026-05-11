package com.arrays;

import java.util.Arrays;

public class IntroArrrarys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] arr=new char[5];
		System.out.println(Arrays.toString(arr));
		int count=0;
		for(char ele : arr) {
			if(ele=='\u0000') {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
