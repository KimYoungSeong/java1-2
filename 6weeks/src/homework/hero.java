package homework;

import java.util.Random;

public class hero {
	Random r = new Random();
	String name;
	int pos;
	int life;

	public hero(String n, int p, int l) {
		name = n; 
		pos = p;
		life = l;
	}
	public void jump() {
			pos = pos + r.nextInt(3)+1;
			System.out.println("점프했습니다. 현재 위치는" + pos + "입니다.");
	}
	public void leftMove() {
			pos = pos - 1;
			System.out.println("왼쪽으로 움직엿습니다. 현재 위치는" + pos + "입니다.");
	}
	public void rightMove() {
			pos = pos + 1;
			System.out.println("오른쪽으로 움직엿습니다. 현재 위치는" + pos + "입니다.");

	}
	
	}

