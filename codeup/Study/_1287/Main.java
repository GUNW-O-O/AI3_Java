package _1287;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		n = sc.nextInt();
		int rep = 0;
		for(int i = 1; i<10; i++) {
			rep = n*i;
			for (int j = 1; j <=rep; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
