package c2;

public class C2 {
	public void f1() {
		System.out.println("f1()");
	}
	static public void f2() {
		System.out.println("f2()");
	}
	public static void main(String[] args) {
		C2 c = new C2();
		c.f1();
		C2.f2();
	}

}
