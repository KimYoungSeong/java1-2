package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class ZombieGameSav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Vector<Zombie> v = new Vector<Zombie>(); 
		FileOutputStream fout = null;
		
		Zombie zom1 = new Zombie("zom1",10);
		Zombie zom2 = new Zombie("zom2",20);
		Zombie zom3 = new Zombie("zom3",30);
		Zombie zom4 = new Zombie("zmo4",40);
		hero me = new hero("���ΰ�", 1, 3);
		
		v.add(zom1);
		v.add(zom2);
		v.add(zom3);
		v.add(zom4);
			
		File f = new File("c:\\temp\\zombie.sav");
		byte b[] = new byte[7];
		byte game=0;
		
		
		if(f.exists()==true) {
			try {
				FileInputStream fin = new FileInputStream("c:\\Temp\\zombie.sav");
				int n=0, c;
				while((c = fin.read())!= -1) {
					b[n] = (byte)c; 
					n++;
				}		
			} catch(IOException e) {
				System.out.println( "c:\\Temp\\zombie.sav.���� ���� ���߽��ϴ�. ��θ��� üũ�غ�����");
			}
			
		}
		game = b[6];
		
		if(game==1) {
			me.pos = (int)b[0];
			me.life = (int)b[1];
			zom1.pos = (int)b[2];
			zom2.pos = (int)b[3];
			zom3.pos = (int)b[4];
			zom4.pos = (int)b[5];
			System.out.println("���� �ʱ���ġ�� "+me.pos+" ������ "+me.life+" ����1�� "+zom1.pos+" ����2�� "+zom2.pos+" ����3�� "+zom3.pos+" ����4�� "+zom4.pos);
	
		}
		
		
		while(me.pos <= 50) {
				
				System.out.println("1��(����), 2��(������), 3�� (����), 4�� (����)");
				int input = s.nextInt();
				
				if (input == 1) {
					me.leftMove();
				}
				else if (input == 2) {
					me.rightMove();
				}
				else if (input == 3) {
					me.jump();
				}
				else if (input == 4) {
					 game += 1;
					byte b1[] = {(byte)me.pos, (byte)me.life, (byte)zom1.pos,(byte)zom2.pos, (byte)zom3.pos, (byte)zom4.pos, game};

					try {
						fout = new FileOutputStream("c:\\\\Temp\\\\zombie.sav");
						for(int i=0; i<b1.length; i++) {
							fout.write(b1[i]);
						}
						fout.close();
					}catch(IOException e){
						System.out.println("���Ͽ� ������ �� �����ϴ�.");
						e.getStackTrace();
					}
					
				break;
				}
				for(int i=0; i<v.size();i++) {
					
					Zombie p = v.get(i);
					p.move();
					if(me.pos == p.pos) {
						me.life = me.life - 1;
						System.out.println("���񿡰� �������ϴ�. ���� ���� ������ "+me.life+" ���ҽ��ϴ�. ó�� ��ġ���� �ٽ� �����մϴ�.");
						me.pos = 1;	
				}
					
		}
				if (me.life == 0) {
					System.out.println("������ 0�Դϴ� ������ �����մϴ�.");
					break;
				}
				if (me.pos >= 50) {
					System.out.println("�̼� Ŭ���� �������� �����߽��ϴ�.");
					break;
				}
		
		}
		
	}}
