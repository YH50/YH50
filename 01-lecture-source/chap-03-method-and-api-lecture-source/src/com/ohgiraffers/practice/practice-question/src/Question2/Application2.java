package Question2;
 
public class Application2 {

    public static void main(String[] args) {

        /*
         * 내가 가지고 있는 사과의 갯수는 92개이다.
         * 이를 담을 수 있는 바구니에는 10개의 사과를 담을 수 있다면 총 10개의 바구니가 필요할 것이다.
         * 아래에 알맞은 코드를 넣으시오. */


         int numOfApples = 92;
         int sizeOfBucket = 10;
         //int numOfBucket = ?

         //System.out.println("필요한 바구니의 수 : " + numOfBucket); -> 10

        int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1 : 0);




    }

}
