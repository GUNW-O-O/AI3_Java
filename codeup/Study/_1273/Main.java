package _1273;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= a; i++) {
            if (a%i == 0) {
                list.add(i);
            }
        }
        for (Integer b : list) {
            System.out.print(b + " ");
        }


        sc.close();
    }
}
