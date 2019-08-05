import java.awt.Frame;
class FrameDemo2 extends Frame
{
	public FrameDemo2(String str)
	{
		super(str);
		setVisible(true);
		setSize(400,300);
	}
	public static void main(String arg[])
	{
		FrameDemo2 f1=new FrameDemo2("My First frame");
	}
}