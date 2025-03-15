package _1409;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [10];

        for( int i = 0; i <= arr.length-1 ; i++) {
            arr[i] = sc.nextInt();
        }
        int mem=0;
        int what=sc.nextInt();

        for( int i = 0; i < arr.length; i++) {
            if ( what-1==i ) {
                mem = arr[i];
            }
        }
       
        System.out.print(mem);

        sc.close();
    }
}
