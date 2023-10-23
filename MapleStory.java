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
		String sub[] = { "리부트", "스카니아", "루나", "제니스", "베라" };

		cho = s.nextInt();

		if (cho == 0) {
			System.out.println(sub[4] + " " + sub[0] + " " + sub[1]);
		} else if (cho == 4) {
			System.out.println(sub[3] + " " + sub[4] + " " + sub[0]);
		} else {
			System.out.println(sub[cho - 1] + " " + sub[cho] + " " + sub[cho + 1]);
		}
		// 처음 서버 나열 코드
		for (;;) {
			System.out.println("이전(1)/다음(2)으로 넘기 시겠습니까? 종료(3)");
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
			// 이전코드
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
			// 다음코드
			if (i == 3) {
				break;
			}
		}
		if (cho == 0) {
			System.out.println(sub[4] + " " + sub[0] + " " + sub[1] + " 이중에 고르시오 (1/2/3)");
		} else if (cho == 4) {
			System.out.println(sub[3] + " " + sub[4] + " " + sub[0] + " 이중에 고르시오 (1/2/3)");
		} else {
			System.out.println(sub[cho - 1] + " " + sub[cho] + " " + sub[cho + 1] + " 이중에 고르시오 (1/2/3)");
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

		System.out.println(chname + " 서버에 들어갑니다.");
		System.out.println("1~5번 중 들어갈 채널을 고르세요.");
		i = s.nextInt();

		if (i > 5) {
			System.out.println("다시 입력해주세요");
		} else {
			System.out.println(chname + " 서버 " + i + "채널에 입장합니다.");
		}

		

		String ans = "";
		int count = 0;
		int pas = 0;
		String pas2[] = { "메이플", "스토리", "안녕하세요", "잘있어요", "다시 만나요" };
		int roll = 0;
		String ans2 = "";
		for (;;) {
			System.out.println("캐릭터를 생성하시겠습니까? (y/n)");
			ans = s.next();
			if (ans.equals("y")) {
				if (count > 3) {
					System.out.println("더이상 캐릭터를 만들 수 없습니다.");
					break;
				} else {
					System.out.println("캐릭터를 생성합니다. 2차 비밀 번호를 입력해 주세요");
					pas = s.nextInt();
					count++;
					if (pas == 1234) {
						roll = rand.nextInt(pas2.length);
						System.out.println("보안 문자를 입력해 주세요." + "보안문자는 :" + pas2[roll] + " 입니다.");
						ans2 = s.next();
						if (pas2[roll].equals(ans2)) {
							System.out.println("캐릭터를 고르세요");
						} else {
							System.out.println("보안 문자 입력에 실패하셧습니다. 처음으로 돌아갑니다.");
							continue;
						}
						
					}
					else {
						System.out.println("2차 비밀번호 입력에 실패 했습니다. 다시 처음으로 돌아갑니다");
					}
				}

			} else if (ans.equals("n")) {
				System.out.println("캐릭터를 만들지 않습니다.");
				break;
			} else
				System.out.println("오류입니다 다시 해주십시오");
			continue;
		}
		/*
		 * if (i == 1) { System.out.println(sub[cho - 1] + " 서버에 들어갑니다.");
		 * System.out.println("1~5번 중 들어갈 채널을 고르세요."); i = s.nextInt();
		 * 
		 * if (i == 1) { System.out.println(sub[cho - 1] + " 1채널에 들어갑니다."); } else if (i
		 * == 2) { System.out.println(sub[cho - 1] + " 2채널에 들어갑니다."); } else if (i == 3)
		 * { System.out.println(sub[cho - 1] + " 3채널에 들어갑니다."); } else if (i == 4) {
		 * System.out.println(sub[cho - 1] + " 4채널에 들어갑니다."); } else if (i == 5) {
		 * System.out.println(sub[cho - 1] + " 5채널에 들어갑니다."); } } else if (i == 2) {
		 * System.out.println(sub[cho] + " 서버에 들어갑니다.");
		 * System.out.println("1~5번 중 들어갈 채널을 고르세요."); i = s.nextInt();
		 * 
		 * if (i == 1) { System.out.println(sub[cho] + " 1채널에 들어갑니다."); } else if (i ==
		 * 2) { System.out.println(sub[cho] + " 2채널에 들어갑니다."); } else if (i == 3) {
		 * System.out.println(sub[cho] + " 3채널에 들어갑니다."); } else if (i == 4) {
		 * System.out.println(sub[cho] + " 4채널에 들어갑니다."); } else if (i == 5) {
		 * System.out.println(sub[cho] + " 5채널에 들어갑니다."); } } else if (i == 3) {
		 * System.out.println(sub[cho + 1] + " 서버에 들어갑니다.");
		 * System.out.println("1~5번 중 들어갈 채널을 고르세요."); i = s.nextInt();
		 * 
		 * if (i == 1) { System.out.println(sub[cho + 1] + " 1채널에 들어갑니다."); } else if (i
		 * == 2) { System.out.println(sub[cho + 1] + " 2채널에 들어갑니다."); } else if (i == 3)
		 * { System.out.println(sub[cho + 1] + " 3채널에 들어갑니다."); } else if (i == 4) {
		 * System.out.println(sub[cho + 1] + " 4채널에 들어갑니다."); } else if (i == 5) {
		 * System.out.println(sub[cho + 1] + " 5채널에 들어갑니다."); } }실패작
		 */

	}

}