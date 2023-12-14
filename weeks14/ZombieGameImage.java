package weeks14;

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

	ZombieSwing zombie1 = new ZombieSwing(150, 205);
	ZombieSwing zombie2 = new ZombieSwing(300, 205);
	boolean isRunning = true;
	boolean heroDead1, heroDead2;
	boolean gameOver;

	public ZombieGameImage() {
		this.setTitle("좀비 게임");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setContentPane(mp);

		this.setSize(415, 400);
		this.setVisible(true);

		mp.setFocusable(true);
		mp.requestFocus();
	}

	class myPanel extends JPanel implements Runnable {
		ZombieSwing zombie1 = new ZombieSwing(150, 281);
		ZombieSwing zombie2 = new ZombieSwing(300, 281);
		HeroSwing he = new HeroSwing(0, 275);
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

					if ((heroDead1 == false) && (heroDead2 == false) && (gameOver == false)) {

						int a = e.getKeyCode();
						if (a == KeyEvent.VK_UP) {
							he.jump = true;
						}
						if (a == KeyEvent.VK_LEFT) {
							he.moveleft();
							he.dir = 2;
						}
						if (a == KeyEvent.VK_RIGHT) {
							he.moveright();
							he.dir = 1;
						}
						heroDead1 = he.crush(zombie1);
						heroDead2 = he.crush(zombie2);
						repaint();
					}
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
			zombie1.paint(g);
			zombie2.paint(g);
			he.paint(g);

			if (heroDead1 || heroDead2) {
				g.setColor(Color.red);
				g.drawString("좀비에게 잡혔습니다.", 100, 100);
				isRunning = false;
			}
			if (gameOver) {
				g.setColor(Color.red);
				g.drawString("목적지의 도착했습니다. 게임을 종료합니다.", 100, 100);
				isRunning = false;
			}
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (isRunning) {

				he.heroMove();
				gameOver = he.heroMove();
				if (gameOver) {
					repaint();
				}
				zombie1.randomMove();
				zombie2.randomMove();

				heroDead1 = zombie1.crush(he);
				heroDead2 = zombie2.crush(he);

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
