package _1915;

import java.util.Scanner;

public class Main {
    
    static int func(int a) {
        if (a == 0) return 0;
        if (a == 1) return 1;
        return func(a - 1) + func(a - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int pibo = func(a);

        System.out.println(pibo);

        sc.close();
    }
}
