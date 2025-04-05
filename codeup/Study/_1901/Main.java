package _1901;

import java.util.Scanner;

public class Main {
    static int a = 1;
    static void abc (int b) {
        if( b >= a ) {
            System.out.println(a);
            a++;
            abc(b);
        }
        else if ( a == b ) return;

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        abc(a);



        sc.close();
    }
}
