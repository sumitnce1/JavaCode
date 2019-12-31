//2. Write a program in java that takes your name as input from the keyboard and print it.
import java.util.Scanner;
class Name
{
    public static void main(String args[])
        {
           String s;
	   Scanner sc=new Scanner(System.in);
		System.out.print("Enter name: ");
		s = sc.nextLine(); 
		System.out.println("Name: " + s);
	}
}

/*
OUTPUT: Enter name: Sumit Kumar

        Name: Sumit Kumar