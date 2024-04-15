package days01;

// this 키워드의 용도 [1]
// this 변수 : 레퍼런스(참조) 변수
// 멤버 변수 : new 생성자()에 의해 새로운 공간 객체별로 각각 만들어짐.
// 반면 멤버 메소드는 하나만 만들어지며 각 객체들이 공유 & 호출해서 사용.
// 이때 메소드 내에서는 "누가 자신을 호출했는가"를 구분하기 위해 this 를 준비.
// 호출 객체의 주소(참조값)이 this 에 저장됨.

class Cclass{
	private int num;		//멤버변수
	public void init (int n /*,  Cclass this */) {
		this.num = n;
	}		//멤버 메소드
	
	public int getNum( /* Cclass this*/) {
		return this.num;
	}
	public void setNum(int num /*, Cclass this*/) {
		this.num = num;
	}
	
	public void copy(Cclass b /*, Cclass this*/) {
		this.num = b.num;
	}
}

public class ClassThis01 {

	public static void main(String[] args) {
		Cclass c1 = new Cclass();
		Cclass c2 = new Cclass();
		Cclass c3 = new Cclass();
		c1.init(10); 		// 10 : init 메소드의 매개변수 n, c1은 init 메소드의 this 로 전달됨.
		c2.init(20);
		c3.init(30);
		
//		Cclass c4 = c3;		//참조값의 복사
//		c3.setNum(100);
//		
//		System.out.println(c4.getNum());	//100
//		System.out.println(c3.getNum());	//100
		
		Cclass c4 = new Cclass();
		c4.copy(c3);
		c3.setNum(100);
		System.out.println(c3.getNum());	
		System.out.println(c4.getNum());	
		

	}

}
