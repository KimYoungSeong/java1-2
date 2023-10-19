package homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadHangulSuccess {
	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		char buf[] = new char[1024];
		int n = 0;
		try {
			fin = new FileInputStream("c:\\Temp\\hangul.txt");
			in = new InputStreamReader(fin, "UTF-8"); 
			int c;

         System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while ((c = in.read()) != -1) {
				//System.out.print((char)c);
				buf[n] = (char)c;
				n++;
			}
			String Line = String.valueOf(buf);
			String a[] = Line.split("");
			int pos = Integer.parseInt(a[0]);
			int life = Integer.parseInt(a[1]);
			int zom1 = Integer.parseInt(a[2]);
			int zom2 = Integer.parseInt(a[3]);
			
			System.out.println(Line);
			
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
