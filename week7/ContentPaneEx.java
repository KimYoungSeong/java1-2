package week7;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		this.setTitle("ContentPane 과 JFrame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프로그램 완전 종료
		
		Container c = getContentPane();
		c.setBackground(Color.ORANGE);
		c.setLayout(new FlowLayout());
		
		c.add(new JButton("OK"));
		c.add(new JButton("Cancel"));
		c.add(new JButton("Ignore"));
		
		this.setSize(300, 150);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}

}
