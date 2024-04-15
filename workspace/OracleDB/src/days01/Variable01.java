		//4월15일부터 오전마다 자바 복습 들어감.
package days01;

class Scores{
	int kor;
	int mat;
	int eng;
	int tot;
	double avg;
	
	// 클래스 : 프로그램으로 처리하고자 하는 대상의 요소들을 자료화하여
	//하나의 자료형으로 정의한 사용자 정의 자료형.
	// >> 필요에 의해 기본자료형,double,  char 등 이들을 그룹화하하여 새롭게 정의한 자료형.
	// >> 1개 이상의 자료, 하나 이상의 자료형을 저장할 수 있는 복합 자료형.
	
	// 프로그램 단위로도 사용 >> 자바의 프로그램 단위
	//하나의 파일 내에 여러 클래스 정의하여 사용 가능
	//하지만 그 중 하나는 파일 이름과 반드시 같아야 하고 public 이어야 하며
	//자체 실행 여부에 따라 public void main(){} 를 포함하고 있어야 함.
}

public class Variable01 {

	public static void main(String[] args) {

		Scores std1 = new Scores();				//std1: 참조변수		new Scores() : 인스턴스
		// new Scores()에 의해 Heap 영역에 필요한 만큼 메모리를 확보하고
		// 그 주소를 참조변수 std1에다 전달함.
		// String str = "Korea";
		String str = new String("Korea");
		//>> String은 변수가 아닌 클래스로 분류
		

		//		System.out.println("아주 쉬운 자바 프로그램");
		//		
		//		int [] kor = new int[5];
		//		int [] eng = new int[5];
		//		int [] mat = new int[5];
		//		int [] tot = new int[5];
		//		double [] avg = new double[5];
		
		std1.kor = 95;
		std1.eng = 80;
		std1.mat = 90;
		
		std1.tot = std1.kor + std1.eng + std1.mat;
		std1.avg = std1.tot / 3.0;
		
		System.out.println("\t==== 성적표 ===");
		System.out.println("________________________________");
		System.out.println("국어 \t영어\t수학\t총점\t평균");
		System.out.println("________________________________");

		System.out.printf("%d\t%d\t", std1.kor, std1.eng);
		System.out.printf("%d\t%d\t", std1.mat, std1.tot);
		System.out.printf("%.1f\n", std1.avg);
		
		// 같은 자료형의 다른 객체 생성
		Scores std2 = new Scores();
		
		Scores [] std = new Scores[3];		//객체 배열 생성
		// 이거는 참조변수 배열을 만든거고 Scores 객체가 만들어진게 아님
		
		// >> 각 참조변수에 새 인스턴스를 할당해줘야 활용이 가능해짐
		std[0] = new Scores();
		std[1] = new Scores();
		std[2] = new Scores();
		
		std[0].kor = 100;
	}

}
