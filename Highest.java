class Highest
{
	public static void main(String arg[])
	{
		if(arg.length==3)
		{
			int a,b,c;
			a=Integer.parseInt(arg[0]);
		              b=Integer.parseInt(arg[1]);
			c=Integer.parseInt(arg[2]);
			if(a>b && a>c)
			    System.out.print("Highest no:"+a);
			else if(b>a && b>c)
			    System.out.print("Highest no:"+b);
			else
			    System.out.print("Highest no:"+c);
		}
		else
			System.out.print("Arguments must be three!");
	}
}
			