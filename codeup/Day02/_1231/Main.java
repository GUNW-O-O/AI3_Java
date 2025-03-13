package _1231;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // 수식을 입력받음

        // 입력된 문자열에서 '+' 기호를 기준으로 분리
		String[] parts = input.split("(?=[-+*/])|(?<=[-+*/])");
        // 각 부분을 정수로 변환
		double num1 = Integer.parseInt(parts[0].trim()); // 첫 번째 숫자
        String operator = parts[1].trim(); // 연산자
        double num2 = Integer.parseInt(parts[2].trim()); // 두 번째 숫자
		
		double result;
		if (operator .equals("*") ) {
			result = (int)(num1*num2);
			System.out.println((int)result);
		}else if (operator .equals("+")) {
			result = (int)(num1+num2);
			System.out.println((int)result);
		}else if (operator .equals("-")) {
			result = (int) (num1-num2);
			System.out.print((int)result);
		}
		 if (operator.equals("/")) {
			 result = num1 / num2;
            System.out.printf("%.2f", result);
		 }
		
		
	}

}
