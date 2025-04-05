package _1904;

import java.util.Scanner;

public class Main {
    static void abc (int a, int b) {
        if( b >= a ) {
            if ( a % 2 == 1) {
                System.out.print(a + " ");
            }
            ++a;
            abc(a, b);
        }
        else if ( a == b ) return;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        abc(a, b);



        sc.close();
    }
}
