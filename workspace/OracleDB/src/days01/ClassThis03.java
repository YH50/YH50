package days01;

class Student{
	private int bunno;
	private String name;
	private int [] scores;
	private int total;
	private double average;
	
	Student(){
		scores = new int[5];
		name = "카리나";
		scores[0] = 90; scores[1] = 92; scores[2] = 88;
	}
	Student(String name) {
		this();		//scores = new int [5];
		this.name = name;
	}
	Student(String name, int s1, int s2, int s3) {
		this(name);		//scores = new int[5];
		scores[0] = s1; scores[1] = s2; scores[2] = s3;
	}
}
// 생성자 내부에서 호출되는 this() : "항상" 다른 명령보다 위에 있어야 함
// 순서가 맞지 않으면 에러를 발생시킴.
// 에러 메시지 : Constructor call must be the first statement in a constructor.


public class ClassThis03 {

	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student("하니팜");
		Student std3 = new Student("강해린", 96, 95, 99);
	}

}
