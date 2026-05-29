package com.arrays;

import java.util.Arrays;
// wap to implement bubble sort algorithm
public class InfoArray10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {52,62,59,42,38,32,22,12};
		for(int k=0;k<=arr.length-1;k++) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
			
		}
	}
System.out.println(Arrays.toString(arr));

	}

}
