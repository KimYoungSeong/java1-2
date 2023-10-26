package week7;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame {
	
	public FlowLayoutEx() {
		this.setTitle("ÇÃ·Î¿ì ·¹ÀÌ¾Æ¿ô »ùÇÃ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("del"));
		
		this.setSize(300,200);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowLayoutEx f1 = new FlowLayoutEx();
	}

}
