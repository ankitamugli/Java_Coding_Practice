package com.arrays;
//wap to implement do equals methods for arrays
public class InfoArray13 {
	public static boolean is_equals(int[] arr,int []brr) {
		if(arr.length!=brr.length) {
			return false;
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=brr[i]) {
				return false;
			}
		}
	
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,23,34,45,56};
		int brr[]={12,23,34,45,56};
		System.out.println(is_equals(arr,brr));

	}

}
