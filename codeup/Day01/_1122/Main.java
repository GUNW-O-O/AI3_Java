package _1122;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int hour = 0;
      int min = 0;
      if(a>=60) {
         boolean sw = true;
         while (sw) {
            a -= 60;
            hour++;
            if(a<60) {
               sw = false;
               min = a;
            }
         }
      }
      else min = a;
      Integer.toString(hour);
      System.out.println(hour + " " + min);

      sc.close();
   }
}
