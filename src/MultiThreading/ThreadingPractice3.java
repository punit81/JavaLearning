package MultiThreading;

public class ThreadingPractice3 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
		try {
			Thread.sleep(100);
		}
		catch(Exception e){System.out.println(e);}
		System.out.println(Thread.currentThread().getName() +":"+i);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadingPractice3 t1=new ThreadingPractice3();
		ThreadingPractice3 t2=new ThreadingPractice3();
		ThreadingPractice3 t3=new ThreadingPractice3();
		t1.start();
		Thread.sleep(500);
		t2.start();
		t3.start();
		t1.suspend();
		t2.join();
		t3.join();
		t1.resume();
}
}