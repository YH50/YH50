package days0503;

// Object 클래스
// 개발자가 클래스 하나를 새로 만들면 자동으로 상속되는 클래스
// 자바 내부에 존재하고 새롭게 만들어지는 모든 클래스는 보이지 않는 곳에 extends Object 가 존재함
// 자바 내부에 존재하고 새롭게 만들어지는 모든 클래스의 부모 클래스
// 자바의 클래스는 한 클래스 당 하나의 부모 클래스만 가질 수 있음
// Object 가 아닌 다른 클래스를 상속하면 그 클래스에서 extends Object 가 지워짐
// 이렇게 지워지는 경우는 상속받은 부모 클래스가 이미 Object 를 상속하고 있기 때문에
// 결과적으로 Object 의 자식(손자) 클래스가 됨

class UserClass{
	
}
public class Extends06_Object01 {

	public static void main(String[] args) {

		UserClass obj = new UserClass();
		System.out.println(obj);
		System.out.println(obj.toString());		// toString() 은 생략이 가능함
		
		String str = new String("롯데자이언츠해체해");
		System.out.println(str);
		System.out.println(str.toString());		// 저장하고 있는 문자열을 출력함
		
		// String 클래스 내부에는 본연의 toString() 메소드가 오버라이딩 되어있음
		// 따라서 "패키지이름.클래스이름@해시코드" 가 아닌 저장된 문자열이 출력됨
		
		System.out.println(obj.getClass());
		System.out.println(obj.hashCode());	// 10진수로 표현된 해시코드
		
		// 사용자가 새롭게 정의한 클래스도 toString 을 오버라이딩하여 클래스에 맞게 설정 가능함.
		
	
	}

}
