import java.io.*;
class fractional
{
              public static void main(String arg[])throws IOException
	{
	      BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter a integer");
int a=Integer.parseInt(x.readLine());
System.out.println("enter a fraction no");
float b=Float.parseFloat(x.readLine());
System.out.println("sum="+(a+b));
}
}

