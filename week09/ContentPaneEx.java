package week09;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane°ú JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel north = new JPanel();
		north.setBackground(Color.GRAY);
		
		JPanel center = new JPanel();
		
		JLabel l1 = new JLabel("Hello");
		l1.setLocation(100,20);
		l1.setSize(50, 20);
		JLabel l2 = new JLabel("Java");
		l2.setLocation(20,150);
		l2.setSize(50, 20);
		JLabel l3 = new JLabel("Love");
		l3.setLocation(200,100);
		l3.setSize(50, 20);
		
		center.setLayout(null);
		
		center.add(l1);
		center.add(l2);
		center.add(l3);
		
		JButton b1 = new JButton("Open");
		JButton b2 = new JButton("Read");
		JButton b3 = new JButton("Close");
		
		north.add(b1);
		north.add(b2);
		north.add(b3);
		
		c.add(north,BorderLayout.NORTH);
		c.add(center,BorderLayout.CENTER);
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
