package days01;


class Bclass{
	private int age;
		Bclass(){
		age = 10;
		}
	
	Bclass (int age){
		this.age = age;
	}
	// 매개변수가 있는 생성자를 새로 정의하면
	// 보이지 않던 디폴트 생성자가 매개변수가 있는 생성자로 대체됨.
	// 둘을 모두 사용하려면 디폴트 생성자도 따로 기술해줘야함.
}

public class ClassConstructor02 {

	public static void main(String[] args) {

		Bclass b = new Bclass();		//숨어있던 디폴트 생성자 호출
		
		Bclass c = new Bclass(20);
		Bclass d = new Bclass(30);

	}

}
