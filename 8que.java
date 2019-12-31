//8. Write a program in java to show if a student get marks Marks Grade
//  >=85 A
//  >=75 B
//  >=65 C
//  default D
import java.util.Scanner;
class Grade
{
    public static void main(String args[])
    {
        int m;
        Scanner sc = new Scanner(System.in);
           System.out.print("Enter Marks :");
	m= sc.nextInt();
        if(m>=85)
        {
            System.out.print("A");
        }
        else if(m>=75 && m<85)
        {
           System.out.print("B");
        } 
        else if(m>=65 && m<75)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}


/*
OUTPUT: Enter Marks :86
	A
	Enter Marks :77
	B
	Enter Marks :67
	C
	Enter Marks :56
	D
*/