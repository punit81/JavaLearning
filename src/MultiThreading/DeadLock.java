package MultiThreading;
class Table1{
	public Integer I1=10;
	public Integer I2=20;
}
class Thread11 extends Thread{
	Table1 t;
	Thread11(Table1 t){
		this.t=t;
	}
	public void run() {
		synchronized(t.I1) {
			System.out.println("Thread 1 locked I1 for addition:");
			try{Thread.sleep(5000);}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		synchronized(t.I2) {
				System.out.println("Thread 1 locked I2 for addition:");
			}
			System.out.println("The sum of numbers is:"+(t.I1+t.I2));
		}
	}
}
class Thread2 extends Thread{
	Table1 t;
	Thread2(Table1 t){
		this.t=t;
	}
	public void run() {
		synchronized(t.I2) {
			System.out.println("Thread 2 locked I2 for Multiplication:");
			try{Thread.sleep(5000);}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			synchronized(t.I1) {
				System.out.println("Thread 2 locked I1 for Multiplication:");
			}
			System.out.println("The product of numbers is:"+(t.I1*t.I2));
		}
	}
}

public class DeadLock {

	public static void main(String[] args) {
		Table1 t=new Table1();
		Thread11 t1=new Thread11(t);
		Thread2 t2=new Thread2(t);
		t1.start();
		t2.start();
	}

}
