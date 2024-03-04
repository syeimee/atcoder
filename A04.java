import java.util.ArrayList;
import java.util.Scanner;

public class A04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> reverse_binary = new ArrayList<>();
        while (N / 2 > 0) {
            int P;
            P = N / 2;
            reverse_binary.add(N % 2);
            N = P;
        }
        reverse_binary.add(1);
     
            while(reverse_binary.size()<10){
                reverse_binary.add(0);
            }
   


        for (int i = reverse_binary.size(); i > 0; i--) {
            System.out.print(reverse_binary.get(i - 1));
        }
    }

}
