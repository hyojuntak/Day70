package JC.Day70;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//리스트에서 저장된 데이터에 조건에 맞는 수를 찾을 때는 filter를 이용한다.
//filter로 찾은 수에 '무엇인가를 해라'(여기서는 제곱을 모두 적용)
//collect는 해당 수의 값을 새로운 리스트로 생성 



public class Main {
    public static void main(String[] args) {
        int s= 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arr.add(i);
        }
        
        //stream, filter, map 
        arr = (ArrayList<Integer>) arr.stream().filter(j -> j % 2 == 1).map(j -> j * j).collect(Collectors.toList());

        arr.forEach(j->{System.out.printf(j+"\t");});

        System.out.println();
        s = arr.stream().reduce(0, Integer::sum);

        
        System.out.println(s);
        
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("a","b","c"));
        
        arr1.stream().map(t->t.toUpperCase()).collect(Collectors.joining(" "));

        System.out.println(arr1);

        arr1.stream().map(String::toUpperCase).forEach(k->System.out.println(k));


        
    }
}
