package week13;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

public class ZombieSwing {
	final int MOVE_STEP = 5;
	final int MAX_X = 400;
	final int MAX_Y = 300;

	int x, y;
	int dir; // 빙향
	boolean toggle;
	
	int imgwidth = 20;
	int imgHeight = 20;
	Random r = new Random();
	
	ImageIcon imgIcon[] = new ImageIcon[2];
	Image img[] = new Image[2];

	public ZombieSwing(int x, int y) {
		this.x = x;
		this.y = y;
		for (int i = 0; i < 2; i++) {
			imgIcon[i] = new ImageIcon("images/enemy" + (i + 1) + ".png");
			img[i] = imgIcon[i].getImage();
		}
	}

	public void moveleft() {
		x = x - MOVE_STEP;
		if (x < 0)
			x = 0;
	}

	public void moveright() {
		x = x + MOVE_STEP;
		if (x > MAX_X - imgwidth)
			x = MAX_X - imgwidth;
	}
	
	public void randomMove() {
		int n = r.nextInt(3);
		if(n==0) moveleft();
		else if (n==1)moveright();
		
		toggle = !toggle;
	}
	
	public void paint(Graphics g) {
		if(toggle) {
			g.drawImage(img[0],x,y,null);
		}
		else {
			g.drawImage(img[1],x,y,null);
		}
	}
}
