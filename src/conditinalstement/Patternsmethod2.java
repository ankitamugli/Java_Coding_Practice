package conditinalstement;

public class Patternsmethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		13april method2
//		int rows=5;
//		int k=1;
//		for (int i=1;i<=rows;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(k+" ");
//				k++;
//			}
//			System.out.println();
//		}
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
//		11 12 13 14 15 
		
//		int rows=5;
//		for (int i=1;i<=rows;i++) {
//			int k=rows;
//			for(int j=1;j<=i;j++) {
//				System.out.print(k+" ");
//				k--;
//			}
//			System.out.println();
//		}
//		5 
//		5 4 
//		5 4 3 
//		5 4 3 2 
//		5 4 3 2 1 
		
//			int rows=5;
//		    for (int i=1;i<=rows;i++) {
//			int k=rows-1+i;
//			for(int j=1;j<=i;j++) {
//				System.out.print(k+" ");
//				k++;
//			}
//			System.out.println();
//		}
//		5 
//		6 7 
//		7 8 9 
//		8 9 10 11 
//		9 10 11 12 13
		
//		int rows=5;
//		for (int i=1;i<=rows;i++) {
//			int k=i;
//			for(int j=1;j<=i;j++) {
//				System.out.print(k+" ");
//				k++;
//			}
//			System.out.println();
//		}
//		1 
//		2 3 
//		3 4 5 
//		4 5 6 7 
//		5 6 7 8 9 
		
//		int rows=5;
//		for (int i=1;i<=rows;i++) {
//			int k=1;
//			for(int j=1;j<=i;j++) {
//				System.out.print(k+" ");
//				k++;
//			}
//			System.out.println();
//		}
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 
		
//		int rows=5;
//		int k=1;
//		for (int i=1;i<=rows;i++) {
//			for(int j=1;j<=i;j++) {
//				if(k%2==0) {
//				System.out.print(0+" ");
//				}
//				else {
//					System.out.print(1+" ");
//				}
//				k++;
//			}
//			System.out.println();
//		}
//		1 
//		0 1 
//		0 1 0 
//		1 0 1 0 
//		1 0 1 0 1 
//		or
//		int rows=5;
//		int k=1;
//		for (int i=1;i<=rows;i++) {		
//			for(int j=1;j<=i;j++) {
//				System.out.print(k%2+" ");
//				k++;
//			}
//			System.out.println();
//		}

		

//			int rows=5;
//		    for (int i=1;i<=rows;i++) {
//			int k=1;
//			for(int j=1;j<=i;j++) {
//				System.out.print(k%2+" ");
//				k++;
//			}
//			System.out.println();
//		}
//		1 
//		1 0 
//		1 0 1 
//		1 0 1 0 
//		1 0 1 0 1 
		
	//
//		int rows=5;
//		int k=1;
//		for (int i=1;i<=rows;i++) {		
//			for(int j=1;j<=i;j++) {
//				System.out.print(k%5+" ");
//				k++;
//			}
//			System.out.println();
//		}
//		1 
//		2 3 
//		4 0 1 
//		2 3 4 0 
//		1 2 3 4 0 
//		or
//		int rows=5;
//		int k=1;
//		for (int i=1;i<=rows;i++) {			
//			for(int j=1;j<=i;j++) {
//				System.out.print(k%5+" ");
//				k++;
//				if(k==5) {
//					k=0;
//				}
//			}
//			System.out.println();
//		}

//		int rows=5;
//		int k=rows;
//		for (int i=1;i<=rows;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(k%5+" ");
//				k++;
//				if(k==5) {
//					k=0;
//				}
//			}
//			System.out.println();
//		}
//		0 
//		1 2 
//		3 4 0 
//		1 2 3 4 
//		0 1 2 3 4 
		
//		extra:
//		int rows=5;
//		int k=rows-1;
//		for (int i=1;i<=rows;i++) {
//			
//			for(int j=1;j<=i;j++) {
//				System.out.print(k%5+" ");
//				k++;
//				if(k==5) {
//					k=0;
//				}
//			}
//			System.out.println();
//		}
//		4 
//		0 1 
//		2 3 4 
//		0 1 2 3 
//		4 0 1 2 3 


//		int rows=5;
//		int k=1;
//		for (int i=1;i<=rows;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print((char)(k+64)+" ");
//				k++;
//			}
//			System.out.println();
//		}
//		A 
//		B C 
//		D E F 
//		G H I J 
//		K L M N O

//		int rows=5;
//		for (int i=1;i<=rows;i++) {
//			int k=rows;
//			for(int j=1;j<=i;j++) {
//				System.out.print((char)(k+64)+" ");
//				k--;
//			}
//			System.out.println();
//		}
//		E 
//		E D 
//		E D C 
//		E D C B 
//		E D C B A 
		
