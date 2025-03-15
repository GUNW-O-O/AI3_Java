package _1226;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        int[] lotto = new int[7];
        int[] hyeji = new int[6];


        for (int i = 0; i < 7; i++) {
        	lotto[i] = sc.nextInt();
        }

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
        if (count==5) {
			if(count+bonus==6) {
				System.out.print(2);
				sc.close();
				return;
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
        
       sc.close();
       
	}
}
