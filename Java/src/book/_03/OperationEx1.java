package book._03;

public class OperationEx1 {

    public static void main(String[] args) {
        int myAge = 23;
        int teacherAge = 38;

        boolean value = (myAge>25);
        System.out.println(value);
        
        System.out.println(myAge <= 25);
        System.out.println(myAge == teacherAge);

        char ch;
        ch = (myAge > teacherAge) ? 'T' : 'F';

        System.out.println(ch);

        int num = 10;
        boolean isEven;

        isEven = (num%2) == 0 ? true : false;
        
        System.out.println(isEven);
    }
}
