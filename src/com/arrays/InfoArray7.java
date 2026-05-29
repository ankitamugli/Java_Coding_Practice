package com.arrays;

public class InfoArray7 {
//	wap to implement the linear search algorithm
	public static int  l_search(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==key) {
				return i;
			}
			
		}
		return -1;
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8,4,6,5,2,1,3,9};
		int key=2;
		System.out.println(l_search(arr,key));

		

	}

}
