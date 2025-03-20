package _1164;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];

        for(int i = 0; i<3; i++) {
            arr[i] = sc.nextInt();
        }
        int small = arr[0];
        for (int i = 1; i<3; i++) {
           if(arr[i] < small) {
            small=arr[i];
           }
        }
        if (small <= 170) {
            System.out.print("CRASH");
        }else 
        System.out.print("PASS");
        sc.close();
    }
}