//		int rows=5;
//		for (int i=1;i<=rows;i++) {
//			int k=rows-1+i;
//			for(int j=1;j<=i;j++) {
//				System.out.print((char)(k+64)+" ");
//				k++;
//			}
//			System.out.println();
//		}
//		E 
//		F G 
//		G H I 
//		H I J K 
//		I J K L M 
		
//		int rows=5;
//		for (int i=1;i<=rows;i++) {
//			int k=i;
//			for(int j=1;j<=i;j++) {
//				System.out.print((char)(k+64)+" ");
//				k++;
//			}
//			System.out.println();
//		}
//		A 
//		B C 
//		C D E 
//		D E F G 
//		E F G H I
		
		
		
//		14)april	
//		int rows=5;
//		int k=rows;
//		for (int i=1;i<=rows;i++) {
//			for(int j=1;j<=i;j++) {
//				if(k%2==0) {
//				System.out.print(1+" ");
//				}
//				else {
//					System.out.print(0+" ");
//				}
//				k++;
//			}
//			System.out.println();
//		}
//		0 
//		1 0 
//		1 0 1 
//		0 1 0 1 
//		0 1 0 1 0 
////	
//		int rows=5;
//		int k=rows;
//		for (int i=1;i<=rows;i++) {
//			
//			for(int j=1;j<=i;j++) {
//				System.out.print(k%5+" ");
//				k++;
//			}
//			System.out.println();
//		}
//		0 
//		1 2 
//		3 4 0 
//		1 2 3 4 
//		0 1 2 3 4 

		
//		int rows=5;
//		int k=1;
//		for (int i=1;i<=rows;i++) {
//			for(int j=1;j<=i;j++) {
//				if(k%2==0) {
//				System.out.print((char)(k+96)+" ");
//				}
//				else {
//					System.out.print((char)(k+64)+" ");
//				}
//				k++;
//			}
//			System.out.println();
//		}
//		A 
//		b C 
//		d E f 
//		G h I j 
//		K l M n O 
		
//		int rows=5;
//		for (int i=1;i<=rows;i++) {
//			int k=rows+1-i;
//			for(int j=1;j<=i;j++) {
//				System.out.print((k+1)%2+" ");
//				k++;
//			}
//			System.out.println();
//		}
//		0 
//		1 0 
//		0 1 0 
//		1 0 1 0 
//		0 1 0 1 0 
		
		
//		int rows=5;
//			for (int i=1;i<=rows;i++) {
//				int k=rows+1-i;
//				for(int j=1;j<=i;j++) {
//					System.out.print((k+1)%5+" ");
//					k++;
//				}
//				System.out.println();
//			}
//			1 
//			0 1 
//			4 0 1 
//			3 4 0 1 
//			2 3 4 0 1 
//		int rows=5;
//		for (int i=1;i<=rows;i++) {
//			int k=rows+1-i;
//			for(int j=1;j<=i;j++) {
//				System.out.print(k+" ");
//				k++;
//			}
//			System.out.println();
//		}
//		5 
//		4 5 
//		3 4 5 
//		2 3 4 5 
//		1 2 3 4 5 
		
//		int rows=5;
//		int k=1;
//		for (int i=1;i<=rows;i++) {	
//			for(int j=1;j<=i;j++) {
//				System.out.print(k%5+" ");
//				k++;
//			}
//			System.out.println();
//		}
//		1 
//		2 3 
//		4 0 1 
//		2 3 4 0 
//		1 2 3 4 0 
		
		
//		int rows=5;
//		int k=0;
//		for (int i=1;i<=rows;i++) {	
//			for(int j=1;j<=i;j++) {
//				System.out.print(k%5+" ");
//				k++;
//			}
//			System.out.println();
//		}
//		0 
//		1 2 
//		3 4 0 
//		1 2 3 4 
//		0 1 2 3 4

//		int rows=5;
//		for (int i=1;i<=rows;i++) {
//			int k=i;
//				for(int j=1;j<=i;j++) {
//					System.out.print(k%5+" ");
//					k--;
//				}
//				System.out.println();
//			}
//		1 
//		2 1 
//		3 2 1 
//		4 3 2 1 
//		0 4 3 2 1
		
