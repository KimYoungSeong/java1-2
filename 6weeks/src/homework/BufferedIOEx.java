package homework;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedIOEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null;
		int c;
		
		try {
			fin = new FileReader("c:\\temp\\test2.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out,5);
			while((c=fin.read())!= -1) {
				out.write(c);
			}
			
			new Scanner(System.in).nextLine();
			out.flush();
			fin.close();
			out.close();
			
			}catch(IOException e) {
				e.printStackTrace();
			}
	}

}
