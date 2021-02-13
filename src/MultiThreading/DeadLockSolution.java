package MultiThreading;
public class DeadLockSolution {

	public static void main(String[] args) throws InterruptedException{
		Table1 t=new Table1();
		Thread11 t1=new Thread11(t);
		Thread2 t2=new Thread2(t);
		t1.start();
		t1.join();  //wait for one thread to finish then start second thread which are working on same data
		t2.start();

	}

}
