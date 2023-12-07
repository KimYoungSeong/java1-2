package week13;

import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

public class Hero extends Unit {
	
	int life;
	Scanner s = new Scanner(System.in);
	Random r = new Random();
	Hashtable<String, Integer> itemPool = new Hashtable<String, Integer>(); // 현재 연결된 클라이언트 정보를 유지하고 있는 데이터

	public Hero(String name, int pos, int life) {
		super(name, pos);
		this.life = life;

		// itemPool.put("회복", 100);
		itemPool.put("생명", 3);

	}

	public void move() {
		byte x = 10;
		byte y = 20;
		
		System.out.println("왼쪽(1), 오른쪽(2), 점프(3), 생명(4), 체력회복(5)를 입력하세요.");
		int dir = s.nextInt();
		if (dir == 1)
			left();
		else if (dir == 2)
			right();
		else if (dir == 3)
			jump();
		else if (dir == 4) {
			Integer z = (Integer) itemPool.get("생명");
			if (z.intValue() != 0) {
				life = life + 1;
				System.out.println("현재 생명은 " + life + "입니다.");
				itemPool.put("생명", z.intValue() - 1);
			} else {
				System.out.println("생명 아이템을 모두 사용했습니다.");
			}
		}

		System.out.println(name + "가 이동하여 현재 위치는 " + pos + "입니다.");
	}

	public void jump() {
		int jpos = r.nextInt(3) + 1;
		pos = pos + jpos;
		System.out.println(name + "이 " + jpos + "만큼 점프하였습니다.");
	}
}