//		int rows=5;
//		int k=1;
//		for (int i=1;i<=rows;i++) {
//			 k=k+i-1;
//		for(int j=1;j<=i;j++) {
//			 
//			System.out.print(k+" ");
//			k--;
//		}
//		System.out.println();
//		k=k+i+1;
//	}
//		1 
//		3 2 
//		6 5 4 
//		10 9 8 7 
//		15 14 13 12 11 
		
		
//		int rows=5;	
//			for (int i=1;i<=rows;i++) {
//				int k=rows+1-i;
//				for(int j=1;j<=i;j++) {
//					System.out.print((k%2)+" ");
//					k++;
//				}
//				System.out.println();
//			}
//			1 
//			0 1 
//			1 0 1 
//			0 1 0 1 
//			1 0 1 0 1 
		
		
//		17 april 
//		for odd numbers
//		int rows=7;
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<=rows;j++) {
//				if(i==1 || i==rows|| j==1 || j==rows || i==(rows+1)/2 ||j==(rows+1)/2 ||i==(rows+1-i) ||j==(rows+1-i) )
//					System.out.print("*" +" ");
//				else {
//					System.out.print(" "+" ");
//				}
//			}
//			System.out.println();
//		}
//		* * * * * * * 
//		*     *   * * 
//		*     * *   * 
//		* * * * * * * 
//		*   * *     * 
//		* *   *     * 
//		* * * * * * * 
//		int rows=7;
//		for(int i=1;i<=rows;i++) {
//			for(int j=1;j<=rows;j++) {
//				if(j==1 || i==rows|| i==j )
//					System.out.print("*" +" ");
//				else {
//					System.out.print(" "+" ");
//				}
//			}
//			System.out.println();
//		}
//		*             
//		* *           
//		*   *         
//		*     *       
//		*       *     
//		*         *   
//		* * * * * * * 
//		int rows = 5;
//		int k = 1;
//
//		for(int i = 1; i <= rows; i++) {
//		    for(int j = 1; j <= i; j++) {
//		        if(j == 1 || i == rows || i == j) {
//		            System.out.print((char)(k + 64) + " ");
//		            k++;
//		        } else {
//		            System.out.print("  ");
//		        }
//		    }
//		    System.out.println();
//		}
//		A 
//		B C 
//		D   E 
//		F     G 
//		H I J K L 
		
//		int rows = 5;
//		int k = 1;
//
//		for(int i = 1; i <= rows; i++) {
//		    for(int j = 1; j <= i; j++) {
//		        if(j == 1 || i == rows || i == j) {
//		            System.out.print(k + " ");
//		            k++;
//		        } else {
//		            System.out.print("  ");
//		        }
//		    }
//		    System.out.println();
//		}
//		1 
//		2 3 
//		4   5 
//		6     7 
//		8 9 10 11 12 
//		
//		int rows = 5;
//		for(int i = 1; i <= rows; i++) {
//			int k = rows;
//		    for(int j = 1; j <= i; j++) {
//		        if(j == 1 || i == rows || i == j) {
//		            System.out.print(k + " ");
//		            k--;
//		        } else {
//		            System.out.print("  ");
//		        }
//		    }
//		    System.out.println();
//		}
//		5 
//		5 4 
//		5   4 
//		5     4 
//		5 4 3 2 1 
		
//		int rows = 5;
//		for(int i = 1; i <= rows; i++) {
//			int k = 1;
//		    for(int j = 1; j <= i; j++) {
//		        if(j == 1 || i == rows || i == j) {
//		            System.out.print(k + " ");
//		            k++;
//		        } else {
//		            System.out.print("  ");
//		        }
//		    }
//		    System.out.println();
//		}
//		1 
//		1 2 
//		1   2 
//		1     2 
//		1 2 3 4 5
		
//		int rows = 5;
//		for(int i = 1; i <= rows; i++) {
//			int k = i;
//		    for(int j = 1; j <= i; j++) {
//		        if(j == 1 || i == rows || i == j) {
//		            System.out.print(k + " ");
//		            k++;
//		        } else {
//		            System.out.print("  ");
//		        }
//		    }
//		    System.out.println();
//		}
//		1 
//		2 3 
//		3   4 
//		4     5 
//		5 6 7 8 9 
		
		
//		int rows = 5;	
//		for(int i = 1; i <= rows; i++) {
//			int k = i;
//		    for(int j = 1; j <= i; j++) {
//		        if(j == 1 || i == rows || i == j) {
//		            System.out.print(k + " ");
//		            k++;
//		        } else {
//		            System.out.print("  ");
//		        }
//		    }
//		    System.out.println();
//		}
//		1 
//		2 3 
//		3   4 
//		4     5 
//		5 6 7 8 9 
	
		
//         int rows = 5;	
//		   for(int i = 1; i <= rows; i++) {
//		   int k = i;
//		   for(int j = 1; j <= i; j++) {
//		        if(j == 1 || i == rows || i == j) {
//		            System.out.print(k + " ");
//		            k--;
//		        } 
//		         else {
//		            System.out.print("  ");
//		        }
//		    }
//		    System.out.println();
//		}
//		1 
//		2 1 
//		3   2 
//		4     3 
//		5 4 3 2 1 
		
		


		
		
		
	
		
	}
	}
