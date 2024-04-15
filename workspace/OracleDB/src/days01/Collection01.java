package days01;

import java.util.ArrayList;
import java.util.Vector;

// 컬렉션 클래스
// 자료 구조를 구현하고 있는 클래스
// 자료 구조 : 각 데이터들을 효율적으로 저장하고 운용하기 위한 방법론

// 1. 배열
// 2. 리스트
// 3. Set
// 4. Map

// 리스트 클래스를 상속받은 ArrayList 또는 Vector >> 사용 빈도수 가장 높음
// Map 클래스를 상속받은 HashTable 또는 HashMap >> 역시 사용 빈도 높고 중요함.


// Vector, ArrayList 클래스
// - 두 클래스는 동일한 기능 제공함.
// - 스레드 동기화의  지원 여부 크기의 제약 없이 데이터를 저장함. (동적으로 크기 확장)
// - 배열과 같이 인덱스를 기반으로 데이터에 접근함.
// - 데이터의 중복 허용함.
// - 데이터의 입력 순서를 유지함.

public class Collection01 {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		ArrayList a = new ArrayList();
		// 동적 배열의 객체 생성 초기값으로 크기를 지정할 수 있지만
		// 통상적으로 크기 지정 없이 사용함.
		
		//데이터 추가
		v.add(10);		v.add(20);		v.add(30);
		a.add(10);		a.add(20);		a.add(30);
		// Vector & ArrayList 저장은 int 형이 아닌 Integer 형 데이터(객체)가 저장됨
		
		// ArrayList 안에 add 메소드가 존재 & 그 메소드를 통해 데이터를 저장함
		//a.add("abc");
		//v.add("abc");		>> 정수 뿐만 아니라 String 형태도 넣을 수 있다.
		// add 메소드의 매개변수는 Object 인 것을 예상할 수 있음.
		// >> public void add(Object item){ } 형태
		
		int b = (Integer)a.get(0);		//>> 부모클래스에 한하여 강제형변환 해줌
		
		for(int i = 0; i < v.size(); ++i) {
			b = (Integer)v.get(i);
			System.out.printf("v[%d] = %d\t\t", i, b);
		}	//이렇게 되면 위에 넣으려 했던 String 형태는 걸려서 오류남.
	}

}









