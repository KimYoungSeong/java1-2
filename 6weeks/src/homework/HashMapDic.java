package homework;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapDic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,  String> dic = new HashMap<String, String>();
		
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		
		HashMap<Integer, String> stu = new HashMap<Integer, String>();
		
		stu.put(20200831, "�迵��");
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("ã�� ���� �ܾ��?");
			String eng = s.next();
			if(eng.equals("exit")) {
			System.out.println("�����մϴ�.");
			break;
		}
		String kor = dic.get(eng);
		if(kor==null) System.out.println("���� �ܾ� �Դϴ�.");
		else System.out.println(kor);
		
		}

}
}
