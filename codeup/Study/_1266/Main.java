package _1266;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int sum = 0;
		for ( int i = 1; i <= count; i++) {
			int num = sc.nextInt();
			sum += num;
		}
		
		System.out.println(sum);
		sc.close();
	}
}
