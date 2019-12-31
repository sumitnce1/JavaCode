//6. Write a program in java to enter year from the keyboard and find leap year or not.
import java.util.Scanner;
class Leap
{
 public static void main(String [] args)
   {
	 Scanner sc = new Scanner(System.in);
	 int a;
       	 System.out.print("Enter The Year:");
	 a= sc.nextInt();
	 if(a%4==0)
          {
	   System.out.println("This Year " + a +" is Leap Year .");
	  }
	 else{
	    System.out.println("This Year " + a +" is Not Leap Year.");	
	 }
     }
}


/*
OUTPUT: Enter The Year:2020
        This Year 2020 is Leap Year .

	Enter The Year:2021
	This Year 2021 is Not Leap Year.
*/