package homework;

import java.util.Vector;

public class PointVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Point> v = new Vector<Point>();
		
		Point p2 = new Point(100,200);
		
		v.add(new Point(10,20));
		v.add(p2);//p1 p2 둘다 가능한 방식
		v.add(new Point(-10,-200));
		
		v.remove(1);
		
		for(int i = 0; i<v.size(); i++) {
			Point p1 = v.get(i);
			System.out.println(p1.toString());
		}
	}

}
