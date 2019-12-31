//3. Write a program in java, an employee enters his salary if greater than 10,000 then incremented by 15%.
import java.util.Scanner;
class Salary
{
 public static void main(String [] args)
   {
      float salary;
	 Scanner sc = new Scanner(System.in);
       	 System.out.print("Enter Your Salary:");
	 salary = sc.nextFloat();
	 if (salary >=10000)
          {
	   salary =salary+((salary*15)/100);
	   System.out.println("Incremental salary: " + salary);
	  }
     }
}


/*
OUTPUT: Enter Your Salary:12000
        Incremental salary: 13800.0
*/