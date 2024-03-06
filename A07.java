import java.util.Scanner;

public class A07 {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int D = sc.nextInt();
    int N = sc.nextInt();
    int [] result = new int[D];

     for(int i = 0; i < N ;i++){
        int L = sc.nextInt();
        int R = sc.nextInt();
        for(int j = L ; j <= R; j++){
            result[j-1] ++;
        }
     }

    for(int i = 0; i<result.length; i++){
        System.out.println(result[i]);
    }

}

}