package Question2;

public class Application1 {
    public static void main(String[] args) {


        int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x+=2);
		System.out.println( !('A' <= c && c <='Z') );
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);

		/* System.out.println() 의 결과를 예측하고 이유를 설명하시오. */
        // true, 12(x), 4(앞에서 1 더해서 3+2 = 5), ?, ?, 5, 66, B, B(다음부턴 C), >> C

    }
}
