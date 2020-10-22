package JC.Day70;

// 자바에서 최상위 클래스도 object다. object들은 jvm메모리를 관리한다. c/c++와 달리
// 개발자가 메모리 관리를 할 필요가 없다.
// 클래스로 인스턴스를 생성, 인스턴스를 두개 생성하면 클래스 한개, 객체 두개, 각 객체들에 대한 고유의 주소와 코드가 생성된다.

//Object의 getClass() 매서드는 Class를 반환한다. Class는 해당 클래스의 선언된 매서드와 생성자들을 반환하는 매서드를 제공한다.
//class는 모든 객체에 대한 객체 자신의 정보(전체)를 제공한다.

public class Main {
    public static void main(String[] args) {
        
        Object obj1 = new Object();
        Class classes = obj1.getClass();

        System.out.println(classes.getName());
        

     
    }
}
