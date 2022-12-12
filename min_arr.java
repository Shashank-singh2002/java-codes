package com.HarryProject;

public class min_arr {
	public static void main(String[] args) {
		int[] arr = {3,4,5,7,6 ,99, 8};
		int min = arr[0];
			for(int i = 1; i < arr.length;i++)
			{
				if(arr[i] < min)
				{
					min = arr[i];
}}
			
			System.out.println("The Given Array Element is:");
			for(int i = 0; i < arr.length;i++)
			{
				System.out.println(arr[i]);
			}
			System.out.println("max value" + min);
	
	}}


