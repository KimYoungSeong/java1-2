package weeks10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class RandomNumber extends JFrame {
	Random r = new Random();
	JLabel[] la;
	JLabel t;

	public RandomNumber() {
		setTitle("RandomNumber 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		c.addKeyListener(new MyKeyListener());

		la = new JLabel[3];
		la[0] = new JLabel(" 0 ");
		la[1] = new JLabel(" 0 ");
		la[2] = new JLabel(" 0 ");
		for (int i = 0; i < la.length; i++) {
			c.add(la[i]);
			la[i].setHorizontalAlignment(JLabel.CENTER);
			la[i].setOpaque(true);
			la[i].setBackground(Color.MAGENTA);
			la[i].setForeground(Color.YELLOW);
			la[i].setFont(new Font("Tahoma", Font.ITALIC, 30));
			la[i].setLocation(100+(i*100),100);
			la[i].setSize(70,50);
		}
		
		t = new JLabel();
		t.setLocation(200, 300);
		t.setSize(100, 100);
		c.add(t);

		setSize(500, 500);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();
	}

	class MyKeyListener implements KeyListener {
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int keycode = e.getKeyCode();
			if (keycode == KeyEvent.VK_ENTER) {
				int a = r.nextInt(5);
				int b = r.nextInt(5);
				int c = r.nextInt(5);
				la[0].setText(a + " ");
				la[1].setText(b + " ");
				la[2].setText(c + " ");

				if (a == b && b == c) {
					t.setText("축하합니다");
				} else {
					t.setText("아쉽군요");
				}
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RandomNumber();
	}

}