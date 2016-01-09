package c3;

class C3 {
	public static int n = 0;
	public int m = 0;
	public C3() {
		n++; m++;
	}
	public void display() {
		System.out.println(n + " " + m);
	}
	public static void main(String[] args) {
		C3 c1 = new C3();
		c1.display(); // prints 1 1
		C3 c2 = new C3();
		c1.display(); //prints 2 1
		c2.display(); //prints 2 1
		
		C3.n = 10;
		c1.display();
		c2.display();
		c1.m = 11;
		c2.m = 12;
		C3.n = 14; //c2.n = 14; //this static field C3.n should be accessed in a static way
		c1.display();
		c2.display();
		C3.n = 16;
		c1.display();
		c2.display();
		//note that the class name, C3, is used to access n and the object name is used to access m.
	}

}
