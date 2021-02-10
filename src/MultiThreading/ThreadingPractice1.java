package MultiThreading;

public class ThreadingPractice1 extends Thread{
	/*public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("Running.....from "+Thread.currentThread().getName());
		}
	}
	*/
	public void run()  
    {    
        for(int i=1;i<600;i++)  
        {    
        /*    try  
            {  
                //Thread.sleep(500);  
            }catch(InterruptedException e){System.out.println(e);}*/    
        System.out.println(i);    
        }    
    }    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadingPractice1 t1=new ThreadingPractice1();
		//t1.run();
		t1.start();
		ThreadingPractice1 t2=new ThreadingPractice1();
		//t2.run();
		t2.start();

	}

}
