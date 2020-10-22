import java.util.Scanner;

class Main {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int [] d = new int [100001];
       
        for (int i = 0; i < d.length; i++) {
            d[i] = 0;

        }

        d[0]=0;d[1]=1;

        for (int i = 2; i < x+1; i++) {
            d[i] = d[i-1] + d[i-2];
            if(i<=2) {d[i]=i;}
            else d[i]=Math.max(d[i-1]+d[i-2],d[i]);
            System.out.println("d ["+i+"] = "+ d[i]);
        }

        System.out.println(d[x-1]);
    }
  }
