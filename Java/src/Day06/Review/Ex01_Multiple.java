package Day06.Review;

import java.util.Scanner;

public class Ex01_Multiple {
	
	public static void main(String[] args) {
		//-프로그램 실행 시, 가장 먼저 실행되는 메소드
		
		//정수 하나를 입력받아서
		//입력받은 수가 3의 배수인지 아닌지,
		//판단하고 그여부를 출력하는 프로그램을 작성하시오.
		// -3의 배수 0 : "3의 배수 입니다."
		// -3의 배수 X : "3의 배수가 아닙니다."
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if ( n%3 == 0) {
			System.out.println("3의 배수 입니다.");
		}
		if ( n%3 != 0) {
			System.out.println("3의 배수가 아닙니다.");
		}
		sc.close();
	
	}
}
