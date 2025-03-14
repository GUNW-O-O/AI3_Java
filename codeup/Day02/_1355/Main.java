package _1355;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            // 왼쪽 공백 출력
            for (int j = 1; j < i; j++) {
                System.out.print(" ");  // 공백 출력
            }

            // 별 출력
            for (int j = 1; j <= a - i + 1; j++) {
                System.out.print("*");  // 별 출력
            }

            System.out.println();  // 한 줄 출력 후 줄 바꿈
        }        

        sc.close();
    }
}