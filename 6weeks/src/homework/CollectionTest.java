package homework;

import java.util.Vector;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(Integer.valueOf(10));
		v.add(20);// �ڽ� ��ڽ� ������� ���� �Ŷ� ���� �����
		v.add(-100);
		
		int n = v.capacity();
		int c = v.size();
		
		v.add(2, 100);
		
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			int a = v.get(i);
			sum = sum + a;
		}
		
		Integer a = v.get(1);//int aa = v.get�� �ڽ� ��ڽ� ������� ������
		
		v.remove(1);
		int l = v.lastElement();
		v.removeAllElements();
	}

}
