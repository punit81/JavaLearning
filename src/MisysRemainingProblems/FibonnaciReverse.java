package MisysRemainingProblems;

import java.util.Scanner;

class Fibonacci{
	int number;
	Fibonacci(){
		number=0;
	}
	public void acceptNumber() {
		System.out.println("Enter the number N:");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();
		if(number<=0) {
			System.out.println("Invalid input...!");
		}
		else{
				System.out.println("Your series in reverse is:");
				fibonacci(this.number);
		}
	}
	private void fibonacci(int num) {
		if(num==1) {
			System.out.println(0+ " ");
		}
		else {
			int a[]=new int[num];
			a[0]=0;
			a[1]=1;
			for(int i=2;i<num;i++) {
				a[i]=a[i-1]+a[i-2];
			}
			for(int i=num-1;i>=0;i--) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
public class FibonnaciReverse {

	public static void main(String[] args) {
		
		Fibonacci fib=new Fibonacci();
		fib.acceptNumber();

	}

}
