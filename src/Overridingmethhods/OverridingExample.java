package Overridingmethhods;
class A{
	A method1() {
		System.out.println("in A");
		return new A();
	}
}
class B extends A{
	B method1() {
		System.out.println("in B");
		return new B();
	}
}
public class OverridingExample {

	public static void main(String[] args) {
		B b=new B();
		b.method1();

	}

}
