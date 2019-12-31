// 1. Write a program in java to enter number from the keyboard, find the square of the number.

import java.util.Scanner;

class SquareofNumber { 
	public static void main(String[] args) 
	{
		int n, square;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		n = sc.nextInt();		
		
		square = n * n;
		
		System.out.println("\n The Square of a Given Number  " + n + "  =  " + square);
	}
}

/*
OUTPUT:
	Please Enter any Number: 25

	he Square of a Given Number 25 = 625

*/