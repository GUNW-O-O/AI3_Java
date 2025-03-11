package Day02;

import java.util.Scanner;
// ctrl + shift + O 한꺼번에 임포트
public class Ex09_Circle {

	public static void main(String[] args) {
		
		//상수
		// - 프로그램 실행동안 값을 변경하지않고 사용할 값
		// 상수 선언시 , 반드시 값을 초기화 해야한다.
		// - 키워드 = final
		final double PI=3.141592;
		Scanner sc = new Scanner(System.in);
		// 원의 넓이
		// (넓이) = (원주율) * (반지름)^2
		//         πr^2
		
		System.out.print("반지름 : ");
		double radius = sc.nextDouble();
		double area = PI * radius *radius;
		System.out.println("원의 넓이 : " + area );
		sc.close();
		
	}
}
