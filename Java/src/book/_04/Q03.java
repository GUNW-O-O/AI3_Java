package book._04;

public class Q03 {

    public static void main(String[] args) {
    
        int dan;
		int times;
		
		for(dan = 2; dan <= 9; dan++){
			for(times = 1; times <= 9; times++){
				if( times > dan) break;
				System.out.println(dan + "*" + times + "=" + dan * times);
			}
			System.out.println();
		}

    }
}
