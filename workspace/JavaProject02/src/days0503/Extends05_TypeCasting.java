package days0503;

class NormalA{}
class NormalB{}
class SuperC{
	int superNo;
	void abc() { System.out.println("super method");
}
}
class SubC extends SuperC{
	int subNo;
	void abc() {System.out.println("sub method");
}
}
	
public class Extends05_TypeCasting {
	public static void main(String[] args) {
		SuperC super1 = new SuperC();
		SubC sub1 = new SubC();
		super1.superNo = 100;
		super1.abc();	// "super method";
		sub1.superNo = 30;
		sub1.subNo = 10;
		sub1.abc();		// "sub method";
		
		
		// 객체 간의 TypeCasting #1
		// 객체 간에는 "부모클래스의 참조변수"에 "자식 클래스의 인스턴스 주소(new Sub())"를 저장하게 되면
		// 별도의 연산 과정 없이 가능
		SuperC super2 = sub1;
		SuperC super3 = new SubC();
		// 부모 참조변수 <- 자식 인스턴스의 주소 OK
		super3.superNo = 50;
		//		super3.subNo = 39;  >> 안됨 ( >>> 부모 참조변수는 자신이 물려준 메소드만 접근이 가능함)
		super3.abc(); 		//SubC의 오버라이딩된 메소드가 실행됨
		
		
		// 객체 간 TypeCasting #2
		// 자식클래스의 참조변수에 부모클래스의 인스턴스의 주소는 "아무 조치 없이" 저장이 불가능함
		//SubC sub4 = super1;		(X)
		//SubC sub5 = new SuperC();		(X)
		// 자식 참조변수에 부모 인스턴스 주소를 넣을 수 없음!!!
		
		// 객체 간 TypeCasting #3
		// 자식클래스의 참조변수에 부모클래스의 인스턴스 주소는 별도의 조치로 저장이 가능함
		//SubC sub4 = (SubC) super1;
		//SubC sub5 = (SubC) new SuperC();
		// 문법적으로는 오류가 없지만 실행시켜보면 오류 나옴 >>> 런타임 오류
		// 부모 인스턴스가 강제캐스팅(SubF)를 해서 아무리 자식인 척을 해도 결국엔 뽀록난다는 뜻
		
		
		// 객체 간 TypeCasting #4
		// 자식클래스의 참조변수에 부모클래스의 참조변수값 넣음 : 위와 같이 원래는 안되는 동작이지만
		// 만약 부모클래스의 참조변수값이 저장하고 있는 값이 자식클래스 인스턴스의 참조값이라면 가능함
		SuperC super4 = new SubC();	// 부모참조변수에 자식 인스턴스를 저장
		SubC sub5 = (SubC) super4;		// 에러 없이 실행됨
		// >> 결과적으로 자식 인스턴스 주소를 자식 참조변수에 저장한 셈이 되므로 정상 실행됨
		
		// 자식인스턴스의 주소 -> 부모 참조변수 -> T.C.(TypeCasting) -> 자식 참조변수 >> O
		// 부모인스턴스의 주소 -> 부모 참조변수 -> T.C	-> 자식 참조변수 X	(런타임 에러)
		
		// 부모 참조변수에 자식 인스턴스가 저장된 경우
		// 부모가 물려준 멤버 변수 이외에는 접근이 불가함
		SuperC super6 = new SubC();
		// super6.subNo = 10;	>> X
		
		// 현재 super6에 저장된 new SubC()의 subNo 을 사용하려고 한다면
		// 자식클래스 참조변수에 옮겨서 저장하여 사용해야함
		// 그러려면 #4에서 언급한 타입캐스팅이 필요함
		SubC sub6 = (SubC)super6;
		sub6.superNo = 23; 
		
		
		// 객체 간 TypeCasting #5
		// 위와 같이 타입캐스팅을 통해서 변수들끼리 자료를 이동시킬 때
		// 캐스팅이 가능한 지, 또는 런타임 에러가 생길지를 판단해주는 명령이 존재함
		SuperC super7 = new SubC();
		SubC sub7;
		if(super7 instanceof SubC) {
			sub7 = (SubC)super7;
			System.out.println("슈퍼7 형변환 성공");
		}else {
			System.out.println("슈퍼7 형변환 실패");
		}
		SuperC super8 = new SuperC();
		SubC sub8;
		if(super8 instanceof SubC) {
			sub8 = (SubC)super8;
			System.out.println("슈퍼8 형변환 성공");
		}else {
			System.out.println("슈퍼8 형변환 실패");
		}

		
		
		//----------------------------------------------------------------------------------------------------------
		// 형변환
		// 기본 자료의 형변환
		short s = 10;
		int i = s;	// 작은 용량의 자료를 큰 용량의 변수에 이동
		short k = (short)i;		// 작은 용량의 변수에 큰 용량의 자료를 대입
		double d = 25 / (double)i;
		
		NormalA a1 = new NormalA();
		NormalB b2 = new NormalB();
		//안되는거
		// NormalA a2 = b2;
		// NormalA a2 = (NormalA)b2;
		}
}

