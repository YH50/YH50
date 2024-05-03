package days0503;

class Point{
	private int x;
	private int y;
	Point(int x, int y){
		this.x = x; this.y = y;
	}
	// toString 메소드를 x:30, y:20 이라는 "String" 데이터가 리턴되게끔 오버라이딩
	public String toString() {
		String result = "x:" + this.x +", y:" +this.y;
		return result;
	}
}
public class Extends06_Object02 {

	public static void main(String[] args) {

		Point p = new Point(30, 20);
		System.out.println(p);
	}

}
