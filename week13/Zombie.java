package week13;

import java.util.*;

public class Zombie extends Unit implements Runnable {
	Random r = new Random();
	boolean isGame = true;
	Hero hero;
	
	public Zombie(String name, int pos, Hero h) {
		super(name, pos);
		this.hero = h;
	}
	public void move() {
		int dir = r.nextInt(3);
		if(dir==0) {
			pos = pos - 1;
			if(pos < 0) pos = 0;
		}
		else if(dir==1) {
			pos = pos + 1;
			if(pos > 20) pos = 20;
		}
		else pos = pos+0;	//제자리에 있
		System.out.println(name+"가 현재 위치는 " + pos + "입니다.");
	}
	
	public void run() {
		while(isGame) {
			move();
			//충돌 체크
			if(pos == hero.getPos()) {
				hero.life--;
				if(hero.life == 0) {
					System.out.println("생명이 0 입니다. 게임을 종료합니다.");
					isGame = false;
					break;
				}
				else {
					System.out.println(name+ "에게 잡혔습니다. 생명이 " + hero.life + "남았습니다.");
					System.out.println("게임을 처음 위치에서 다시 시작합니다.");
					hero.setPos(0);
				}
			}
			try {
				
				Thread.sleep(r.nextInt(1000)+3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
