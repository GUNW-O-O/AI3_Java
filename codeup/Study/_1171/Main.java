package _1171;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int grade = sc.nextInt();
      int ban = sc.nextInt();
      int num = sc.nextInt();
      String ban0 = "";
      String num0 = "";
      if(ban < 10) {
         ban0 = "0";
         Integer.toString(ban);
         System.out.print(grade + ban0 + ban);
      }
      else if ( ban >= 10 ) {
         Integer.toString(ban);
         System.out.print(grade + ban0 + ban);
      }
      if (num < 10) {
         num0 = "00";
         Integer.toString(num);
         System.out.print(num0+num);
      }
      else if (9 < num && num < 99) {
         num0 = "0";
         Integer.toString(num);
         System.out.print(num0+num);
      }
      else System.out.print(num);
      sc.close();
   }
}
