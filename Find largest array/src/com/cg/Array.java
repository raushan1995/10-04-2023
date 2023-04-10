package com.cg;

import java.util.Scanner;

public class Array {
	
	public static void main(String args[]) {
	
	int n,i,large;
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Enter the value of n : ");
    n = scan.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter " +n+ "Number: ");
    for(i=0; i<n; i++)
    	arr[i] = scan.nextInt();
    
    large = arr[0];
    for(i=1; i<n; i++)
    {
    	if(large<arr[i])
    		large = arr[i];
    }
    System.out.println("\nLargest Number = " + large);
    }
}
