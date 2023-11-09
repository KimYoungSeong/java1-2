package week09;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class EventTest1 extends JFrame {
	public EventTest1() {
		this.setTitle("이벤트 리스너");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);

		setSize(300, 150);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton) e.getSource();
			if (b.getText().equals("Action")) {
				b.setText("액션");
			} else {
				b.setText("Action");
			}

		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventTest1();
	}

}

