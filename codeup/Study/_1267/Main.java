package _1267;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[] = new int[a];
		
		for (int i=0; i<a; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i=0; i<a; i++ ) {
			if (arr[i]%5 == 0) {
				sum += arr[i];
			}
		}
		System.out.print(sum);
				
		sc.close();
	}
}
