package _1138;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      if(a == 0) {
         a = 1;
         System.out.println(a);
      }
      else {
         a = 0;
         System.out.println(a);
      }

      sc.close();
   }
}
