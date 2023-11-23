package week11;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ImageGallery extends JFrame {
	ImageIcon image[] = { new ImageIcon("images/image0.jpg"), new ImageIcon("images/image1.jpg"),
			new ImageIcon("images/image2.jpg"), new ImageIcon("images/image3.jpg") };
	JLabel imgLabel = new JLabel(image[0]);
	int i = 0;
	JButton btn1,btn2;
	public ImageGallery() {
		setTitle("이미지 갤러리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel south = new JPanel();

		ImageIcon left = new ImageIcon("images/left.png");
		ImageIcon right = new ImageIcon("images/right.png");

		btn1 = new JButton(left);
		btn2 = new JButton(right);
		
		btn1.addActionListener(new MyActionListener());
		btn2.addActionListener(new MyActionListener());

		south.add(btn1);
		south.add(btn2);

		imgLabel.setHorizontalAlignment(SwingConstants.CENTER);
		c.add(imgLabel, BorderLayout.CENTER);
		c.add(south, BorderLayout.SOUTH);

		setSize(500, 500);
		setVisible(true);
	}

	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==btn1) {
				i = i-1;
				if(i<0)i=3;
				imgLabel.setIcon(image[i]);
			}
			else if(e.getSource()==btn2) {
				i = i+1;
				if(i>3)i=0;
				imgLabel.setIcon(image[i]);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ImageGallery();
	}

}
