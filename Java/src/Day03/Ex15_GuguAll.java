package Day03;

public class Ex15_GuguAll {
	public static void main(String[] args) {
		//(단)X(1~9)
		// 단에 대한 반복 : 1~9
		// 각 단의 곱 	: 1~9
		
		// 중첩 반복문 (이중 반복문)
		// * 안쪽 반복문이 먼저 다 돌고, 바깥쪽의 반복문의 반복변수가 증감된다.
		for (int i = 1; i <= 9 ; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j+"X"+i+"="+j*i);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
