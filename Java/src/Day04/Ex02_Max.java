package Day04;

import java.util.Scanner;

public class Ex02_Max {

	public static void main(String[] args) {
		
		// 첫번째 주에 입력할 개수 N을 입력받고
		// 둘째 줄에 N개의 정수를 공백을 두고 입력받으시오.
		// N 개의 정수 중, 최댓값을 구하시오.
		//(입력)
		// 5
		// 90 60 70 100 55
		//(출력)
		// 최댓값 : 100
		
		/* 
		 * (순서도)
		 * 1. 정수 하나를 입력받아서 N에 대입
		 * 2. N개 요소를 갖는 배열 arr 선언 및 생선
		 * 3. N번 반복하면서 정수를 입력받아서 배열 arr에 순서대로 대입한다.
		 * 4. 배열을 반복해서 최댓값 max 배열 i 번째요소랑 비교
		 * 5. 두 요소중 더 큰 요소를 max 에 대입
		 * 6. 반복 끝나고, max 를 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 개수 : ");
//		int num = sc.nextInt();
//		int a =sc.nextInt();
//		int b =sc.nextInt();
//		int c =sc.nextInt();
//		int d =sc.nextInt();
//		int e =sc.nextInt();
//		
//		int arr1[];
//		arr1 = new int[num];
//		int arr2[] = {a,b,c,d,e};
//		int max=0;
//		
//		for (int i=0; i)
//			if (max<i) max=i
		int N = sc.nextInt(); //1
		
		int arr[] = new int[N]; //2
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); //3
		}
		//int max= Integer.MIN_VALUE; int 의 최솟값
		int max=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) //5
				max = arr[i];
		}
		System.out.println("최댓값 : " + max);
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}

}
