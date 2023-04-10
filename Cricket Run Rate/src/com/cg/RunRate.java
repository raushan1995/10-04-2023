package com.cg;

import java.util.Scanner;

public class RunRate {
	
	public static void main(String[] args)
	{
		System.out.println("Enter the run rate till 10 overs");
		Scanner input = new Scanner(System.in);
		double scored = 10*input.nextDouble();
		System.out.println("Enter the target to be achieved");
		int target = input.nextInt();
		
		double remaining = target-scored;
		System.out.println("Required Runrate is : " +Math.round(remaining/40*1e2)/1e2);
	}

}
