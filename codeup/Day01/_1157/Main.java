package _1157;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float ball = sc.nextFloat();
		
		if(ball<=60 && ball>=50) {
			System.out.println("win");
		}else System.out.println("lose");
		
		
	}
}
