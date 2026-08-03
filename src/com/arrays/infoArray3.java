package com.arrays;

public class infoArray3 {
//maximum array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-10,-20,-17,-15,-3,-9};
		int max=arr[0];
		for(int ele:arr) {
			if(ele>max) {
				max=ele;
			}
		}
		System.out.println(max);//-3	

		
		
		
		int[] arr1= {-10,-20,-17,-15,-3,-9};
		int max1=Integer.MAX_VALUE;
		for(int ele:arr) {
			if(ele>max) {
				max=ele;
			}
		}
		System.out.println(max);//-3
		
	
		
		
		int[] arr2= {-10,-20,-17,-15,-3,-9};
		int max2=Integer.MIN_VALUE;
		for(int ele:arr) {
			if(ele>max) {
				max=ele;
			}
		}
		System.out.println(max);//-3
		
		
		int[] arr3= {10,20,17,15,3,9};
		int min3=Integer.MAX_VALUE;
		for(int ele:arr) {
			if(ele<min3) {
				min3=ele;
			}
		}
		System.out.println(min3);//-20

			int[] arr4= {16,10,47,15,4,8};
		int min4=Integer.MAX_VALUE;
		for(int ele:arr) {
			if(ele<min3) {
				min4=ele;
			}
		}
		System.out.println(min4);//


	}

}


