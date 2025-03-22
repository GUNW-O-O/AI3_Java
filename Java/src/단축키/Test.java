package 단축키;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int k = a; k > 0; k--) {
            for (int b = k; b > 0; b--){
                System.out.print("*");
          }System.out.println();
      }
    }
}
