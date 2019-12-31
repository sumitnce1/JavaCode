//7. Write a java program to find greatest number among the three number and number should be entered through keyboard.
import java.util.Scanner;
class Check
{
 public static void main(String [] args)
   {
	 Scanner x = new Scanner(System.in);
	 int a,b,c;
       	 System.out.print("Enter Three Number:");
	 a= x.nextInt();
	 b= x.nextInt();
	 c= x.nextInt();
	 if (a>b && a>c){
            System.out.println("Greatest Number: "+a);
        }
        if (b>a && b>c){
            System.out.println("Greatest Number: "+b);
        }
        if (c>a &&c>b) {
            System.out.println("Greatest Number: "+c);
        }
    }
}


/*
OUTPUT: Enter Three Number:55
	555
	566
	Greatest Number: 566
*/