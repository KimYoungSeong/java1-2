package p1;

import java.util.Scanner;

public class MapleStory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Unit u = new Unit(100,200,1);
		Scanner s = new Scanner(System.in);
		
		int cho = 0;
		int i = 0;
		String sub[] = new String[5];
		
		sub[0]="리부트";
		sub[1]="스카니아";
		sub[2]="루나";
		sub[3]="제니스";
		sub[4]="베라";
		cho = s.nextInt();
		
		
		
		if(cho==0) {
		System.out.println(sub[4]+" "+sub[0]+" "+sub[1]);
		}
		else if(cho==4) {
		System.out.println(sub[3]+" "+sub[4]+" "+sub[0]);
		}
		else {
		System.out.println(sub[cho-1]+" "+sub[cho]+" "+sub[cho+1]);
		}
		for(;;) {
			System.out.println("다음으로 넘기 시겠습니까?");
			i = s.nextInt();
		if(i==1) {
			cho = cho + 1;
			if(cho>4) cho=0;
			if(cho==0) {
				System.out.println(sub[4]+" "+sub[0]+" "+sub[1]);
				}
				else if(cho==4) {
				System.out.println(sub[3]+" "+sub[4]+" "+sub[0]);
				}
				else {
				System.out.println(sub[cho-1]+" "+sub[cho]+" "+sub[cho+1]);
				}
		}
		if(i==2) {
			
			break;
		}
		}
		for(;;) {
		u.move();
		}
		
		}

}
