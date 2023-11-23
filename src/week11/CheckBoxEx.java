package week11;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CheckBoxEx extends JFrame {
	JCheckBox fruits[] = new JCheckBox[3];
	String names[] = { "사과", "배", "체리" };
	JLabel sumLabel = new JLabel();
	int sum = 0;
	public CheckBoxEx() {
		setTitle("체크박스 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));

		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			c.add(fruits[i]);
			fruits[i].addItemListener(new MyItemListener());
		}
		c.add(sumLabel);
		
		setSize(250, 200);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{	
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				if(e.getItem()==fruits[0]) sum = sum+100;
				else if(e.getItem()==fruits[1]) sum = sum+500;
				else if(e.getItem()==fruits[2]) sum = sum+20000;
				}
			else {
				if(e.getItem()==fruits[0]) sum = sum-100;
				else if(e.getItem()==fruits[1]) sum = sum-500;
				else if(e.getItem()==fruits[2]) sum = sum-20000;
			}
			sumLabel.setText("현재 "+sum+"원 입니다.");
		}

	}

	public static void main(String[] args) {
		new CheckBoxEx();
	}
}