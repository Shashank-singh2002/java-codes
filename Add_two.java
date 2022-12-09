package com.HarryProject;

public class Add_two {

public static void main(String[] args) {
	
	int[][] arr1 = {{4 , 5 ,1 },
			        {7, 8 , 9}}; 
	int[][] arr2 = {{4 , 5 ,7 },
			        {1, 8 , 9}};

	int[][] arr3 = {{0, 0 , 0},{0 , 0 , 0}}; 
	
	
	for(int i=0;i<arr1.length;i++){    
		for(int j=0;j<arr1[i].length;j++){    
		arr3[i][j]=arr1[i][j]+arr2[i][j]; 
		
		System.out.print(arr3[i][j] + " ");
		}
	
	System.out.println("");
}

		}}


