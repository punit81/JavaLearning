package LearnCollection;
import java.util.Scanner;
import java.lang.reflect.Array;

class QueueArray{
	private int a[];
	private int lastIndex;
	private int startIndex;
	public QueueArray(){
		this.a=null;
		lastIndex=-1;
		startIndex=-1;
	}
	public void enqueue(int n) {
		if(lastIndex==-1) {
			this.a=new int[1];
			a[0]=n;
			lastIndex++;
			startIndex++;
		}
		else {
			int a1[]=this.a;
			this.a=new int[lastIndex+2];
			//System.arraycopy(a1,0,this.a,0,lastIndex);
			for(int i=0;i<a1.length;i++) {
				this.a[i]=a1[i];
			}
			lastIndex++;
			this.a[lastIndex]=n;
		}
		
	}
	public void deque() {
		if(startIndex==-1) {
			System.out.println("Queue is Empty....Nothing to Deque!");
		}
		else if(lastIndex==0) {
			this.a=null;
			startIndex=-1;
			lastIndex=-1;
		}
		else {
			int a1[]=this.a;
			this.a=new int[lastIndex]; //previous Queue length is lastIndex+1
			//System.arraycopy(a1,0, this.a, 0,lastIndex);
			for(int i=1;i<=this.a.length;i++) {
				this.a[i-1]=a1[i];
			}
			lastIndex--;
		}
	}
	public void peek() {
		if(startIndex==-1) {
			System.out.println("Empty Queue... Nothing to peek!");
		}
		else {
			System.out.println(this.a[startIndex]);
		}
	}
	public void displayQueue(){
		if(this.a==null) {
			System.out.println("Queue is empty...Nothing to Display!");
		}
		else{
			for(int a1:this.a) {
				System.out.print(a1+"----->");
			}
			System.out.print("\n");
		}
	}
}
public class QueueUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		QueueArray q=new QueueArray();
		do {
			System.out.println("\n1:Enqueue\n2:Deque\n3:Peek\n4:Display\n0:exit\nPlease Enter your choice:");
			Scanner s=new Scanner(System.in);
			ch=s.nextLine().charAt(0);
			switch(ch) {
			case '1':System.out.println("Enter a number to insert:");
					q.enqueue(s.nextInt());
					q.displayQueue();
					break;
			case '2': q.deque();
					q.displayQueue();
					break;
			case '3':q.peek();
					break;
			case '4':q.displayQueue();
					break;
			case '0': System.out.println("Thank you......!");
						break;
			default: System.out.println("Please provide a valid input..!");
			}
		}while(ch!='0');
	}

}
