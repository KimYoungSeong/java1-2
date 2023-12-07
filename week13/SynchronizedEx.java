package week13;

public class SynchronizedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedBoard board = new SharedBoard();

		StudentThread th1 = new StudentThread("홍길동", board);
		StudentThread th2 = new StudentThread("허각", board);
		
		th1.start();
		th2.start();
	}

}

class SharedBoard {
	int sum = 0;

	public void add() {
		int n = sum;
		Thread.yield();
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + ": " + sum);
	}
}

class StudentThread extends Thread {
	SharedBoard board;

	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			board.add();
			
		}
		
	}
	
}