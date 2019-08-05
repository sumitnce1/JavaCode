import java.awt.Frame;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class MakeFrame extends Frame implements ActionListener
{
	Button b1,b2,b3,b4;
	Label l1,l2,l3;
	TextField txt1,txt2,txt3;
	public MakeFrame()
	{
		Font fnt=new Font("Courier",Font.BOLD,16);
		Color c=new Color(200,24,34);
		b1=new Button("ADD");
		b2=new Button("SUB");
		b3=new Button("MUL");
		b4=new Button("DIV");
		l1=new Label("First no.");
		l2=new Label("Second no.");
		l3=new Label("Result");
		txt1=new TextField();
		txt2=new TextField();
		txt3=new TextField();
		txt1.requestFocus();
		b1.setForeground(Color.black);
		b2.setForeground(Color.blue);
		b3.setForeground(Color.red);
		b4.setForeground(Color.green);
		setLayout(null);
		b1.setBounds(60,300,90,50);
		b2.setBounds(175,300,90,50);
		b3.setBounds(290,300,90,50);
		b4.setBounds(405,300,90,50);
		l1.setBounds(60,90,120,35);
		l2.setBounds(60,180,120,35);
		l3.setBounds(175,400,100,35);
		txt1.setBounds(335,90,150,50);
		txt2.setBounds(335,180,150,50);
		txt3.setBounds(300,400,120,40);
		b1.setFont(fnt);
		b2.setFont(fnt);
		b3.setFont(fnt);
		b4.setFont(fnt);
		txt1.setFont(fnt);
		txt2.setFont(fnt);
		txt3.setFont(fnt);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l1);
		l1.setFont(new Font("Verdana",Font.BOLD+Font.ITALIC,18));
		add(l2);
		l2.setFont(new Font("Verdana",Font.BOLD+Font.ITALIC,18));
		add(l3);
		l3.setFont(new Font("Courier",Font.BOLD+Font.ITALIC,22));
		add(txt1);
		add(txt2);
		add(txt3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		//txt3.setEnabled(false);
		txt3.setEditable(false);
	}
	public void actionPerformed(ActionEvent e)
	{
		int a=Integer.parseInt(txt1.getText());
		int b=Integer.parseInt(txt2.getText());
		if(e.getSource()==b1)
			txt3.setText(""+(a+b));
		else if(e.getSource()==b2)
			txt3.setText(""+(a-b));
		else if(e.getSource()==b3)
			txt3.setText(""+a*b);
		else
			txt3.setText(""+a/b);
	}
	public static void main(String arg[])
	{
		MakeFrame f=new MakeFrame();
		f.setVisible(true);
		f.setSize(600,500);
		f.setTitle("Arithmetic");
	}
}