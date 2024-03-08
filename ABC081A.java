// ABC 081A -Product
// https://qiita.com/drken/items/fd4e5e3630d0f5859067#5-%E9%81%8E%E5%8E%BB%E5%95%8F%E7%B2%BE%E9%81%B8-10-%E5%95%8F

import java.util.Scanner;

public class ABC081A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            String charString = String.valueOf(c);
            if(charString.equals("1")){
                result ++;
            }
        }

        System.out.println(result);

    }
}
