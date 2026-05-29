package com.arrays;

public class InfoArray8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		wap to find maximum element from the given array
		int[] arr= {-4,-6,-5,-2,-1,-3};
		int max= arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<max) {
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}//-1


//wap to find minimum element from the given array
//int[] arr= {-4,-6,-5,-2,-1,-3};
//int max= arr[0];
//for(int i=0;i<arr.length;i++) {
//	if(arr[i]<max) {
//		max=arr[i];
//	}
//}
//System.out.println(max);
//
//}
//
//}//-6
