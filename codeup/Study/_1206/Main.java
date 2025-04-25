package _1206;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c;
      int sum = 0;
      if( a > b ) {
         if(a%b == 0) {
            c = a/b;
            sum = b*c;
            System.out.println(b+"*"+c+"="+sum);
         }else System.out.println("none");
      }
      if (a<b) {
         if(b%a==0) {
            c = b/a;
            sum = a*c;
            System.out.println(a+"*"+c+"="+sum);
         }else System.out.println("none");
      }
      if (a==b) {
         if(b%a==0) {
            c = b/a;
            sum = a*c;
            System.out.println(a+"*"+c+"="+sum);
         }else System.out.println("none");
      }



      sc.close();
   }
   
}
