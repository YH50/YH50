package days01;

//this 의 용도 [2]
// : 오버로딩 되어있는 생성자들 간의 서로를 재호출하기 위한 이름으로 사용
// : 호출하는 형태(매개변수의 형태) 대로 생성자가 오버라이딩 돼있어야 사용 가능

class Dclass{
	private int num1;
	private int num2;
	private int num3;
	Dclass (int n){
		num1 = n;
	}
	Dclass (int n1, int n2){
		//num1 = n1;
		//Dclass(n1);		
		//>> 생성자가 호출되기 때문에 객체가 더 생길 수도 있음.
		//현 위치는 생성자 호출 가능 위치가 아님.
		this(n1);	//객체 생성 없이 형제 생성자의 코드만 실행하겠다는 호출
		this.num2 = n2;
	}
	Dclass (int n1, int n2, int n3){
		this(n1, n2);
		this.num3 = n3;
	}

}

public class ClassThis02 {

	public static void main(String[] args) {
		Dclass d1 = new Dclass(10);
		Dclass d2 = new Dclass(10, 20);
		//d2에서 10 -> n1, 20 -> n2, this(n1)이 num1 = n 으로 감
	}

}
