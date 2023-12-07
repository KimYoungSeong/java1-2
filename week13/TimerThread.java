package week13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimerThread extends JFrame{
	
	public TimerThread() {
		this.setTitle("타이머");
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel1 = new JLabel();
		timerLabel1.setFont(new Font("Gothic",Font.BOLD,80));
		JLabel timerLabel2 = new JLabel();
		
		c.add(timerLabel1);
		c.add(timerLabel2);
		
		ThreadTimer timer1 = new ThreadTimer(timerLabel1);
		ThreadTimer timer2 = new ThreadTimer(timerLabel2);
		
		this.setSize(300,200);
		this.setVisible(true);
		
		timer1.start();
		timer2.start();
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TimerThread();
	}

}
class ThreadTimer extends Thread{
	JLabel timerLabel;
	
	public ThreadTimer(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	public void run() {
		int n = 0;
		
		while(true) {
			n++;
			timerLabel.setText(n+"초");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}