package homework;

import java.util.Random;
import java.util.Vector;

public class RandomBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Number> v = new Vector<Number>();
		Random r = new Random();
		
		int i = 0;
		int d = 0;
		
		Number n1 = new Number("카트");
		Number n2 = new Number("마크");
		Number n3 = new Number("카드");
		Number n4 = new Number("지뢰");
		Number n5 = new Number("메이플");
		Number n6 = new Number("로아");
		Number n7 = new Number("크아");
		
		v.add(n1);
		v.add(n2);
		v.add(n3);
		v.add(n4);
		v.add(n5);
		v.add(n6);
		v.add(n7);
		
		for(i=0;i<3;i++){
			d = r.nextInt(v.size());
			
			Number num = v.get(d);
			System.out.println(num.name);
			v.remove(d);
		}
		System.out.println(" ");
	}

}
