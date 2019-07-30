import java.io.*;
class Sum
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		int a,b;
		System.out.print("Enter two no:");
		a=Integer.parseInt(x.readLine());
		b=Integer.parseInt(x.readLine());
		System.out.print("sum="+(a+b));
	}
}