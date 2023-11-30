package week12;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PaintLine extends JFrame {
	myPanel mp = new myPanel();

	public PaintLine() {
		this.setTitle("그래픽 예제");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setContentPane(mp);
		
		this.setSize(400, 400);
		this.setVisible(true);

		mp.setFocusable(true);
		mp.requestFocus();
	}

	class myPanel extends JPanel {
		ImageIcon icon = new ImageIcon("images/bg.jpg");
		Image img = icon.getImage();
		int x = 0;
		int y = 0;

		public myPanel() {
			this.addKeyListener(new KeyListener() {

				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					int a = e.getKeyCode();
					if (a == KeyEvent.VK_UP) {
						y = y - 10;
						if (y < 0)
							y = 0;
					}
					if (a == KeyEvent.VK_DOWN) {
						y = y + 10;
						if (y > getHeight()-10)
							y = getHeight()-10;
					}
					if (a == KeyEvent.VK_LEFT) {
						x = x - 10;
						if (x < 0)
							x = 0;
					}
					if (a == KeyEvent.VK_RIGHT) {
						x = x + 10;
						if (x > getWidth()-10)
							x = getWidth()-10;
					}
					repaint();
				}
			});
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setClip(x,y,50,50);
			g.drawImage(img, 0, 0, getWidth(), getHeight(), this);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		new PaintLine();
	}

}
