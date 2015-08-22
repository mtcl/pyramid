package com.mtcl.pyramid.util;

public class CreatePyramid {

	public int create(Integer n) {

		if (n == 0) {
			System.out.println("Value of n is 0");
		}
		
		//initialize sum as zero
		int sum = 0;
		
		//loop for rows
		for (int i = 1; i <= n; i++) {
			
			spacesGenerator(n,i);
			
			//initialize min as a high value eg. 101
			int min = 101;
			
			for (int j = 1; j <= i; j++) {

				int r = (int) (Math.random() * 100 + 1);
				
				// if min is greater than r then min is equal to r
				min = min > r ? r : min;
				System.out.print(r);
				if(r<10){
					System.out.print("  ");
				} else {
					System.out.print(" ");
				}
			}
			
			//System.out.println("min value for thsi row is:" + min);
			sum += min;
			System.out.println();
		}

		return sum;
	}
	
	public void spacesGenerator(int max, int row){
		for(int i=max-row; i>=1; i--){
			System.out.print(" ");
		}
	}

}
