package JC.Day70;

//Exception을 사용하면 발생하는 문제를 유연하게 처리할 수 있다.
//RuntimeException은 실행 시에 발생하는 예외는 잘못된 대입, 배열, 잘못된 입력, 수학 관련(0으로 나누기) 등등 
//프로그램이 정확하게 작동되지 않는 경우 발생한다.
//catch 여러개가 있을 수 있는데 Finally는 단 1개만 있어야 한다. (없을수도 있음)

public class Main {
    public static void main(String[] args) {
        
        try {
            int x =5;
            int y = 20 /(5-x);
            System.out.println(y);
        }catch(ArithmeticException ee){
            System.out.println("0이 되었습니다.");
            System.out.println(ee.getMessage());
        }finally{
            System.out.println("언제나 수행");
        }
    }
}
