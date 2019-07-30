class number
{
	int a=10,b;
	public void disp()
	{
		int c=20;
		System.out.println("a="+a+",b="+b+",c="+c);
	}
	public void show()
	{
		b=50;
		System.out.println("value of b="+b);
		//System.out.println("value of c="+c);
	}
	public static void main(String arg[])
	{
		number x=new number();
		x.disp();
		x.show();
	}
}