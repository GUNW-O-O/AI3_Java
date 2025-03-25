package _1361;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int stair = 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < stair; j++) {
				if (j<i) {
					System.out.print(" ");
				}
				else System.out.print("*");
			}System.out.println();
			stair++;
		}
		
		// 02 13 24 35 46 57
		sc.close();
	}
}
