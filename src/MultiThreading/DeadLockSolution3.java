package MultiThreading;
/*Using Inter-Thread communication i.e wait() and notify()*/
public class DeadLockSolution3 {

	public static void main(String[] args) {
		Table1 t=new Table1();
		Thread11 t1=new Thread11(t) {public void run() {
			synchronized(t.I1) {
				System.out.println("Thread 1 locked I1 for addition:");
				try{Thread.sleep(5000);}
				catch(InterruptedException e) {
					System.out.println(e);
				}
				if(!Thread.holdsLock(t.I2)) {
					try {
						t.I1.wait(); //if thread1 doesn't have lock on second object then release this acquired lock on I1 and wait for the signal 
					}
					catch(InterruptedException IE) {
						System.out.println(IE);
					}
				}
			synchronized(t.I2) {
					System.out.println("Thread 1 locked I2 for addition:");
				}
				System.out.println("The sum of numbers is:"+(t.I1+t.I2));
			}
			
		}};
		Thread2 t2=new Thread2(t) {
			public void run() {
			synchronized(t.I2) {
				System.out.println("Thread 2 locked I2 for Multiplication:");
				try{Thread.sleep(5000);}
				catch(InterruptedException e) {
					System.out.println(e);
				}
			
				synchronized(t.I1) {
					System.out.println("Thread 2 locked I1 for Multiplication:");
					System.out.println("The product of numbers is:"+(t.I1*t.I2));
					t.I1.notify(); //signaling Thread 1 that Thread2 work is over
				}
			}
		}
};
		t1.start();
		t2.start();
	}

}
