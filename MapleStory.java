package p1;

import java.util.Random;
import java.util.Scanner;

public class MapleStory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ruminus r = new Ruminus("ruminus", 20, 20, 20, 20);
		Scanner s = new Scanner(System.in);
		Random rand = new Random();

		int cho = 0;
		int i = 0;
		String chname = "";
		String sub[] = { "����Ʈ", "��ī�Ͼ�", "�糪", "���Ͻ�", "����" };

		cho = s.nextInt();

		if (cho == 0) {
			System.out.println(sub[4] + " " + sub[0] + " " + sub[1]);
		} else if (cho == 4) {
			System.out.println(sub[3] + " " + sub[4] + " " + sub[0]);
		} else {
			System.out.println(sub[cho - 1] + " " + sub[cho] + " " + sub[cho + 1]);
		}
		// ó�� ���� ���� �ڵ�
		for (;;) {
			System.out.println("����(1)/����(2)���� �ѱ� �ðڽ��ϱ�? ����(3)");
			i = s.nextInt();
			if (i == 1) {

				if (cho == 0) {
					cho = 4;
				} else {
					cho = cho - 1;
				}

				if (cho == 0) {
					System.out.println(sub[4] + " " + sub[0] + " " + sub[1]);
				} else if (cho == 4) {
					System.out.println(sub[3] + " " + sub[4] + " " + sub[0]);
				} else {
					System.out.println(sub[cho - 1] + " " + sub[cho] + " " + sub[cho + 1]);
				}
			}
			// �����ڵ�
			if (i == 2) {
				if (cho == 4) {
					cho = 0;
				} else {
					cho = cho + 1;
				}

				if (cho == 0) {
					System.out.println(sub[4] + " " + sub[0] + " " + sub[1]);
				} else if (cho == 4) {
					System.out.println(sub[3] + " " + sub[4] + " " + sub[0]);
				} else {
					System.out.println(sub[cho - 1] + " " + sub[cho] + " " + sub[cho + 1]);
				}
			}
			// �����ڵ�
			if (i == 3) {
				break;
			}
		}
		if (cho == 0) {
			System.out.println(sub[4] + " " + sub[0] + " " + sub[1] + " ���߿� ���ÿ� (1/2/3)");
		} else if (cho == 4) {
			System.out.println(sub[3] + " " + sub[4] + " " + sub[0] + " ���߿� ���ÿ� (1/2/3)");
		} else {
			System.out.println(sub[cho - 1] + " " + sub[cho] + " " + sub[cho + 1] + " ���߿� ���ÿ� (1/2/3)");
		}
		i = s.nextInt();

		if (i == 1) {
			if (cho == 0)
				chname = sub[4];
			else
				chname = sub[cho - 1];
		} else if (i == 2) {
			chname = sub[cho];
		} else if (i == 3) {
			if (cho == 4)
				chname = sub[0];
			else
				chname = sub[cho + 1];
		}

		System.out.println(chname + " ������ ���ϴ�.");
		System.out.println("1~5�� �� �� ä���� ������.");
		i = s.nextInt();

		if (i > 5) {
			System.out.println("�ٽ� �Է����ּ���");
		} else {
			System.out.println(chname + " ���� " + i + "ä�ο� �����մϴ�.");
		}

		

		String ans = "";
		int count = 0;
		int pas = 0;
		String pas2[] = { "������", "���丮", "�ȳ��ϼ���", "���־��", "�ٽ� ������" };
		int roll = 0;
		String ans2 = "";
		for (;;) {
			System.out.println("ĳ���͸� �����Ͻðڽ��ϱ�? (y/n)");
			ans = s.next();
			if (ans.equals("y")) {
				if (count > 3) {
					System.out.println("���̻� ĳ���͸� ���� �� �����ϴ�.");
					break;
				} else {
					System.out.println("ĳ���͸� �����մϴ�. 2�� ��� ��ȣ�� �Է��� �ּ���");
					pas = s.nextInt();
					count++;
					if (pas == 1234) {
						roll = rand.nextInt(pas2.length);
						System.out.println("���� ���ڸ� �Է��� �ּ���." + "���ȹ��ڴ� :" + pas2[roll] + " �Դϴ�.");
						ans2 = s.next();
						if (pas2[roll].equals(ans2)) {
							System.out.println("ĳ���͸� ������");
						} else {
							System.out.println("���� ���� �Է¿� �����ϼ˽��ϴ�. ó������ ���ư��ϴ�.");
							continue;
						}
						
					}
					else {
						System.out.println("2�� ��й�ȣ �Է¿� ���� �߽��ϴ�. �ٽ� ó������ ���ư��ϴ�");
					}
				}

			} else if (ans.equals("n")) {
				System.out.println("ĳ���͸� ������ �ʽ��ϴ�.");
				break;
			} else
				System.out.println("�����Դϴ� �ٽ� ���ֽʽÿ�");
			continue;
		}
		/*
		 * if (i == 1) { System.out.println(sub[cho - 1] + " ������ ���ϴ�.");
		 * System.out.println("1~5�� �� �� ä���� ������."); i = s.nextInt();
		 * 
		 * if (i == 1) { System.out.println(sub[cho - 1] + " 1ä�ο� ���ϴ�."); } else if (i
		 * == 2) { System.out.println(sub[cho - 1] + " 2ä�ο� ���ϴ�."); } else if (i == 3)
		 * { System.out.println(sub[cho - 1] + " 3ä�ο� ���ϴ�."); } else if (i == 4) {
		 * System.out.println(sub[cho - 1] + " 4ä�ο� ���ϴ�."); } else if (i == 5) {
		 * System.out.println(sub[cho - 1] + " 5ä�ο� ���ϴ�."); } } else if (i == 2) {
		 * System.out.println(sub[cho] + " ������ ���ϴ�.");
		 * System.out.println("1~5�� �� �� ä���� ������."); i = s.nextInt();
		 * 
		 * if (i == 1) { System.out.println(sub[cho] + " 1ä�ο� ���ϴ�."); } else if (i ==
		 * 2) { System.out.println(sub[cho] + " 2ä�ο� ���ϴ�."); } else if (i == 3) {
		 * System.out.println(sub[cho] + " 3ä�ο� ���ϴ�."); } else if (i == 4) {
		 * System.out.println(sub[cho] + " 4ä�ο� ���ϴ�."); } else if (i == 5) {
		 * System.out.println(sub[cho] + " 5ä�ο� ���ϴ�."); } } else if (i == 3) {
		 * System.out.println(sub[cho + 1] + " ������ ���ϴ�.");
		 * System.out.println("1~5�� �� �� ä���� ������."); i = s.nextInt();
		 * 
		 * if (i == 1) { System.out.println(sub[cho + 1] + " 1ä�ο� ���ϴ�."); } else if (i
		 * == 2) { System.out.println(sub[cho + 1] + " 2ä�ο� ���ϴ�."); } else if (i == 3)
		 * { System.out.println(sub[cho + 1] + " 3ä�ο� ���ϴ�."); } else if (i == 4) {
		 * System.out.println(sub[cho + 1] + " 4ä�ο� ���ϴ�."); } else if (i == 5) {
		 * System.out.println(sub[cho + 1] + " 5ä�ο� ���ϴ�."); } }������
		 */

	}

}