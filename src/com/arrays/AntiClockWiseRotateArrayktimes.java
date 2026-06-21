package com.arrays;

import java.util.Arrays;

public class AntiClockWiseRotateArrayktimes {
	public static void anti_clock(int[] arr) {
		int temp=arr[0];
		for (int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
	}
		arr[arr.length-1]=temp;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,23,34,45,56};
		int k=32;
		for(int i=1;i<=k;i++) {
			anti_clock(arr);	
		}
		System.out.println(Arrays.toString(arr));
		}
}

