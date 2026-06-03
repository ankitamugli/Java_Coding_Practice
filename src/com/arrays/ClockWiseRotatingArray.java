package com.arrays;

import java.util.Arrays;

public class ClockWiseRotatingArray {
	public static void clock(int[] arr) {
		int temp=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--) {
			arr[i+1]=arr[i];
		}
		arr[0]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,23,34,45,56};
		int k=32;
		for(int i=1;i<=1;i++) {
			clock(arr);
			
		}
		System.out.println(Arrays.toString(arr));

	}

}
