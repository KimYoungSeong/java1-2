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
			System.out.println("�����߽��ϴ�. ���� ��ġ��" + pos + "�Դϴ�.");
	}
	public void leftMove() {
			pos = pos - 1;
			System.out.println("�������� ���������ϴ�. ���� ��ġ��" + pos + "�Դϴ�.");
	}
	public void rightMove() {
			pos = pos + 1;
			System.out.println("���������� ���������ϴ�. ���� ��ġ��" + pos + "�Դϴ�.");

	}
	
	}

