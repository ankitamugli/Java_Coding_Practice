package com.arrays;
//wap to find maximum element from the given array
public class InfoArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,17,15,3,9};
		int max=0;
		for(int ele:arr) {
			if(ele>max) {
				max=ele;
			}
		}
		System.out.println(max);	

	}

}//20
