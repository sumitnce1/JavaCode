class FruitsCline
{
	public static void main(String arg[])
	{
		if(arg.length>0)
			for(String s:arg)
			    System.out.println(s+" with length="+s.length());
		else
			System.out.print("Arguments must be passed at command prompt!");
	}
}