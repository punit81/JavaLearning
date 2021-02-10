package MultiThreading;

public class ThreadingPractice2 extends Thread{

	public void run() {
		Thread.currentThread().setPriority(1);
		System.out.println("Priority of "+Thread.currentThread().getName()+" is:"+Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadingPractice2 t2=new ThreadingPractice2();
		System.out.println("Priority of "+t2.getName()+" is:"+t2.getPriority());
		t2.start();
	}

}
