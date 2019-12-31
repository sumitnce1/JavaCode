//11. Write a program in java to print odd numbers from 1 to 100.

import java.util.Scanner;
class odd
{
 public static void main(String [] args)
   {
	int n = 100;
	System.out.print("Odd Numbers from 1 to "+n+" are: ");
	for (int i = 1; i <= n; i++) {
	   if (i % 2 != 0) {
		System.out.print(i + " ");
	   }
	}
}
} 



/*
OUTPUT: Odd Numbers from 1 to 100 are: 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61 63 65 67 69 71 73 75 77 79 81 83 85 87 89 91 93 95 97 99
*/