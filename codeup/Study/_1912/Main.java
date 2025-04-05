package _1912;

import java.util.Scanner;

public class Main {

    static int func(int a) {
        if(a==1) {
            return 1;
        }
        return a *func(a-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int sum = func(a);

        System.out.println(sum);

        sc.close();
    }

}
