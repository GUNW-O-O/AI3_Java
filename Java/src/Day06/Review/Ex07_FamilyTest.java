package Day06.Review;
class Parent {
	Parent() {
		System.out.println("Parent 1");
	}
	Parent(String str) {
		System.out.println("Parent 2");
	}
}
class Child extends Parent {
	Child() {
		System.out.println("Child 1");
	}
	Child(String str) {
		System.out.println("Child 2");
	}
}
public class Ex07_FamilyTest {
	public static void main(String[] args) {
		Child c1 = new Child();
		Child c2 = new Child("a");
	}
}
