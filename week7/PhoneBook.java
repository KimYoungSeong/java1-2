package week7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Person> book = new Vector<Person>();
		Scanner s = new Scanner(System.in);

		int i = 0;

		File f = new File("c:\\temp\\phoneBook.txt");
		BufferedReader br = null;
		BufferedWriter bw = null;

			try {
				if (f.exists() == true) {
					br = new BufferedReader(new FileReader(f));
					while (true) {
						String line = br.readLine();
						if (line != null) {
							String t[] = line.split(" ");
							Person p = new Person(t[0], t[1], t[2]);
							book.add(p);
						} else
							break;
					}
					br.close();
				}
			} catch (IOException e) {
				System.out.println("예외 발생");
			}

		while (true) {
			System.out.println("입력(1),검색(2),삭제(3),리스트(4),저장(5),종료(6),");
			int input = s.nextInt();
			if (input == 1) {
				System.out.println("이름 전화번호 이메일을 입력하세요.");
				String n = s.next();
				String p = s.next();
				String e = s.next();
				book.add(new Person(n, p, e));
				System.out.println("입력이 완료 되었습니다.");
			} else if (input == 2) {
				System.out.println("검색할 사람의 이름을 입력하세요.");
				String name = s.next();
				for (i = 0; i <= book.size(); i++) {
					Person p = book.get(i);
					if (name.equals(p.name)) {
						System.out.println(p.name + " " + p.phone + " " + p.email);
						break;
					}
				}
			} else if (input == 3) {
				System.out.println("삭제할 사람의 이름을 입력하세요.");
				String name = s.next();
				for (i = 0; i <= book.size(); i++) {
					Person p = book.get(i);
					if (name.equals(p.name)) {
						book.remove(i);
						System.out.println("요청한 사람을 삭제했습니다.");
						break;
					}
				}
			} else if (input == 4) {
				for (i = 0; i < book.size(); i++) {
					Person p = book.get(i);
					System.out.println(p.name + " " + p.phone + " " + p.email);
				}
			} else if (input == 5) {
				try {
					bw = new BufferedWriter(new FileWriter(f));
					for (i = 0; i < book.size(); i++) {
						Person p = book.get(i);
						bw.write(p.name + " " + p.phone + " " + p.email + "\r\n");
					}
					bw.close();
				} catch (IOException e) {
					System.out.println("예외 발생");
				}
				System.out.println("저장이 되었습니다.");
			} else if (input == 6) {
				System.out.println("전화번호부를 종료합니다.");
				break;
			}
		}
	}

}
