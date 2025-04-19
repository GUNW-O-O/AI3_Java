package _1167;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int lg = arr[0];
        int md = arr[0];
        int sm = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] > lg ) {
                lg = arr[i];
            }
            if (arr[i] < sm) {
                sm = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] != lg && arr[i] != sm) {
                md = arr[i];
            }
        }
        if (arr[0] != arr[1] && arr[1] != arr[2]) {
            System.out.println(md);
        }
        else if (arr[0] == arr[1] || arr[1] == arr[2]) {
            System.out.println(sm);
        }

        sc.close();
    }

}
