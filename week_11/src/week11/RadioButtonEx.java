package week11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class RadioButtonEx extends JFrame {

	JRadioButton radio[] = new JRadioButton[3];
	String names[] = { "사과", "배", "체리" };
	JLabel imgLabel = new JLabel();
	ImageIcon image[] = {new ImageIcon("images/apple.jpg"),
			             new ImageIcon("images/pear.jpg"),
			             new ImageIcon("images/cherry.jpg")};

	public RadioButtonEx() {
		setTitle("라디오 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		JPanel n = new JPanel();
		n.setBackground(Color.gray);

		ButtonGroup g = new ButtonGroup();

		for (int i = 0; i < radio.length; i++) {
			radio[i] = new JRadioButton(names[i]);
			g.add(radio[i]);
			n.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());
		}
		imgLabel.setHorizontalAlignment(SwingConstants.CENTER);
		radio[2].setSelected(true); 
		c.add(n,BorderLayout.NORTH);
		c.add(imgLabel,BorderLayout.CENTER);
		
		setSize(250, 150);
		setVisible(true);
	}

	class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.DESELECTED)
				return;
			if (e.getStateChange() == ItemEvent.SELECTED) {
				if (radio[0].isSelected()) {
					imgLabel.setIcon(image[0]);
				} else if (radio[1].isSelected()) {
					imgLabel.setIcon(image[1]);
				} else {
					imgLabel.setIcon(image[2]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonEx();
	}

}
