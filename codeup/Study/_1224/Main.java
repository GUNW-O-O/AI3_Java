package _1224;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int arr[] = new int[4];
      for (int i = 0; i < 4; i++) {
         arr[i] = sc.nextInt();
      }
      int a = arr[0];
      int b = arr[1];
      int c = arr[2];
      int d = arr[3];

      double left = (double) a/b;
      double right = (double) c/d;

      if (left > right) {
         System.out.println(">");
      }
      else if ( left == right ) {
         System.out.println("=");
      }
      else {
         System.out.println("<");
      }

      sc.close();
   }
}
