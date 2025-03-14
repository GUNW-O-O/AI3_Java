package _1149;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (b>a) {
			System.out.print(b);
		}
		else if (a>b) {
			System.out.print(a);
		}
		sc.close();
	}

}
