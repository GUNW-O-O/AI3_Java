package _1410;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		char[] symbols = input.toCharArray();
		char target = '(';
		char target2 = ')';
		int count1 = 0;
		int count2 = 0;
		
		for ( char i : symbols ) {
			if ( i == target ) {
				count1++;
			}
			if ( i == target2) {
				count2++;
			}
		}
		
		System.out.print(count1 + " " + count2);
		
		
		sc.close();
	}
}
