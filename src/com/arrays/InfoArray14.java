package com.arrays;
//wap to check whether the given array issorted in ascending order or not 
public class InfoArray14 {

public static boolean is_sorted(int[] arr) {
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]>arr[i+1]) {
			return false;
			
		}
	}
	return true;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {12,23,34,45,56};
		System.out.println(is_sorted(arr));

	}

}
