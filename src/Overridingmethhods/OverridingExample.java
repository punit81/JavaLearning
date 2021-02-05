package Overridingmethhods;
class A{
	A method1() {
		System.out.println("in A Method 1");
		return new A();
	}
	public void method2() {
		System.out.println("in A method 2");
		//return new A();
	}
}
class B extends A{
	B method1() {
		System.out.println("in B method 1");
		return new B();
	}
	public void method2() {
		System.out.println("in B method 2");
		//return new A();
	}
}
public class OverridingExample {

	public static void main(String[] args) {
		B b=new B();
		b.method1();

	}

}
