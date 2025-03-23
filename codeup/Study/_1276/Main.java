package _1276;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n;
        for(int i = n-1; i >= 1; i--) {
            sum = sum*i;
        }
        System.out.println(sum);

        sc.close();
    }

}
