import java.awt.*;
import java.awt.event.*;
class ButtDemo extends Frame implements ActionListener
{	
	Button b1,b2;
	public ButtDemo()
	{
		setLayout(null);
		b1=new Button();
		b2=new Button("GREEN");
		b1.setLabel("RED");
		Font f=new Font("verdana",Font.BOLD+Font.ITALIC,12);
		b1.setFont(f);
		b2.setFont(f);
		b1.setForeground(Color.red);
		b2.setForeground(Color.green);
		b1.setBounds(170,120,90,30);
		b2.setBounds(170,170,90,30);
		add(b1);
		add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
	         if(e.getSource()==b1)
		this.setBackground(Color.red);
	         else
		this.setBackground(Color.green);
	}	
	public static void main(String arg[])
	{
		ButtDemo f1=new ButtDemo();
		f1.setSize(400,300);
		f1.setVisible(true);
		f1.setTitle("This is first button demo");
	}
}