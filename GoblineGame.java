package homework;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
public class GoblineGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<goblin> go = new Vector<goblin>();
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		
		goblin go1 = new goblin("go1", 10, 10, 10);
		goblin go2 = new goblin("go2", 10, 10, 10);
		goblin go3 = new goblin("go3", 10, 10, 10);
		goblin go4 = new goblin("go4", 10, 10, 10);
		
		go.add(go1);
		go.add(go2);
		go.add(go3);
		go.add(go4);
		
		int a;
		int b;
		int c = 0;
		
		System.out.println("가위(1) 바위(2) 보(3)를 입력하세요");
		a = s.nextInt();
		b = r.nextInt(3)+1;
		if (a == 1 && b == 1) {
			System.out.println("비겼습니다.");
		} else if (a == 1 && b == 2) {
			System.out.println("졌습니다.");
		} else if (a == 1 && b == 3) {
			System.out.println("이겼습니다.");
		} else if (a == 2 && b == 1) {
			c = r.nextInt(5)+1;
			System.out.println("이겼습니다.");
			c = r.nextInt(5)+1;
		} else if (a == 2 && b == 2) {
			System.out.println("비겼습니다.");
		} else if (a == 2 && b == 3) {
			System.out.println("졌습니다.");
		} else if (a == 3 && b == 1) {
			System.out.println("졌습니다.");
		} else if (a == 3 && b == 2) {
			System.out.println("이겼습니다.");
			c = r.nextInt(5)+1;
		} else if (a == 3 && b == 3) {
			System.out.println("비겼습니다.");
		}
		switch(c) {
		case 1:
			System.out.println(" hp+20");
			break;
		case 2:
			System.out.println(" coin+20");
			break;
		case 3:
			System.out.println(" damage+20");
			break;
		case 4:
			System.out.println(" defence+20");
			break;
		case 5:
			System.out.println(" all+20");
			break;
		}
	}

}
