package _1356;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int empty = a-2;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a-2; j++) {
				System.out.print("*");
				if (i <= 2 && i <= a-1 ) {
					for (int k = 0; k < j; k++) {
						System.out.print(" ");
					}
				}
				 
			}System.out.println();
		}
		
	}
}
