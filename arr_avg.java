package com.HarryProject;

public class arr_avg {
public static void main(String[] args) {
	int[] arr = {20 , 47 ,77, 66};
	
	int length = arr.length;
	 
    
    int sum = 0;

    
  
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }

    double average = sum / length;
     
    System.out.println("Average "+average);

}
}
