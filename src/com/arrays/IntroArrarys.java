package com.arrays;

import java.util.Arrays;

public class IntroArrarys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int[5];
		System.out.println(Arrays.toString(arr));
		arr[0]=99;
		arr[1]=88;
		arr[2]=27;
		arr[3]=32;
		arr[4]=56;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);	
			
		}
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
	

}
