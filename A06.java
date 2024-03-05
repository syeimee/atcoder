import java.util.Scanner;

public class A06 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();


        int [] A = new int[N];
        for(int i = 0; i<N; i++){
            A[i] = sc.nextInt();
        }

        int [] sum = new int[N+1];
        sum[0] = 0;
        for(int i = 0; i < N; i++){
            sum[i+1] = sum[i] + A[i];
        }

        int [] ans = new int[Q];
        for(int i = 0; i<Q; i++){
           int L= sc.nextInt();
           int R = sc.nextInt();
            ans[i] = sum[R] - sum[L-1];
        }

        
        for(int i = 0; i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }
}