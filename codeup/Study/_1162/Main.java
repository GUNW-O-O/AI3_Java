package _1162;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));	
		
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int mon = sc.nextInt();
		int day = sc.nextInt();
		
		int saju = (year-mon+day);
		
		if (saju%10 ==0) {
			System.out.print("대박");
		}
		else System.out.print("그럭저럭");
		sc.close();
	}
}
