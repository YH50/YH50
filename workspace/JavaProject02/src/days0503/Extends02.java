package days0503;

class SuperA{
	int superNo;
	SuperA(){
		System.out.println("SuperA의 생성자 호출됨");
	}
}
class SubA extends SuperA{
	int subNo;
	SubA(){
		// 자식 클래스의 생성장의 첫번째 명령어 super(); 가 숨어있으며
		// 이는 부모 생성자를 호출하는 명령
		// 이 super(); 명령은 따로 명시해서 쓸 수도 있다.
		super();
		// 꺼내서 쓸 경우 반드시 첫번째 명령으로 써줌.
		// 부모클래스 생성자를 모두 실행한 뒤 자식 클래스 생성자의 남은 명령을 실행함
		System.out.println("SubA의 생성자 호출됨");
	}
}

public class Extends02 {

	public static void main(String[] args) {

		SubA s1 = new SubA();
		
	}

}
