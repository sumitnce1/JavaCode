import java.io.*;
class AsciiDemo
{
	public static void main(String arg[])throws IOException
	{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a character:");
		int ch=x.read();
		System.out.printf("%c,%d",ch,ch);
	}
}