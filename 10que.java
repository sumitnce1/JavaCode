//10. WAP in java to enter two numbers from the keyword and find maximum number.

import java.util.Scanner;
class Max
{
 public static void main(String [] args)
   {
	 Scanner sc = new Scanner(System.in);
	int a,b;
	System.out.print("Enter the first no.: ");
        a = sc.nextInt();
        System.out.print("Enter the second no.: ");
        b = sc.nextInt();
	if(a>b)
	 { 
         	System.out.println(a+" is the maximum no");
	 }
	  else
	 {
		if(b>a){
         	System.out.println(b+" is the maximum no.");
	} 
	}
}
} 



/*
OUTPUT: Enter the first no.: 33
	Enter the second no.: 44
	44 is the maximum no.
*/