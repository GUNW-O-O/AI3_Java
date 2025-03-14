package _1158;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ball = sc.nextInt();
		
		if(30<=ball && ball<=40) {
			System.out.println("win");
		}
		else if (60<=ball && ball<=70) {
			System.out.println("win");
		}
		else System.out.println("lose");
	sc.close();
	
	}
}
