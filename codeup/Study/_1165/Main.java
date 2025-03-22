package _1165;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int end = 0;
		int time = 90 - a; //4
		
		if ( time %5 ==0) end = b + time/5 ;
		else end = b + time/5 +1;
		System.out.print(end);
		sc.close();
	}
}
