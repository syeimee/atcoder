// https://qiita.com/drken/items/fd4e5e3630d0f5859067#3-hello-world-----practice-contest-a-%E5%95%8F%E9%A1%8C%E3%81%AE%E3%81%BF



import java.util.Scanner;

public class ABC083 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println("計算結果----------------------------");
        ABC083 main = new ABC083();

        System.out.println(main.calc(N, A, B));
    }


    public int calc(int N,int A,int B){
        int sumPlace = 0;
        int sumNumber = 0;
        int p = 0;// 商
        int q = 0;// 余り
        for (int i = 1; i <= N; i++) {
            p = i;
            for (int j = 0; j <= 4; j++) {
                q = p % 10;
                sumPlace += q;

                if (p / 10 == 0) {
                    break;
                } else {
                    p = p / 10;
                }

            }

            if (sumPlace <= B && sumPlace >= A) {
                sumNumber += i;
            }

            sumPlace = 0;  

        }

        return sumNumber;


    }

}


    

