import java.io.*;
class EmpDetails2
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter employee name:");
		String ename=x.readLine();
		System.out.print("Enter employee gender m/f:");
		char gen=x.readLine().charAt(0);
		System.out.print("Enter employee salary:");
		String sal=x.readLine();
		System.out.println("\nEmployee name   :"+ename);
		System.out.println("Employee gender   :"+gen);
		System.out.println("Employee salary   :"+sal);
	}
}