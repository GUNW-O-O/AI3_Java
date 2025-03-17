package Day06.Ex03_중첩클래스;

public class NestedClass {
	
	public static void main(String[] args) {
		// 아우터 클래스인 A 객체 생성
		A a = new A();
		a.a = 10;
		a.b = 20;
		System.out.println("A의 a : "+ a.a);
		System.out.println("A의 b : "+ a.b);
		a.aMethod();
		
		// 이너 클래스인 B 객체 생성
		// *이너 객체 생성 시, 아우터 객체를 통해서 객체를 생상할 수 있다.
		A.B b = a.new B ();
		b.x = 30;
		b.y = 40;
		System.out.println("B 의 x : " + b.x);
		System.out.println("B 의 y : " + b.y);
		b.bMethod();
	}
}
