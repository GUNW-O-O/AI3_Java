package book.sort;

import java.util.Scanner;

public class SelectSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0; i < arr.length; i++ ) {
            arr[i] = sc.nextInt();
        }
int temp = 0;
boolean sw = false;

        for( int i = 0; i < arr.length-1; i++) {
            int minind = i;
            for( int j = i; j < arr.length-1; j++ ) {
                if ( arr[i] > arr[j+1] ) {
                    temp = arr[i];
                    if ( arr[j+1] < arr[minind] ) {
                        minind = j+1;
                    }
                    sw = true;
                }
            }
            if (sw == true) {
                arr[i] = arr[minind];
                arr[minind] = temp;
            }
            sw = false;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }



        sc.close();
    }

}
