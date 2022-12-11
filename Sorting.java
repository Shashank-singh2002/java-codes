package com.HarryProject;
import java.util.Scanner;
public class Sorting {

   public static void main(String[] args)
   {
      int size=10, i, search, first, last, middle;
      int[] arr = new int[size];
      Scanner scan = new Scanner(System.in);
      
      
      for(i=0; i<size; i++)
      {
         arr[i] = scan.nextInt();
      }
      
      search = scan.nextInt();
      
      first = 0;
      last = size-1;
      middle = (first+last)/2;
      
      while(first<=last)
      {
         if(arr[middle]<search)
         {
            first = middle+1;
         }
         else if(arr[middle]==search)
         {
            System.out.println( +middle);
            break;
         }
         else
         {
            last = middle-1;
         }
         middle = (first+last)/2;
      }
      
      if(first>last)
      {
         System.out.println("\nThe element is not available in given array");
      }
   }
}