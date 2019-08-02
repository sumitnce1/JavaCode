
package july2019project;


import java.util.Scanner;
public class CheckNum {
   public static void main(String arg[])
   {
       Scanner s=new Scanner(System.in);
       System.out.print("enter number");
       int num=s.nextInt();
       if(num>0 && num%2==0)
           System.out.print("+ve even");
       else if(num>0 && num%2!=0)
           System.out.print("+ve odd");
       else if(num<0)
           System.out.print("-ve");
       else
           System.out.print("zero");
   }
   }
           
    
