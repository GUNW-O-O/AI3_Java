package _1411;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int card[] = new int[n-1];

        for ( int i = 0; i < card.length; i++) {
            card[i] = sc.nextInt();
        }
        int sum = 0;
        int sum1 = 0;
        for ( int i = 0; i<=card.length+1; i++) {
            sum += i;
        }
        
        for ( int i = 0; i < card.length; i++) {
            sum1 += card[i];
        }
        
        System.out.print(sum-sum1);


        sc.close();
    }
}
