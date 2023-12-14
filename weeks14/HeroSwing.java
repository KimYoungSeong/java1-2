package weeks14;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

import javax.swing.ImageIcon;

public class HeroSwing {
	final int MOVE_STEP = 5;
	final int MAX_X = 400;
	final int MAX_Y = 300;

	int x, y;
	int dir = 1; // 빙향

	int imgwidth = 21;
	int imgHeight = 26;
	int count = 0;
	boolean jump;
	int jumpcount = 1;

	Random r = new Random();

	ImageIcon imgIcon[] = new ImageIcon[6];
	Image img[] = new Image[6];

	public HeroSwing(int x, int y) {
		this.x = x;
		this.y = y;
		for (int i = 0; i < 6; i++) {
			imgIcon[i] = new ImageIcon("images/hero0" + (i + 1) + ".png");
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

	public boolean heroMove() {
		count++;

		if (jump == true) {
			if (jumpcount <= 5) {
				y = y - 10;
			} else if (jumpcount <= 10) {
				y = y + 10;
			}
			if (jumpcount == 10) {
				jump = false;
				jumpcount = 1;
			} else
				jumpcount++;
		}
		if (x >= MAX_X - imgwidth)
			return true;
		else
			return false;
	}

	public boolean crush(ZombieSwing z) {

		// (z.x<x<z.x+z.imgwidth) 좀비 왼쪽 끝이랑 좀비 오른쪽끝에 있는 x좌표 사이에 히어로의 x좌표가 있으면
		if ((z.x < x) && (x < z.x + z.imgwidth) && ((z.y < y) && (y < z.y + z.imgHeight))) {
			return true;
		}
		if ((z.x < x + imgwidth) && (x + imgwidth < z.x + z.imgwidth) && ((z.y < y) && (y < z.y + z.imgHeight))) {
			return true;
		}
		if ((z.x < x) && (x < z.x + z.imgwidth) && ((z.y < y + imgHeight) && (y + imgHeight < z.y + z.imgHeight))) {
			return true;
		}
		if ((z.x < x + imgwidth) && (x + imgwidth < z.x + z.imgwidth)
				&& ((z.y < y + imgHeight) && (y + imgHeight < z.y + z.imgHeight))) {
			return true;
		}

		return false;
	}

	public void paint(Graphics g) {
		if (dir == 1) {
			if (jump == true) {
				g.drawImage(img[2], x, y, null);
			} else {
				g.drawImage(img[count % 2], x, y, null);
			}
		} else if (dir == 2) {
			if (jump == true) {
				g.drawImage(img[5], x, y, null);
			} else {
				g.drawImage(img[count % 2 + 3], x, y, null);
			}
		}
	}
}