package days01;

// 생성자 (Constructor)
// 클래스의 객체가 생성될 때 멤버 필드의 초기화 등의 목적으로 사용되는 메소드
// new 에 각각의 객체가 생성될 때, 서로 다른 메모리를 할당해서 서로 겹치지 않게 하는 기능도 포함됨

//생성자의 특징
//1. 멤버 메소드 (특별 멤버 메소드 : 처음 객체 생성할 때만 호출. 중간 호출 없음)
//2. 클래스의 이름과 동일한 이름을 갖는 메소드
//3. 리턴값이 없는 메소드

class Aclass{
	private int age;
	// 1. 생성자는 별도로 정의하지 않아서 디폴트(매개변수 x) 생성자가 존재함.
	// 2. 컴파일러는 클래스 안에 생성자 정의 내역이 없다면 자동으로 디폴트 생성자를 만듦.
	
	//생성자가 하는 일 : 메모리를 확보하고 확보된 메모리 주소를
	// 						 생성자 메소드의 리턴값으로 반환하는 일
	// >> 생성자 본연의 일 이외에 다른 명령을 같이 실행하고자 한다면
	//		 숨어있는 생성자를 꺼내서 따로 정의함.
	
		Aclass(){
			age = 99;
			//생성자 본연의 일을 하고 멤버 변수에 99로 초기화도 함.
			System.out.println("객체가 생성되었습니다. Aclass의 생성자가 호출되었습니다.");
		}
		// 생성자 또한 별도 기능을 가진 특별 메소드일 뿐
		// >> 생성자가 클래스 내부에 기술된다고 해서 다른 메소드에 영향을 끼치진 않음
		// >> 기존 방식대로 다른 메소드는 자유로운 생성 및 사용이 가능함.
		
}

public class ClassConstructor01 {

	public static void main(String[] args) {

		Aclass a1 = new Aclass();		//Aclass() : 생성자 호출
		
	}

}