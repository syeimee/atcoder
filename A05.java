import java.util.Scanner;

public class A05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int result = 0;

        // ２数(i,j)が決まれば残りの１数は定まるので２数の和の組み合わせだけを考える。
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int a = i + j;
                if (K - a <= N && K - a > 0) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }

}
