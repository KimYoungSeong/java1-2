package homework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		
		try {
			fout = new FileWriter("c:\\temp\\test.txt");
			System.out.println("���Ͽ� ������ ���� �Է��ϼ���");
			while(true) {
				String line = s.nextLine();
				if(line.length() == 0) {
					break;
				}
				fout.write(line,0,line.length());
				fout.write("\r\n",0,2);
			}
			fout.close();
		}catch(IOException e) {
			System.out.println("����");
		}
	}

}
