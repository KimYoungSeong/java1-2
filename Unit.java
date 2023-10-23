package p1;

import java.util.Scanner;

public class Unit {
	Scanner s = new Scanner(System.in);
	int hp;
	int damage;
	
	public Unit(int h, int m ,int da){
	 hp = h;
	damage = da;
	}
	
	public void move(){
		String a = "";
		a = s.next();
		
		if(a.equals("w") || a.equals("W")) {
			System.out.println("앞으로 가다.");
		}
		if(a.equals("s") || a.equals("S")) {
			System.out.println("뒤로 가다.");
		}
		if(a.equals("a") || a.equals("A")) {
			System.out.println("왼쪽으로 가다.");
		}
		if(a.equals("d") || a.equals("D")) {
			System.out.println("오른쪽으로 가다.");
		}
	}
}
