package homework;

import java.util.HashMap;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Student> map = new HashMap<String, Student>();
		Scanner s = new Scanner(System.in);
		
		map.put("김영성", new Student(1, "010-4285-9798"));
		
		while(true) {
			System.out.println("검색할 이름은?");
			String name = s.next();
			
			Student s1 = map.get(name);
			if(s1==null) {
				break;
			}
			else {
				System.out.println(s1.id+s1.tel);
			}
		}
	}

}
