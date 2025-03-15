package _1508;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ver = sc.nextInt();

        int arr[][] = new int [ver][ver];

        for ( int i = 0; i < arr.length; i++) {
            arr[i][0] = sc.nextInt();
        }
        

        for (int i = 1; i < ver; i++) {
            for (int j = 1; j <= i; j++) {
            arr[i][j] = arr[i][j - 1] - arr[i - 1][j - 1];
            }
        }

        for ( int i = 0; i < arr.length; i++) {
            for ( int j = 0; j<=i; j++) {
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }



        sc.close();
    }
}
