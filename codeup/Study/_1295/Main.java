package _1295;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);
        
        // 사용자로부터 입력 받기
        String input = scanner.nextLine();
        
        // 대소문자 바꾸기
        StringBuilder result = new StringBuilder();
        
        // 각 문자에 대해 대소문자 반전
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c)); // 소문자는 대문자로
            } else {
                result.append(Character.toLowerCase(c)); // 대문자는 소문자로
            }
        }

        // 결과 출력
        System.out.println(result.toString());
        
        // Scanner 객체 닫기
        scanner.close();
    }
}