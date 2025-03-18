package Day07.UpcastingEx;

public class Student extends Person {
	
	String major;
	int age = 20;
	@Override
	void work() {
	System.out.println("공부 합니다.");
	}
}
