package JC.Day70;

import java.util.ArrayList;


//List배열과 같은 역할을 한다.
//더 편리하고 강력한 기능을 제공한다.
//배열은 저장하는 데이터의 수가 제한이 되어 정해진 갯수 만큼 입력되면 더 이상 저장할 수 없다.
//List는 저장 공간을 스스로 확보하면서 데이터를 저장한다.
//List에 입력할 때는 add를 가져올때는 get
public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++) {
            arr.add(i);
            // System.out.println(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            int m = arr.get(i);
            System.out.printf("%d\t",m);
        }
    }
}
