package p1;

import java.util.Random;

public class RandomBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = new int[10];
		Random r = new Random();
				
		int i = 0;
		int j = 0;
		
		for(i = 0; i < 4; i++) {
			a[i] = r.nextInt(7)+1;
			for(j = 0; j < i; j++) {
				if(a[i]==a[j]) {
					i--;
				}
				
		}
	}
		
		for(i=1;i<=3;i++) {
			
			switch(r.nextInt(7)+1) {
			
			case 1:{
				System.out.println("크아");
				break;
			}
			case 2:{
				System.out.println("카트");
				break;
			}
			case 3:{
				System.out.println("메이플");
				break;
			}
			case 4:{
				System.out.println("lol");
				break;
			}
			case 5:{
				System.out.println("마크");
				break;
			}
			case 6:{
				System.out.println("카드");
				break;
			}
			case 7:{
				System.out.println("지뢰");
				break;
			}
			
			}
		}
	
	}

}
