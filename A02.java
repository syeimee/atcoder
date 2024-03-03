import java.util.Scanner;

public class A02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int N =sc.nextInt();
            int X =sc.nextInt();
            int[] A = new int[N];
            boolean ans = false;

        for (int i =0;i<N;i++){
            int num =sc.nextInt();
                A[i] = num;
        }

        for(int i =0;i<N;i++){
            if(A[i] == X){
                ans = true;
            }
        }

        if(ans == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");

        }
        
    }




}
