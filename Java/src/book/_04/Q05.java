package book._04;

public class Q05 {
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
        for (int i = 1; i < 4 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = a-2; j > 0; j--) {
                System.out.print("*");
            }System.out.println(); 
            a-=2;
        } 

    }
}