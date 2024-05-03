package days0503;

//클래스들 간의 상속 (Extends)
// 여러 개의 클래스들이 중복되는 멤버변수 및 멤버 메소드들을 갖고 있는 경우
// 부모.자식 관계를 생성하여 "코드의 중복 방지"를 1차 목표로 사용함
// 2차 목표는 "코드의 재활용"이며, 코드의 중복이 발생하고 있는 클래스에서
// 중복되는 멤버들을 별도의 클래스로 생성하고 상속을 구현함.

// 코드의 중복이 발생하고 있는 구 클래스
class student{
	String name;
	int age;
	String stdNo;	// 학번
}
class OfficeWorker{
	String name;
	int age;
	String empNo;	// 사번
}


// 상속의 구현

class Person{
	String name;
	int age;
}

//중복되는 멤버변수들이나 메소드들 등 그들의 생성 코드를 구성요소로 한 부모 클래스를 생성한 후
class Student1 extends Person{
	String strNo;
}
// 부모의 멤버들은 상속한 클래스에는 별도 언급 없이도 부모의 멤버변수와 메소드가 있는것으로 인식됨.
class OfficeWorker1 extends Person{
	String empNo;
}

// 상속을 제공해주는 클래스 : 슈퍼(super)클래스, 부모(상위)클래스
// 상속을 받는 클래스 : 서브(sub)클래스, 자식(하위)클래스

// extends 에 의해 상위 클래스의 모든 멤버가 하위클래스로 이동(상속 or 물려받은것)한것으로 인식되어
// 하위클래스의 객체 이름으로 자유롭게 접근이 가능함

public class Extends01 {

	public static void main(String[] args) {
	
		Student1 std = new Student1();
		std.name = "강해린";
		std.age = 18;
		System.out.println(std.name);
		System.out.println(std.age);
		
		OfficeWorker1 ow = new OfficeWorker1();
		ow.name = "킴민지";
		ow.age = 20;
		System.out.println(ow.name);
		System.out.println(ow.age);

		

		
	}

}
