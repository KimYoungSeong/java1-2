package week13;

public class ZombieGame {
	static Hero hero;
	
	public static void main(String args[]) {

		boolean isGame = true;
		
		hero = new Hero("조강홍", 1, 3);

		Zombie z1 = new Zombie("좀비1", 7, hero);
		Thread zb1 = new Thread(z1);
		zb1.start();
		
		Zombie z2 = new Zombie("좀비2", 15, hero);
		Thread zb2 = new Thread(z2);
		zb2.start();
		
	
		System.out.println("좀비 게임을 시작합니다.!!!");
		while(isGame) {
			hero.move();	//주인공 이동/점프		    	  
		    	  
			if((hero.getPos() == z1.getPos())||(hero.getPos() == z2.getPos()) ) {
						hero.life--;
						if(hero.life == 0) {
							System.out.println("생명이 0 입니다. 게임을 종료합니다.");
							isGame = false;
							z1.isGame = false;
							z2.isGame = false;
							break;
						}
						else {
							System.out.println(z1.name+ "에게 잡혔습니다. 생명이 " + hero.life + "남았습니다.");
							System.out.println("게임을 처음 위치에서 다시 시작합니다.");
							hero.setPos(0);
						}
			}
			if(hero.getPos()>=20) {
						System.out.println("미션클리어!!! 목적지에 도착했습니다.");
						isGame = false;
						break;
			}
		}
	}
}
