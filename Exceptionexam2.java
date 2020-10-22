package JC.Day70;

//같은 문자열인지 비교 할때는 .equals()를 사용한다. (== 비교)
//new 키워드로 생성하지 않은 문자열에 대해 같은 문자면 .equals()나 ==나 모두 참이다. 
//new 키워드로 생성한 문자열에 대해 같은 문자면 .equals()만 참이지만 래퍼런스는 다르기 때문에 ==는 거짓이다.
//문자열은 .equals()를 권장한다.


public class Main {
    public static void main(String[] args) {
        String city1  = "Asia";
        String city2  = "Europe";        
        String city3  = new String("Asia");        
        String city7  = "Asia";
        
        System.out.println(city1);
        System.out.println(city1.length());
        System.out.println(city1==city2);
        System.out.println(city1.equals(city2));
        System.out.println(city1==city3);
        System.out.println(city1==city7);
        System.out.println(city1.equals(city3));
        System.out.println(city1.equals(city7));








     
    }
}
