package _1163;

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
		
		int saju = (year+mon+day);
		
		String sajuStr = String.valueOf(saju);
		
		 char second = sajuStr.charAt(1);
		 int secondDigit = Character.getNumericValue(second);
		 
		 char first = sajuStr.charAt(0);
		 int firstDigit = Character.getNumericValue(first);
		 
		 if (sajuStr.length() >= 4) {
			 if (second % 2 ==0) System.out.print("대박");
			 else System.out.print("그럭저럭");
		 }
		 else if (sajuStr.length() <= 3 ) {
			 if (first % 2 ==0) System.out.print("대박");
			 else System.out.print("그럭저럭");
		 }
		 
		 
	}
}
