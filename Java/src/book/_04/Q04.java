package book._04;

public class Q04 {

    public static void main(String[] args) {
       
        int a = 7;

        for (int i = 1; i <= a; i += 2) {
            for (int j = 0; j < (a - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }System.out.println();
        }
        
    }
}