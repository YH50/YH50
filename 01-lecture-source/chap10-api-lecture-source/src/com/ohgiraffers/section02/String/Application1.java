package com.ohgiraffers.section02.String;

public class Application1 {

    public static void main(String[] args) {
        /* String 클래스에서 자주 사용하는 메소드에 대해 숙지하고 응용할 수 있다. */
        /*
        * charAt() : 해당 문자열의 인덱스에 해당하는 문자를 반환한다.
        * 인덱스는 0부터 시작하는 숫자체계를 의미하며 인덱스를 벗어난 정수를 인자로 전달하는 경우
        *                                            indexOutBoundException 이 발생한다.
        * */

        String str = "apple";

        for(int i = 0; i < str.length() /*문자열 길이 오버로 했을때(ex. 6)*/; ++i){
            System.out.println("charAt(" + i + ") : " + str.charAt(i));
        }   // >> 실행시키면 indexOutBoundException 뜨면서 에러 발생함!

        /*
        * compareTo() : 인자로 전달된 문자열과 사전 순으로 비교하여
        *              두 문자열이 같으면 0, 인자로 전달한 문자열보다 작으면 음수, 크면 양수를 반환한다.
        * 단 이 메소드는 대소문자를 구분하여 비교한다.
        * */

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println("compareTo() : " +(str2.compareTo(str3)));   // 0이 반환됨.
        System.out.println("compareTo() : " +(str4.compareTo(str2)));   // -32 (4가 2보다 작음)
        System.out.println("compareTo() : " +(str2.compareTo(str4)));   // 32 (2가 4보다 큼)

        System.out.println("compareTo() : " +(str2.compareTo(str5)));   // -5 (2가 5보다 작음)
        System.out.println("compareTo() : " +(str5.compareTo(str2)));   // 5 (5가 2보다 작음)

        /* concat() : 문자열에 인자로 전달한 문자열을 합쳐서 새로운 문자열을 반환한다.
        *           > 원본 문자열에는 영향을 주지 않음.
        * */

        System.out.println("concat() : " + (str2.concat(str5)));    //javaoracle 출력
        System.out.println("str2 : " + str2);

        /* indexOf() : 문자열에서 특정 문자를 탐색하여 "처음" 일치하는 인덱스 위치를 정수형으로 반환한다.
        *   단, 일치하는 문자가 없는 경우 -1 을 반환함.
        * */

        String indexOf = "java oracle";
        System.out.println("indexOf('a') : " + indexOf.indexOf('a'));       // 처음 일치 자리 1번째 (0 다음 1)
        System.out.println("indexOf('z') : " + indexOf.indexOf('z'));      //없으면 -1 반환

        /*
        * lastIndexOf() : 문자열 탐색을 뒤에서부터 진행하고 처음 일치하는 위치의 인덱스를 반환한다.
        *   단, 일치하는 문자가 없는 경우 -1 을 반환함.
        * */

        System.out.println("lastIndexOf('a') : " + indexOf.lastIndexOf('a'));   //7(번째)
        System.out.println("lastIndexOf('z') : " + indexOf.lastIndexOf('z'));   // -1

        /* trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다.*/

        String trimStr = "   java   ";
        System.out.println("trimStr() : #" + trimStr + "#");
        System.out.println("trim() : #" + trimStr.trim() + "#");

        /*
        * toLowerCase() : 모든 문자를 소문자로 변환시킨다.
        * toUpperCase() : 모든 문자를 대문자로 변환시킨다.
        * */

        String caseStr = "JavaOracle";

        System.out.println("toLowerCase() : " + caseStr.toLowerCase());
        System.out.println("toUpperCase() : " + caseStr.toUpperCase());

        /*
        * subString() : 문자열 일부분을 잘라내어 새로운 문자열을 반환한다.
        * */

        String javaoracle = "javaoracle";

        System.out.println("substring(3,6) : " + javaoracle.substring(3,6));    //6 전까지임!
        System.out.println("substring(4) : " + javaoracle.substring(4));   //4부터 쭉

        /* replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 반환한다.
        *  */

        System.out.println("replace() : " + javaoracle.replace("java", "python"));
        // >> pythonoracle 로 출력됨

        System.out.println("javaoracle : " + javaoracle);   //원본엔 영향 주지 않음

        /* length() : 문자열의 길이를 정수형으로 반환한다. */
        System.out.println("length() : " + javaoracle.length());    //10
        System.out.println("총 문자열의 길이 : " + ("   Lotte   ".length()));

        /* isEmpty() : 문자열의 길이가 0이면 true, 아니면 false 를 반환 */
        System.out.println("isEmpty() : " + "".isEmpty());
        System.out.println("isEmpty() : " + "   ".isEmpty() );

        /* 길이가 0인 문자열은 null과는 다름!! */
        String str6 = null;
        String str7 = "";







    }
}
