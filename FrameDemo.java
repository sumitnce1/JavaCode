import java.awt.*;
class FrameDemo extends Frame
{	
	Button b1,b2;
	public FrameDemo()
	{
		setLayout(new FlowLayout());
		b1=new Button();
		b2=new Button("GREEN");
		b1.setLabel("RED");
		add(b1);
		add(b2);
	}	
	public static void main(String arg[])
	{
		FrameDemo f1=new FrameDemo();
		f1.setSize(400,300);
		f1.setVisible(true);
		f1.setTitle("This is first button demo");
	}
}