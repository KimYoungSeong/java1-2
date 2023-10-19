package homework;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,  String> dic = new HashMap<String, String>();
		
		dic.put("baby", "아기");
		dic.put("love", "사랑");
		
		HashMap<Integer, String> stu = new HashMap<Integer, String>();
		
		stu.put(20200831, "김영성");
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("찾고 싶은 단어는?");
			String eng = s.next();
			if(eng.equals("exit")) {
			System.out.println("종료합니다.");
			break;
		}
		String kor = dic.get(eng);
		if(kor==null) System.out.println("업는 단어 입니다.");
		else System.out.println(kor);
		
		}

}
}
