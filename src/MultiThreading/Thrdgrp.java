package MultiThreading;
class Thrd extends Thread{
	public Thrd(ThreadGroup tg,String name) {
		super(tg,name);
	}
	public void run() {
		System.out.println(Thread.currentThread().isDaemon());
	}
}
public class Thrdgrp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup tg1= new ThreadGroup("ThreadGroup1");
		Thrd t1=new Thrd(tg1,"Thread1");
		//t1.setDaemon(true);
		tg1.setDaemon(true);
		t1.start();
	}

}
