package JC.Day70;
import java.util.ArrayList;

//예외 처리
//try()에 코드를 넣고 예외가 발생하면 catch() 해당 예외 처리
//예외 처리는 예외를 안전하게 끝내는 것이 목적이므로 catch를 되도록이면 간단하게 작성한다
//finally는 예외가 발생하거나 발생하지 않아도 반드시 실행 


public class Main {
    public static void main(String[] args) {
        String sNum = "123";
        String nNum = "h";

        try {
            //Integer.parseInt는 정수 타입 문자열을 정수로 변환할때 사용한다.
            //잘못된 타입을 변환하려고 하면 NumberFormatException이 발생한다.
            
            int a = Integer.parseInt(nNum);
            System.out.println(a);
        }catch(NumberFormatException ee){
            System.out.println("int인지 확인해봐!");
            System.out.println(ee.getMessage());
        }catch(Exception ee){
            System.out.println("야 잘 좀 넣어");
        }finally{
            System.out.println("난 수행되어야만 해 !");
        }


        
    }
}
