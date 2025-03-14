package _1161;


import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a%2 == 0) {
			String c = "짝수";
			System.out.print(c);
		}
		else {
			String c = "홀수";
			System.out.print(c);
		}
		System.out.print("+");
		if (b%2 == 0) {
			String d = "짝수";
			System.out.print(d);
		}
		else {
			String d = "홀수";
			System.out.print(d);
		}
		System.out.print("=");
		int num = a+b;
		if ( num % 2 == 0 ) {
			System.out.print("짝수");
		}
		else {
			System.out.print("홀수");
		}
		sc.close();
	}

}
