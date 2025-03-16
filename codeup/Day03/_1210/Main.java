package _1210;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[2];
        for( int i = 0; i <2; i++) {
            arr[i] = sc.nextInt();
        }

        int kcal = 0;
        for (int i =0; i<2; i++) {
            switch (arr[i]) {
                case 1:
                    kcal += 400;
                    break;
                case 2:
                    kcal += 340;
                    break;
                case 3:
                    kcal += 170;
                    break;
                case 4:
                    kcal += 100;
                    break;
                
                default: kcal += 70;
                    break;
            }
        }
        
        if (kcal > 500) {
            System.out.print("angry");
        }else System.out.print("no angry");

        sc.close();

    }
}
