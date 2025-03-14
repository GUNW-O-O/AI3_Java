package _1226;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//        for (int i=0; i<=lotto.length; i++) {
//        	if (lotto[i] == hyeji[0]) {
//        		count++;
//        	}
//        }
		
		// 첫 번째 행렬은 7개의 숫자
        int[] lotto = new int[7];
        // 두 번째 행렬은 6개의 숫자
        int[] hyeji = new int[6];


        // 첫 번째 행렬에 7개 숫자 입력받기
        for (int i = 0; i < 7; i++) {
        	lotto[i] = sc.nextInt();
        }

        // 두 번째 행렬에 6개 숫자 입력받기
        for (int i = 0; i < 6; i++) {
        	hyeji[i] = sc.nextInt();
        }
        int count = 0;
        int bonus = 0;
        
        for (int i =0; i<lotto.length-1; i++ ) {
        	for (int j : hyeji) {
				if(lotto[i]==j) {
					count++;
				}
			}
		}
        int bonusLotto = lotto[lotto.length - 1];
        for (int i : hyeji) {
			if (bonusLotto == i) {
				bonus++;
			}
		}
        
        
        switch (count) {
		case 6:System.out.print(1);
			break;
		case 5:System.out.print(3);
			break;
		case 4:System.out.print(4);
			break;
		case 3:System.out.print(5);
			break;

		default:System.out.print(0);
			break;
		}
        if (count==6) {
			sc.close();
			return;
		}
		
        switch (count+bonus) {
		case 6:
			System.out.print(2);
			break;

		default:
			break;
		}
    //    System.out.println(count + " " + bonus);
       sc.close();
       
	}
}
