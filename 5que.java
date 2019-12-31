//5. Write a program in java to check the number entered through the keyboard is even or odd.
import java.util.Scanner;
class EvenOdd
{
 public static void main(String [] args)
   {
	 Scanner sc = new Scanner(System.in);
	 int a;
       	 System.out.print("Enter Any Number:");
	 a= sc.nextInt();
	 if(a%2==0)
          {
	   System.out.println("This Number " + a +" is Even.");
	  }
	 else{
	    System.out.println("This Number " + a +" is Odd.");	
	 }
     }
}


/*
OUTPUT: Enter Any Number:13
        This Number 13 is Odd.
*/