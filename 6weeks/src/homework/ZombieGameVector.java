package homework;

import java.util.Scanner;
import java.util.Vector;

public class ZombieGameVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Vector<Zombie> v = new Vector<Zombie>(); 
		
		
		Zombie zom1 = new Zombie("zom1",10);
		Zombie zom2 = new Zombie("zom2",20);
		Zombie zom3 = new Zombie("zom3",30);
		Zombie zom4 = new Zombie("zmo4",40);
		hero me = new hero("주인공", 1, 3);
		
		v.add(zom1);
		v.add(zom2);
		v.add(zom3);
		v.add(zom4);
		while(me.pos <= 50) {
				
				System.out.println("1번(왼쪽), 2번(오른쪽), 3번 점프");
				int input = s.nextInt();
				
				if (input == 1) {
					me.leftMove();
				}
				if (input == 2) {
					me.rightMove();
				}
				if (input == 3) {
					me.jump();
				}
				
				for(int i=0; i<v.size();i++) {
					
					Zombie p = v.get(i);
					p.move();
					if(me.pos == p.pos) {
						me.life = me.life - 1;
						System.out.println("좀비에게 잡혔습니다. 현재 나의 생명은 "+me.life+" 남았습니다. 처음 위치에서 다시 시작합니다.");
						me.pos = 1;	
				}
					
		}
				if (me.life == 0) {
					System.out.println("생명이 0입니다 게임을 종료합니다.");
					break;
				}
				if (me.pos >= 50) {
					System.out.println("미션 클리어 목적지에 도착했습니다.");
					break;
				}
		
		}
		
	}}
