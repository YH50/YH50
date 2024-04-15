package days01;

// 같은 패키지 내에서 동일 이름의 클래스 생성은 불가능함
// 멤버 메소드 : 클래스에 소속되어 클래스 객체에 종속된 메소드

class Animal{
	private String name;
	private int age;
	// 멤버 메소드는 특별한 경우를 제외하면 static 을 사용하지 않음.
	// 현재 메소드를 호출하는 호출 객체(a1, a2 등)을 별도의 매개변수로 받지 않아도 전달되어져 있음.
	
	public void prn() {
		// 호출 객체는 this 로 전달됨 > 보이진 않으나 알게 모르게 전달됨.
		System.out.println("저의 이름은 " + this.name +", 나이는 " + this.age +"살 입니다.");
	}
	// 멤버 메소드는 같은 클래스 내 private 멤버 변수에 자유롭게 접근이 가능.

	
	public void input (String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 멤버 변수, 멤버 메소드들은 필요한 만큼 자유롭게 정의하여 사용할 수 있음
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getName() {
//		return this.name;
//	}
//	public int getAge() {
//		return this.age;
//	}
	//24행부터 34행까지의 메소드들 : getter/setter
	// >> 보통 멤버 변수의 값을 저장하거나 얻기 위한 메소드이지만
	// 그 목적만 있다면 메소드 이름이 반드시 같지 않아도 무방함.
	// 그러나 getter/setter 는 개발자가 호출하여 사용하기도 하지만
	//시스템, 또는 컴파일러가 사용할 때도 있기 때문에 약속된 이름인
	//(get변수명, set변수명)으로 사용하는 것이 일반적.

	//직접 입력으로 생성 시 오타가 날 수 있으므로 메뉴 사용해서 만드는 것을 권장.


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
}

//private : 클래스 내부에서만 사용 가능한 멤버를 정의하는 키워드
//public : 접근에 제한이 없는 멤버를 정의하는 키워드
//protected : child class 에서만 자유롭게 접근이 가능 (상속에서 더 다룰 예정)
//default : 접근 지정자를 정해주지 않으면 자동으로 갖게 되는 접근 지정자,
//			 같은 패키지 내에서 public 처럼 자유롭게 접근 가능함. (외부패키지에선 private 와 마찬가지)




public class Method01 {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Animal();
//		a1.name = "월월";
//		a1.age = 10;
//		a2.name = "야옹";
//		a2.age = 7;
		
		a1.input("월월", 9);
		a2.input("애옹", 6);
//		System.out.println("저의 이름은 " + a1.name +", 나이는 " + a1.age +"살 입니다.");
		prn(a1);
		a1.prn();
//		System.out.println("저의 이름은 " + a2.name +", 나이는 " + a2.age +"살 입니다.");
		prn(a2);
		a2.prn();
	}

	private static void prn(Animal a1) {
	//static 내에서 만든 변수도 static 이어야 함
//		System.out.println("저의 이름은 " + a1.name +", 나이는 " + a1.age +"살 입니다.");
		System.out.println("저의 이름은 " + a1.getName() +", 나이는 " + a1.getAge() +"살 입니다.");

	}

}
