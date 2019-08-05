import java.awt.Frame;
class FrameDemo1 extends Frame
{
	public FrameDemo1(String str)
	{
		super(str);
		this.setVisible(true);
		this.setSize(400,300);
	}
	public static void main(String arg[])
	{
		FrameDemo1 f1=new FrameDemo1("My First frame");
	}
}