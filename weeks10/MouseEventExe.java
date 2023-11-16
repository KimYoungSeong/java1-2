package weeks10;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventExe extends JFrame {
	JLabel la = new JLabel();
	int ix = 10;
	int iy = 10;

	public MouseEventExe() {
		this.setTitle("마우스 이벤트 프로그램");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = this.getContentPane();
		c.setLayout(null);

		ImageIcon image = new ImageIcon("images/paladog1.png");
		la.setIcon(image);

		la.setLocation(ix, iy);
		la.setSize(192, 156);
		c.add(la);
		c.addMouseListener(new MyMouseListener());
		c.addMouseMotionListener(new MyMouseMotionListener());
		c.addKeyListener(new MyKeyListener());
		this.setSize(500, 500);
		this.setVisible(true);

		c.setFocusable(true);
		c.requestFocus();
	}

	class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setLocation(ix +=20, iy);
			
			if (e.getClickCount() == 2) {
				int r = (int) (Math.random() * 256);
				int g = (int) (Math.random() * 256);
				int b = (int) (Math.random() * 256);
				Component c = (Component) e.getSource();
				c.setBackground(new Color(r, g, b));
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			Component c = (Component) e.getSource();
			c.setBackground(Color.cyan);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			Component c = (Component) e.getSource();
			c.setBackground(Color.red);
		}
	}

	class MyMouseMotionListener implements MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub

		}

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
			if (keycode == KeyEvent.VK_LEFT) {
				la.setLocation(la.getX() - 10, la.getY());
			} else if (keycode == KeyEvent.VK_RIGHT) {
				la.setLocation(la.getX() + 10, la.getY());
			}
			else if (keycode == KeyEvent.VK_DOWN) {
				la.setLocation(la.getX(), la.getY() + 10);
			}
			else if (keycode == KeyEvent.VK_UP) {
				la.setLocation(la.getX(), la.getY() - 10 );
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventExe();
	}

}
