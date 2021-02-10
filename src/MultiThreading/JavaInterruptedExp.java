package MultiThreading;

import java.util.Stack;

public class JavaInterruptedExp extends Thread   
{   
    public void run()   
    {   System.out.println("is thread "+Thread.currentThread().getName()+" interrupted..: "+Thread.interrupted());
        for(int i=1;i<=5000;i++)   
        {   
           // System.out.println("doing task....: "+i);
        	int c=i*i;
        }   
        System.out.println("is thread "+Thread.currentThread().getName()+" interrupted..: " +Thread.interrupted());
        System.out.println("is thread "+Thread.currentThread().getName()+" interrupted..: " +Thread.interrupted());
    }   
    public static void main(String args[])throws InterruptedException   
    {   
        JavaInterruptedExp t1=new JavaInterruptedExp();   
        JavaInterruptedExp t2=new JavaInterruptedExp();   
        // call run() method   
        t1.setName("t1");
        t2.setName("t2");
        t1.start();   
        t1.checkAccess();
        t2.start();    
        // interrupt thread t1   
        Thread.sleep(0,250);
        t1.interrupt();   
 //       System.out.println("is thread t2 interrupted..: "+t2.interrupted());   
    }  
}  