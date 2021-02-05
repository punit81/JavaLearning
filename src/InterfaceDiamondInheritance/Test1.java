package InterfaceDiamondInheritance;

interface a{
	default void method1(){
		System.out.println("a");
	}
}
interface c extends a{
	/*default void method1(){
		System.out.println("c");
	}*/
}
interface b extends a{
default void method1(){
		System.out.println("b");
	}
}
interface d extends b,c{
	/*default void method1(){
		System.out.println("d");
	}*/
}
class cl{
	 private void method1(){
		System.out.println("cl");
	}
}
public class Test1 implements d,a{
	/*public void method1() {
		System.out.println("Test1");
	}*/
	public static void main(String[] args) {
		Test1 t1=new Test1();
		t1.method1();
	}

}
