package _1280;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int count = 0;
        for(int i = a; i <= b; i++) {
            
            if ( i % 2 == 1){
                sum += i;
                if ( count == 0 && i % 2 == 1 ) {
                    System.out.print(i);
                }
                else if ( count > 0 ) System.out.print("+"+i);
            }
            else if ( i % 2 == 0 ) {
                sum -= i;
                System.out.print("-"+i);
            }
            count++;
        }

        System.out.print("="+sum);

        sc.close();
    }
}
