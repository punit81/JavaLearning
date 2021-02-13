package MultiThreading;
class Table{
	public synchronized void print(int n){
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try{
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

class Thrd1 extends Thread{
	Table t;
	Thrd1(Table t1){
		this.t=t1;
	}
	public void run() {
		this.t.print(5);
	}
}
class Thrd2 extends Thread{
	Table t;
	Thrd2(Table t1){
		this.t=t1;
	}
	public void run() {
		this.t.print(100);
	}
}
public class Sychronisedmethod1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Table obj=new Table();
		Thrd1 t1= new Thrd1(obj);
		Thrd2 t2=new Thrd2(obj);
		Thread.sleep(500);
		t1.start();
		t2.start();
	}

}
