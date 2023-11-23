package week11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class RSPgame extends JFrame {
	Random r = new Random();
	ImageIcon image[] = { new ImageIcon("images/gawi.jpg"), 
			new ImageIcon("images/bawi.jpg"),
			new ImageIcon("images/bo.jpg") };
	JLabel imgLabel = new JLabel();
	JLabel myimg = new JLabel();
	JLabel comimg = new JLabel();
	JLabel me = new JLabel("me");
	JLabel com = new JLabel("com");
	JLabel end = new JLabel("");
	JButton btn1,btn2,btn3;
	
	public RSPgame(){
		setTitle("이미지 갤러리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		JPanel north = new JPanel();
		north.setBackground(Color.gray);
		
		JPanel center = new JPanel();
		center.setBackground(Color.yellow);
		
		ImageIcon gawi = new ImageIcon("images/gawi.jpg");
		ImageIcon bawi = new ImageIcon("images/bawi.jpg");
		ImageIcon bo = new ImageIcon("images/bo.jpg");

		btn1 = new JButton(gawi);
		btn2 = new JButton(bawi);
		btn3 = new JButton(bo);
		
		north.add(btn1);
		north.add(btn2);
		north.add(btn3);
		
		center.add(myimg);
		center.add(me);
		center.add(comimg);
		center.add(com);
		center.add(end);
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				myimg.setIcon(image[0]);
				comimg.setIcon(image[r.nextInt(3)]);
			}
			
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				myimg.setIcon(image[1]);
				comimg.setIcon(image[r.nextInt(3)]);
				if(myimg.getIcon()==comimg.getIcon()) {
					end.setText("same!");
				}
			}
			
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				myimg.setIcon(image[2]);
				comimg.setIcon(image[r.nextInt(3)]);
			}
			
		});
		
		c.add(north,BorderLayout.NORTH);
		c.add(center,BorderLayout.CENTER);
		
		setSize(500, 500);
		setVisible(true);
	}
	
	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==btn1) {
				
			}
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RSPgame();
	}

}
