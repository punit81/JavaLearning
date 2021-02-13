package MultiThreading;
public class VolatileExample extends Thread{
	volatile boolean b=true; //remove volatile and this program will never terminate
	public void run() {
		int count=0;
		while(b) {
			count++;
		}
		//System.out.println("Thread terminated."
			//	+ count); 
	}
	public static void main(String[] args)throws InterruptedException {
		VolatileExample v=new VolatileExample();
		v.start();
		Thread.sleep(5000);
		v.b=false;
		v.join();
		System.out.println("Main Method finished...!");
	}
}