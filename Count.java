class Count
{
	public static void main(String arg[])
	{
		if(arg.length==0)
			System.out.print("Arguments must be passed at command prompt!");
		else
		{
			int n; byte even=0,odd=0;
			for(String s:arg)
			{
				n=Integer.parseInt(s);
				if(n%2==0)
				    even++;
				else
				    odd++;
			}
			System.out.print("Total even="+even+"\ntotal odd="+odd);
		}
	}
}		