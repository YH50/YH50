package days0503;

class SuperB{
	SuperB(int n){
		
	}
	SuperB(){
		
	}
}
class SubB extends SuperB{
	SubB(){
		// 부모클래스의 생성자를 호출하는 명령이 따로 쓰이지 않으면
		// 이는 부모클래스의 디폴트 생성자를 호출함 >> super();
		super();
		// super(); >> 부모클래스의 생성자 중 매개변수가 없는 "디폴트 생성자"를 호출하는 명령이므로
		// 혹시라도 부모클래스의 생성자에 매개변수가 있다면 에러가 발생함
		
		// 그 에러를 해결하는 방법
		// 1. 부모클래스의 매개변수 형태 그대로 호출 : super(); 안에 전달인수 넣어줌
		//		super(10);
		// 2. 부모클래스에 디폴트 생성자 하나를 추가함
		// 3. 부모클래스에 매개변수가 있는 생성자를 매개변수가 없는 디폴트 생성자로 바꿈
		
		// <정   리>	부모클래스의 생성자 형태로 호출 or 호출한 곳에 맞춰서 부모클래스 생성자를 추가함
	}
	
	SubB(int n){
		// 이 생성자의 경우 부모클래스의 디폴트 생성자를 호출함 >> super();
		
		// 부모클래스에 매개변수가 있는 생성자를 전달인수를 넣어서 호출할 수도 있음
		// super(10);
		
		// this()를 이용해서 super() 명령을 포함하고 있는 형제생성자를 호출할 수도 있음
		this();
		
		// super(); 	or	 super(n);	 or		this();    >> 현재 생성자로는 이 3개 중 하나만 써야함
		// 맨 윗줄에 쓸 수 있는 명령들
	}
	SubB(int subNum, int num){
		this(10);	// this();		// super();		//	super(10);
	}
}

public class Extends03 {

	public static void main(String[] args) {

	}

}
