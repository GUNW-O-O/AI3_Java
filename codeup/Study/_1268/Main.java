package _1268;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];

        for( int i = 0; i < a; i++) {
            int b = sc.nextInt();
            arr[i] = b;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1 ) count++;
        }

        System.out.println(count);

        sc.close();
    }

}
