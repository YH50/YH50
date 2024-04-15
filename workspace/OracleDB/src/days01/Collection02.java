package days01;

import java.util.ArrayList;

public class Collection02 {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add(10);				//Integer
		a.add(1.1);				//Double
		a.add("Hello");			//String
		
		Integer i0 = (Integer)a.get(0);
		Double i2 = (Double)a.get(1);
		String i3 = (String)a.get(2);
		// 따로 지정을 해줘야함
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		// 아예 정수만 담을 수 있는 ArrayList 만들어서 자료 입력
		list.add(100);
		//list.add("string");	>> error
		list.add(200);
		list.add(300);
		
		for(int i = 0; i < a.size(); ++i) {
			int b = list.get(i);	
//Generic 으로 생성된 ArrayList 자료 추출 시 강제 캐스팅이 필요 없음
			System.out.printf("v[%d] = %d\t\t", i, b);		
		}
	}
}
