package week13;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ZombieGameImage extends JFrame {
	myPanel mp = new myPanel();
	
	ZombieSwing zombie1 = new ZombieSwing(150,205);
	ZombieSwing zombie2 = new ZombieSwing(300,205);
	boolean isRunning = true;
	
	public ZombieGameImage() {
		this.setTitle("좀비 게임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setContentPane(mp);

		this.setSize(400, 400);
		this.setVisible(true);

		mp.setFocusable(true);
		mp.requestFocus();
	}

	class myPanel extends JPanel implements Runnable{
		ZombieSwing zombie1 = new ZombieSwing(150,281);
		ZombieSwing zombie2 = new ZombieSwing(300,281);
		ImageIcon icon1 = new ImageIcon("images/hero01.png");
		ImageIcon icon2 = new ImageIcon("images/hero04.png");
		Image hero = icon1.getImage();
		Image hero1 = icon2.getImage();
		ImageIcon icon3 = new ImageIcon("images/enemy1.png");
		Image enemy = icon3.getImage();
		int x = 0;
		int y = 0;
		int dir = 0;
	
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
					if (a == KeyEvent.VK_LEFT) {
						x = x - 10;
						if (x < 0)
							x = 0;
						dir=1;
					}
					if (a == KeyEvent.VK_RIGHT) {
						x = x + 10;
						if (x > getWidth() - 10)
							x = getWidth() - 10;
						dir=0;

					}
					repaint();
				}
			});
			
			new Thread(this).start();
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.black);
			g.fillRect(0, 0, 400, 300);
			g.setColor(Color.orange);
			g.fillRect(0, 300, 400, 100);
			if(dir==0) {
				g.drawImage(hero, x, 275, this);	
			}
			else{
				g.drawImage(hero1, x, 275, this);
			}
			zombie1.paint(g);
			zombie2.paint(g);
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(isRunning) {
				
				zombie1.randomMove();
				zombie2.randomMove();
				
				repaint();
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ZombieGameImage();
	}

}
