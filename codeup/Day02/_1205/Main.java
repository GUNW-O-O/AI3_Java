package _1205;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		float sum1 = (float)a + b;
		float sum2 = (float)a * b;
		float sum3 = (float)(Math.pow(a, b));
		float sum4 = (float)(Math.pow(b, a));
		float sum5 = (float)a / b;
		float sum6 = (float)b / a;
		float sum7 = (float)a - b;
		float sum8 = (float)b - a;
		
		float sum[] = {sum1, sum2, sum3, sum4, sum5,sum6,sum7,sum8};
		float max= sum[0];
		
		for(int i=0; i<sum.length; i++) {
			if (sum[i] > max) {
				max=sum[i];
			}
		}
		System.out.printf("%f" ,max);
		
	}
}
