
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame implements ActionListener
{
	Button b1,b2,b3;
	public MyFrame()
	{
		super("First Frame Example");
		setSize(400,300);
		setLayout(new FlowLayout());

		b1=new Button("Red");
		b1.addActionListener(this);

		b2=new Button("Green");
		b2.addActionListener(this);

		b3=new Button("Blue");
		b3.addActionListener(this);

		add(b1);
		add(b2);
		add(b3);
	}
	public void actionPerformed(ActionEvent e)
	{
		String str=((Button)e.getSource()).getLabel();
		System.out.println(str+" Button pressed");
	}
}
class DemoWindow 
{
	public static void main(String[] args) 
	{
		MyFrame mf=new MyFrame();
		mf.setVisible(true);
	}
}

