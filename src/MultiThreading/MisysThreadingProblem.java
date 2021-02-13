package MultiThreading;
 /*	Given two threads – OddThread & EvenThread. 
 One thread is printing even numbers and the other 
 thread is printing odd numbers.Write a program 
 to emulate the synchronization between the two threads so 
that the output should be in natural order (1,2,3,4,5....). 
Let’s assume the thread classes are already.
 */
class Thread1{
	
}
class OddThread implements Runnable{
	Thread1 th;
	int max;
	public OddThread(Thread1 th1,int max1) {
		th=th1;
		max=max1;
	}
	public void run() {
		int i;
		for(i=1;i<=max;i=i+2) {
			System.out.print(i+" ");
			synchronized(this.th){
				this.th.notify();
				try {
					if((max%2==0 && i!=max-1) || (max%2!=0 && i!=max))
						this.th.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
class EvenThread implements Runnable{
	Thread1 th;
	int max;
	public EvenThread(Thread1 th1,int max1) {
		this.th=th1;
		max=max1;
	}
	public void run() {
		int i;
		for(i=2;i<=max;i=i+2) {
			synchronized(this.th){
				try {
					//if((i%2==0 && i!=max)||(i%2!=0 && i!=max-1))
					this.th.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print(i+" ");
				this.th.notify();
			}
		}
	}
}

public class MisysThreadingProblem {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread1 t1=new Thread1();
		OddThread odd=new OddThread(t1,100);
		EvenThread even=new EvenThread(t1,100);
		Thread todd=new Thread(odd,"Odd Thread");
		Thread teven=new Thread(even,"Even Thread");
		System.out.println("Your Preferred sequence is:");
		
		teven.start();
		todd.start();
	}

}
