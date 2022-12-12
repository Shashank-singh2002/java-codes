package com.HarryProject;

public class max_array {
	public static void main(String[] args) {
		int[] arr = {3,4,5,7,6 ,99, 8};
		int max = arr[0];
			for(int i = 1; i < arr.length;i++)
			{
				if(arr[i] > max)
				{
					max = arr[i];
}}
			
			System.out.println("The Given Array Element is:");
			for(int i = 0; i < arr.length;i++)
			{
				System.out.println(arr[i]);
			}
			System.out.println("max value" + max);
	
	}}
