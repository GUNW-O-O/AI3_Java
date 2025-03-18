package Day07.UpcastingEx;

public class Main {

	public static void main(String[] args) {
		Person person = new Student();
		person.work();
		System.out.println (person.age);
	}
}
