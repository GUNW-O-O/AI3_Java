package _1902;

import java.util.Scanner;

public class Main {

    static void abc(int a) {
        int b = 0;
        if ( a > b ){
            System.out.println(a);
            a -= 1;
            abc(a);
        }
        else if (a == 1) return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        abc(a);

        sc.close();
    }

}
