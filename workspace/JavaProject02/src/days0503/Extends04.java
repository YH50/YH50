package days0503;

// Method Overriding(오버라이딩)
// 1. "상속" : 각각의 클래스에서 생성되는 공통 변수, 메소드 등을 하나의 클래스로 만들어 다른 클래스에게 물려주는 것.
// 2. 부모클래스에서 정의되는 변수 or 메소드들은 모든 자식클래스에서도 정상적으로 작동해야 하므로
// 		부모, 자식에게 공통으로 적용할 수 있는 사항들이 정의되는 편임.
// 3. But 가끔 상속받은 메소드들이 자식 클래스의 생성 목적이나 용도에 따라 "어울리지 않은" 메소드일 수도 있음
// 4. 이를 위해서 자식클래스에 물려받은 부모클래스의 메소드를 재정의하여 사용함
//		--> 이를 메소드 오버라이딩이라고 함 (Method Overriding)

class Animal{
	String name;
	int age;
	public void crying() {
		System.out.println("동물이 소리를 냅니다");
	}
}
class Dog extends Animal{
	// 자식 클래스는 부모클래스에서 물려받은 메소드를 자신의 용도에 맞게 재정의(overriding) 가능
	// 메소드 오버라이딩은 자식클래스에서 부모클래스의 메소드의 내용을 재정의하는 문법임
	// 메소드 오버라이딩으로 메소드를 재정의해서 자식클래스의 객체에서 사용 시 물려받은 메소드는 무시되고
	// 새로 재정의한 메소드가 실행됨.
	public void crying() {		// 반드시 메소드의 이름과 리턴 자료형 등이 일치해야 함
		// 부모가 재정의되기 전 crying() 메소드를 일부러 호출하는 것도 가능함
		// super.crying();
		System.out.println("멍.");
	}
}
class Cat extends Animal{
	public void crying() {
		System.out.println("애옹.");
	}
}
public class Extends04 {

	public static void main(String[] args) {

		Cat c = new Cat();
		Dog d = new Dog();
		c.crying();
		d.crying();
	}

}
