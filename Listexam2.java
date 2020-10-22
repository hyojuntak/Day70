package JC.Day70;

import java.util.ArrayList;

// Stream 은 " 순차적으로 나열된 데이터"이다. stream은 저장된 데이터를 쉽고 
// 편하게 연산할 수 있는 기능을 제공한다
// List에 저장된 정수 100에서 홀수를 찾아서 합을 구하자
// 1. list에 저장한 데이터 중에서 조건에 맞는 수를 찾을때 filter를 사용
// 2. 합을 구할 때 reduce를 대응해서 간단하게 연산 


public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        int s = 0;  //합을 계산하는 변수
      
        for (int i = 0; i <= 100; i++) {
            arr.add(i); 
        }
            //1~100까지 전체 합
            s = arr.stream().reduce(0, Integer::sum);
            System.out.println("1~100까지의 합 : "+s);

            s = 0;
            // 1~100까지 홀수 합
            s = arr.stream().filter(j->j%2!=0).reduce(0, Integer::sum);
            System.out.println("1~100까지의 홀수 합 : "+s);

            s = 0;
            //1~100까지 짝수 합
            s = arr.stream().filter(e->e%2==0).reduce(0, Integer::sum);
            System.out.println("1~100까지의 짝수 합 : "+s);

        
    }
}
