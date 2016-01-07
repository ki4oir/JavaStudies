package c;

public class C {
	public C() {
		this("", 1, 0);
	}
	public C(String s) {
		this(s,1,0);
	}
	public C(String s, int i) {
		this(s,i,0);
	}
	public C(String s, int i, double d) {
		dataField1 = new String(s);
		dataField2 = i;
		dataField3 = d;
	}
	public void method1() {
		System.out.println(dataField1 + " " + dataField2 + " " + dataField3);
	}
	public void method2(int i) {
		method2(i,"unknown");
	}
	public void method2(int i, String s) {
		dataField2 = i;
		System.out.println(i + " received from " + s);
	}
	private String dataField1;
	private int dataField2;
	private double dataField3;
	public static void main (String[] args) {
		C object1 = new C("object",100,2000),
				object2 = new C("object2"), object3 = new C();
		
		object1.method2(123);
		object1.method1();
		object2.method2(123,"object2");
		object2.method1();
		object3.method1();
	}
	

}
