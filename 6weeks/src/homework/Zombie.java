package homework;

import java.util.Random;

public class Zombie {
	Random r = new Random();
	String name;
	int pos;
	
	public Zombie(String n, int p) {
		name = n; 
		pos = p;
	}
	
	public void move(){
		pos = pos + r.nextInt(3)-1;
		if (pos > 50) {
			pos = 50;
		}
		System.out.println("현재 좀비의 위치는 "+pos+"입니다.");
	}
}