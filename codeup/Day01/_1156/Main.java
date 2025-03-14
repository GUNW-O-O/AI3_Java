package _1156;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rock = sc.nextInt();
		
		
		if (rock % 2 == 0) {
			System.out.println("even");
		}else System.out.println("odd");
	sc.close();
	}
}
