package conditinalstement;

public class Pattern {

public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for(int i=1;i<=5;i++) {
//			for (int j=1;j<=5;j++){
//				System.out.println('*'+" ");
//			}
//			System.out.println();
//		}
//	

//	method1
//1)
//	int rows=5;
//	for (int i=1;i<=rows;i++) {
//		for (int j=rows;j>=i;j--) {
//			System.out.print(j + " ");
//		}
//	System.out.println();
//	}
//	5 4 3 2 1 
//	5 4 3 2 
//	5 4 3 
//	5 4 
//	5 
	
//2)	
//	int rows=5;
//	for (int i=1;i<=rows;i++) {
//		for (int j=1;j<=i;j++) {
//			System.out.print('*' + " ");
//		}
//		System.out.println();
//	}
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * * 
	
//	3)
//	int rows=5;
//	for (int i=1;i<=rows;i++) {
//		for (int j=rows;j>=i;j--) {
//			System.out.print('*' + " ");
//		}
//		System.out.println();
//	}
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	* 	
//	4)
//		int rows = 5;
//		for (int i = 1; i <= rows; i++) {
//		    for (int j = i; j >= 1; j--) {
//		        System.out.print(j + " ");
//		    }
//		    System.out.println();
//		}
//	1 
//	2 1 
//	3 2 1 
//	4 3 2 1 
//	5 4 3 2 1 
//		5)
//		int rows=5;
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<= i ;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
//	    1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 
//	6)
//	int rows = 5;
//
//	for(int i = 1; i <= rows; i++) {
	
//	    for(int j = 1; j <= (rows - i + 1); j++) {
//	        System.out.print(j + " ");
//	    }
//	    System.out.println();
//	}
//	1 2 3 4 5 
//	1 2 3 4 
//	1 2 3 
//	1 2 
//	1 
	//7)
//	int rows = 5;
//
//	for (int i = 1; i <= rows; i++) {
//	    for (int j= rows; j >= rows-i+ 1; j--) {
//	        System.out.print(j + " ");
//	    }
//	    System.out.println();
//	}
//	5 
//	5 4 
//	5 4 3 
//	5 4 3 2 
//	5 4 3 2 1 
//	8)
//	int rows=5;
//	for(int i=1;i<=rows;i++) {
//		for (int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//		for(int j=1;j<=i;j++) {
//			System.out.print("*"+" ");
//	}
//	System.out.println();
//	
//	}
//        * 
//      * * 
//    * * * 
//  * * * * 
//* * * * * 
//	10)
//	int rows=5;
//	for(int i=1;i<=rows;i++) {
//		for (int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//		for(int j=i;j>=1;j--) {
//			System.out.print(j+" ");
//	}
//	System.out.println();
//	
//	}
//        1 
//      2 1 
//    3 2 1 
//  4 3 2 1 
//5 4 3 2 1 
//	11)
	//	int rows=5;
	//	for(int i=1;i<=rows;i++) {
	//		for (int j=1;j<=rows-i;j++) {
	//			System.out.print(" "+" ");
	//		}
	//		for(int j=1;j<=i;j++) {
	//			System.out.print(j+" ");
	//	}
	//	System.out.println();
	//	
	//	}
	//        1 
	//      1 2 
	//    1 2 3 
	//  1 2 3 4 
	//1 2 3 4 5 
//	12)
//	int rows = 5;
//	for (int i=1;i<=rows;i++) {
//	    for (int j=1;j>=rows-i;j++) {
//	        System.out.print(j+" ");
//	    }
//	    for(int j=1;j<=i;j++) {
//			System.out.print(j+" ");
//	}
//	    System.out.println();
//	}
//	13)
//	int rows=5;
//	for(int i=1;i<=rows;i++){
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//		for(int j=1;j<=i;j++) {
//			System.out.print((char)(j+64)+" ");
//		}
//		System.out.println();
//	}
//        A 
//      A B 
//    A B C 
//  A B C D 
//A B C D E 
//	14)
	
//	14)
//	int rows=5;
//	for(int i=1;i<=rows;i++) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//		for(int j=rows;j>=rows-i+1;j--) {
//			System.out.print((char)(j+64)+" ");
//
//		}System.out.println();
//	}
//        E 
//      E D 
//    E D C 
//  E D C B 
//E D C B A 
//	 int rows=5;
//	 for(int i=1;i<=rows;i++) {
//		 for (int j=rows;j>=rows-i+1;j--) {
//			 System.out.print(j +" ");
//		 }
//		 for(int j=rows;j<=(rows-i)+1;j++) {
//			 System.out.print(' ' +" ");
//		 }
//		 System.out.println();
//		 
//	 }
//	 5   
//	 5 4 
//	 5 4 3 
//	 5 4 3 2 
//	 5 4 3 2 1 
	//int rows=5;
	//for(int i=rows;i>=1;i--) {
		//for(int j=1;j<=i;j++) {
			//System.out.print(j+" ");
		//}
		//System.out.println()/;
	//}
//	int rows=5;
//	for(int i=rows;i>=1;i--) {
//		for(int j=1;j<=i;j++) {
//			System.out.print(j+"");
//		}
//		System.out.println();
//	}
//	12345
//	1234
//	123
//	12
//	1
//	int rows=5;
//	for(int i=1;i<=rows;i++) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=1;j<=i;j++) {
//		System.out.print('*'+" ");
//	}
//	for( int j=1;j<=i-1;j++) {
//		System.out.print('*'+" ");
//		
//	}
//	System.out.println();
//	}
//	      * 
//      * * * 
//    * * * * * 
//  * * * * * * * 
//* * * * * * * * * 
//	int rows=5;
//	for(int i=1;i<=rows;i++) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=1;j<=i;j++) {
//		System.out.print(j+" ");
//	}
//	for( int j=i-1;j>=1;j--) {
//		System.out.print(j+" ");
//		
//	}
//	System.out.println();
//	}
//        1 
//      1 2 1 
//    1 2 3 2 1 
//  1 2 3 4 3 2 1 
//1 2 3 4 5 4 3 2 1 
	
//	int rows=5;
//	for(int i=1;i<=rows;i++) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=i;j>=1;j--) {
//		System.out.print(j+" ");
//	}
//	for( int j=2;j<=i;j++) {
//		System.out.print(j+" ");
//		
//	}
//	System.out.println();
//	}
//        1 
//      2 1 2 
//    3 2 1 2 3 
//  4 3 2 1 2 3 4 
//5 4 3 2 1 2 3 4 5 

//	int rows=5;
//	for(int i=1;i<=rows;i++) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=rows;j>=rows+1-i;j--) {
//		System.out.print(j+" ");
//	}
//	for( int j=rows+2-i;j<=rows;j++) {
//		System.out.print(j+" ");
//		
//	}
//	System.out.println();
//	}
//        5 
//      5 4 5 
//    5 4 3 4 5 
//  5 4 3 2 3 4 5 
//5 4 3 2 1 2 3 4 5 
	
//	int rows=5;
//	for(int i=1;i<=rows;i++) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=rows;j>=rows+1-i;j--) {
//		System.out.print(j+" ");
//	}
//	for(int j=2;j<=i;j++) {
//		System.out.print(j+" ");
//		
//	}
//	System.out.println();
//	}
	
//        5 
//      5 4 2 
//    5 4 3 2 3 
//  5 4 3 2 2 3 4 
//5 4 3 2 1 2 3 4 5 
	
//	int rows=5;
//	for(int i=1;i<=rows;i++) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=rows;j>=rows+1-i;j--) {
//		System.out.print((char)(j+64)+" ");
//	}
//	for(int j=2;j<=i;j++) {
//		System.out.print((char)(j+64)+" ");
//		
//	}
//	System.out.println();
//	}
	
//        E 
//      E D B 
//    E D C B C 
//  E D C B B C D 
//E D C B A B C D E
//	int rows=5;
//	for(int i=1;i<=rows;i++) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=1;j<=i;j++) {
//		System.out.print((char)(j+64)+" ");
//	}
//	for( int j=i-1;j>=1;j--) {
//		System.out.print((char)(j+64)+" ");
//		
//	}
//	System.out.println();
//	}
	
//        A 
//      A B A 
//    A B C B A 
//  A B C D C B A 
//A B C D E D C B A 
//	int rows=5;
//	for(int i=1;i<=rows;i++) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=i;j>=1;j--) {
//		System.out.print((char)(j+64)+" ");
//	}
//	for( int j=2;j<=i;j++) {
//		System.out.print((char)(j+64)+" ");
//		}
//	System.out.println();
//	}
	
//        A 
//      B A B 
//    C B A B C 
//  D C B A B C D 
//E D C B A B C D E 

	
//	int rows=5;
//	for(int i=1;i<=rows;i++) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=1;j<=i;j++) {
//		System.out.print('*'+" ");
//	}
//	for( int j=1;j<=i-1;j++) {
//		System.out.print('*'+" ");
//		
//	}
//	System.out.println();
//	}
//	int rows=5;
//	for(int i=1;i<=rows;i++) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=1;j<=i;j++) {
//		System.out.print('*'+" ");
//	}
//	for( int j=1;j<=i-1;j++) {
//		System.out.print('*'+" ");
//		
//	}
//	System.out.println();
//	}
//	for(int i=rows-1;i>=1;i--) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=1;j<=i;j++) {
//		System.out.print('*'+" ");
//	}
//	for( int j=1;j<=i-1;j++) {
//		System.out.print('*'+" ");
//		
//	}
//	System.out.println();
//	}
//        * 
//      * * * 
//    * * * * * 
//  * * * * * * * 
//* * * * * * * * * 
//  * * * * * * * 
//    * * * * * 
//      * * * 
//        * 
//	int rows=5;
//	for(int i=1;i<=rows;i++) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=1;j<=i;j++) {
//		System.out.print(j+" ");
//	}
//	for( int j=1;j<=i-1;j++) {
//		System.out.print(j+" ");
//		
//	}
//	System.out.println();
//	}
//	
//	for(int i=rows-1;i>=1;i--) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=1;j<=i;j++) {
//		System.out.print(j+" ");
//	}
//	for( int j=1;j<=i-1;j++) {
//		System.out.print(j+" ");
//		
//	}
//	System.out.println();
//	}
//        1 
//      1 2 1 
//    1 2 3 1 2 
//  1 2 3 4 1 2 3 
//1 2 3 4 5 1 2 3 4 
//  1 2 3 4 1 2 3 
//    1 2 3 1 2 
//      1 2 1 
//        1 
//	int rows=5;
//	for(int i=1;i<=rows;i++) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=i;j>=1;j--) {
//		System.out.print(j+" ");
//	}
//	for( int j=2;j<=i;j++) {
//		System.out.print(j+" ");
//		
//	}
//	System.out.println();
//	}
//	for(int i=rows-1;i>=1;i--) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=i;j>=1;j--) {
//		System.out.print(j+" ");
//	}
//	for( int j=2;j<=i;j++) {
//		System.out.print(j+" ");
//		
//	}
//	System.out.println();
//	}
    //
	
	//    1 
//      2 1 2 
//    3 2 1 2 3 
//  4 3 2 1 2 3 4 
//5 4 3 2 1 2 3 4 5 
//  4 3 2 1 2 3 4 
//    3 2 1 2 3 
//      2 1 2 
//        1 
//	int rows=5;
//	for(int i=1;i<=rows;i++) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=rows;j>=rows+1-i;j--) {
//		System.out.print(j+" ");
//	}
//	for( int j=rows+2-i;j<=rows;j++) {
//		System.out.print(j+" ");
//		
//	}
//	System.out.println();
//	}
//	
//	for(int i=rows-1;i>=1;i--) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=rows;j>=rows+1-i;j--) {
//		System.out.print(j+" ");
//	}
//	for( int j=rows+2-i;j<=rows;j++) {
//		System.out.print(j+" ");
//		
//	}
//	System.out.println();
//	}
//         5 
//       5 4 5 
//     5 4 3 4 5 
//   5 4 3 2 3 4 5 
// 5 4 3 2 1 2 3 4 5 
//   5 4 3 2 3 4 5 
//     5 4 3 4 5 
//       5 4 5 
//         5 
//	int rows=5;
//	for(int i=1;i<=rows;i++) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=rows;j>=rows+1-i;j--) {
//		System.out.print(j+" ");
//	}
//	for(int j=2;j<=i;j++) {
//		System.out.print(j+" ");
//		
//	}
//	System.out.println();
//	}
//	
//for(int i=rows-1;i>=1;i--) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=rows;j>=rows+1-i;j--) {
//		System.out.print(j+" ");
//	}
//	for(int j=2;j<=i;j++) {
//		System.out.print(j+" ");
//		
//	}
//	System.out.println();
//	}
//        5 
//      5 4 2 
//    5 4 3 2 3 
//  5 4 3 2 2 3 4 
//5 4 3 2 1 2 3 4 5 
//  5 4 3 2 2 3 4 
//    5 4 3 2 3 
//      5 4 2 
//        5 


//	int rows=5;
//	for(int i=rows;i>=1;i--) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=1;j<=i;j++) {
//		System.out.print('*'+" ");
//	}
//	for( int j=1;j<=i-1;j++) {
//		System.out.print('*'+" ");
//		
//	}
//	System.out.println();
//	}
//	for(int i=1;i<=rows;i++) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=1;j<=i;j++) {
//		System.out.print('*'+" ");
//	}
//	for( int j=1;j<=i-1;j++) {
//		System.out.print('*'+" ");
//		
//	}
//	System.out.println();
//	}
//	* * * * * * * * * 
//	  * * * * * * * 
//	    * * * * * 
//	      * * * 
//	        * 
//	        * 
//	      * * * 
//	    * * * * * 
//	  * * * * * * * 
//	* * * * * * * * * 
//	int rows=5;
//	for(int i=rows;i>1;i--) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=1;j<=i;j++) {
//		System.out.print(j+" ");
//	}
//	for( int j=1;j<=i-1;j++) {
//		System.out.print(j+" ");
//		
//	}
//	System.out.println();
//	}
//	
//	for(int i=1;i<=rows;i++) {
//		for(int j=1;j<=rows-i;j++) {
//			System.out.print(" "+" ");
//		}
//	for (int j=1;j<=i;j++) {
//		System.out.print(j+" ");
//	}
//	for( int j=1;j<=i-1;j++) {
//		System.out.print(j+" ");
//		
//	}
//	System.out.println();
//}
//	1 2 3 4 5 1 2 3 4 
//	  1 2 3 4 1 2 3 
//	    1 2 3 1 2 
//	      1 2 1 
//	        1 
//	      1 2 1 
//	    1 2 3 1 2 
//	  1 2 3 4 1 2 3 
//	1 2 3 4 5 1 2 3 4 
	
	
	
	
//







	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	  	
	
}
}