package JC.Day70;

import java.util.ArrayList;


//배열보다 편리하고 강력한 list에 정수를 저장하고 저장한 정수들 중에서 홀수만 찾아서 
//제곱의 합을 구해보자
//List<> <>에는 int->integer를 사용해야 한다


public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        int s = 0;
        for (int i = 1; i <=10; i++) {arr.add(i);}    
        
        for (Integer m : arr) {
            if(m%2!=0) s+=Math.pow(m, 2); System.out.printf("%d\t",s);        
        }
        System.out.println();
        System.out.println("1에서 10사이의 홀수의 제곱의 합 : "+s);

    }
}
