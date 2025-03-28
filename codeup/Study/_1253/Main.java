package _1253;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		if (b>a) {
			for (int i=a; i<=b; i++) {
				System.out.print(i + " ");
			}
		}
		else {
			for (int i=b; i<=a; i++) {
				arr.add(i);
			}
			Collections.sort(arr);
			for (Integer integer : arr) {
				System.out.print(integer + " ");
			}
		}
		
		
		
		sc.close();
	}
}
