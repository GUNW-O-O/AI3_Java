package _1503;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = 1;
		int arr[][] = new int [n][n];
		
		boolean sw= true;
		for(int i = 0; i < arr.length; i++) {
			if(sw)
				for (int j = 0; j<arr.length; j++)
					arr[i][j] = a++;
			if (!sw)
				for ( int j = n-1 ; j>=0; j--)
					arr[i][j] = a++;
			sw = !sw;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
