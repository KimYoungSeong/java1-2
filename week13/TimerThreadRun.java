package week13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TimerThreadRun extends JFrame {

	public TimerThreadRun() {
		this.setTitle("타이머");
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());

		JLabel timerLabel1 = new JLabel();
		timerLabel1.setFont(new Font("Gothic", Font.BOLD, 80));
		JLabel timerLabel2 = new JLabel();

		c.add(timerLabel1);
		c.add(timerLabel2);

		JButton btn = new JButton("kill Timer");
		c.add(btn);

		ThreadTimerRun t1 = new ThreadTimerRun(timerLabel1);
		//Thread timer1 = new Thread(new ThreadTimerRun(timerLabel1)); 다른 방식으로 멈추는 법
		Thread timer1 = new Thread(t1);
		Thread timer2 = new Thread(new ThreadTimerRun(timerLabel2));

		this.setSize(300, 200);
		this.setVisible(true);

		timer1.start();
		timer2.start();

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// timer1.interrupt(); 다른방식으로 멈추는법
				t1.isAlive = false;
				btn.setEnabled(false);
			}
		});

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TimerThreadRun();
	}

}

class ThreadTimerRun implements Runnable {
	JLabel timerLabel;
	boolean isAlive = true;

	public ThreadTimerRun(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	public void run() {
		int n = 0;
		while (isAlive) {
			n++;
			timerLabel.setText(n + "초");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				return;
			}
		}
	}
}