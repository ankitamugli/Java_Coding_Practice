package conditinalstement.twodimension;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[5][3];
		arr[2][0]=99;
		arr[1][2]=88;
		arr[0][0]=77;
		System.out.println(Arrays.deepToString(arr));
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		//Traversing 2d array in matrix format
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
