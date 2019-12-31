//4. Write a program in java to enter a number from the keyboard and check it is lesser than 100. 
import java.util.Scanner;
class Number
{
 public static void main(String [] args)
   {
      int n;
	 Scanner sc = new Scanner(System.in);
       	 System.out.print("Enter Any Number:");
	 n= sc.nextInt();
	 if(n<100)
          {
	   System.out.println("This Number " + n +" is Less than 100.");
	  }
	 else{
	    System.out.println("Invalid Number.");	
	 }
     }
}


/*
OUTPUT: Enter Any Number:24
        This Number 24is Less than 100.
	
	Enter Any Number:112
        Invalid Number.
*/