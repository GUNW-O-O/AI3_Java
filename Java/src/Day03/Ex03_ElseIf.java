package Day03;

import java.util.Scanner;

public class Ex03_ElseIf {

	public static void main(String[] args) {

		//성적을 입력받아서, 성적에 따른 학점 A~F 를 출력 하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("성적 : ");
		int score = sc.nextInt();
		char grade = 'F';
		
		/**
		 * if
		 * 90 점 이상 , A
		 * 80 점 이상 , B
		 * 70 점 이상 , C
		 * 60 점 이상 , D
		 * 60 점 미만 , F
		 */
		
		if ( score >= 90 && score <= 100) {
			grade = 'A';
		}
		else if ( score >= 80) {
			grade = 'B';
		}
		else if ( score >= 70) {
			grade = 'C';
		}
		else if ( score >= 60) {
			grade = 'D';
		}
		else ;
		
		System.out.println("학점은 " + grade + " 입니다.");
		
		sc.close();
	}

}
