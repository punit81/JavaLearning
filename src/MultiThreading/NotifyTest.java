package MultiThreading;
class Notify1 implements Runnable{
	public void run() {
		System.out.println("Running...."+Thread.currentThread().getName());
		synchronized(this) {
			try {
				this.wait();
				this.notify();
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+" got Notified...!");
		}
	}
}
class Notify2 implements Runnable{
	Notify1 notify1;
	Notify2(Notify1 note){
		notify1=note;
	}
	public void run() {
		System.out.println("Running...."+Thread.currentThread().getName());
		synchronized(this.notify1) {
			try {
				this.notify1.wait();
				this.notify1.notify();
			}
			catch(Exception e){
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+" got notified...!");
		}
	}
}
class Notify3 implements Runnable{
	Notify1 notify1;
	Notify3(Notify1 note){
		this.notify1=note;
	}
	public void run() {
		System.out.println("Running...."+Thread.currentThread().getName());
		synchronized(this.notify1) {
			try {
				this.notify1.notify();
			}catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+" got notified...!");
		}
	}
}
public class NotifyTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Notify1 notify1=new Notify1();
		Notify2 notify2=new Notify2(notify1);
		Notify3 notify3=new Notify3(notify1);
		Thread t1=new Thread(notify1,"Thread 1");
		Thread t2=new Thread(notify2,"Thread 2");
		Thread t3=new Thread(notify3,"Thread 3");
		t1.start();
		t2.start();
		Thread.sleep(500);
		t3.start();
	}

}
