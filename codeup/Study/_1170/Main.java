package _1170;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      String d = "0";

      if( c < 10 ) {
         Integer.toString(c);
         System.out.print(a);
         System.out.print(b);
         System.out.print(d+c);
      }
      else{
         System.out.print(a);
         System.out.print(b);
         System.out.print(c);
      }

      sc.close();
   }
}
