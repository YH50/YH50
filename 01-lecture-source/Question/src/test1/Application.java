package test1;

public class Application {

    /* test1 */

    public static void main(String[] args) {

        byte bno = 2;
        short sno = 18;
        int ino = 21;
        long lno = 1984L;
        char ch = 'A';
        float fno = 3.0f;
        double dno = 3.45;
        boolean isTrue = true;

       long sum = ino + (int)lno;

       String res = (sum > 0)? "양수입니다." : (sum == 0)? "0입니다." : "음수입니다.";
        System.out.println("res = " + res);






    }
}
