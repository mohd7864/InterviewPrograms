package com.interview.programs;

import java.util.Scanner;

public class IdenticalBalls {
	
	public int noOfWays(int n) {
		if(n <= 1) {
			return 1;
		}else {
			return noOfWays(n-1)+noOfWays(n-2);
		}
	}
	
	public static void main(String[] args) {
		IdenticalBalls idt = new IdenticalBalls();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		System.out.println("No. of Ways: "+idt.noOfWays(n));
	}

}
