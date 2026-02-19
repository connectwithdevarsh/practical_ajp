import javax.swing.*;
import java.awt.*;
class pr33
{
	public static void main(String[]args)
	{
		JFrame f = new JFrame("Login page");
		JLabel l = new JLabel("Enter Username");
		JTextField t = new JTextField("");

		JLabel l1 = new JLabel("Enter Password");
		JTextField t1 = new JTextField("");
		
		JButton b = new JButton("Login");
		
		
		l.setBounds(50,20,100,30);
		f.add(l);


		t.setBounds(50,50,100,30);
		f.add(t);
		
		
		l1.setBounds(50,80,100,30);
		f.add(l1);

		t1.setBounds(50,110,100,30);
		f.add(t1);

		
		b.setBounds(50,150,85,30);
		f.add(b);

		
		FlowLayout fl = new FlowLayout();					
		



		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		

		
		
	}
}
		
		
		