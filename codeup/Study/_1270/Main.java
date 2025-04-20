package _1270;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        while (a > 0) {
            if(a % 10 <= 9) {
                count++;
                a -= 10;
            }
            if (a < 0 ) {
                break;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
