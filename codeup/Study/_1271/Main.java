package _1271;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int lg = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lg) {
                lg = arr[i];
            }
        }

        System.out.println(lg);
        sc.close();
    }
}
