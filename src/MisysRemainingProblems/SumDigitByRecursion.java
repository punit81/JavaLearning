package MisysRemainingProblems;

import java.util.Scanner;

class RecurDigitSum{
	public int Digitsum(int n) {
		if(n==0) {
			return 0;
		}
		
		return (n%10)+Digitsum(n/10);
	}
}
public class SumDigitByRecursion {

	public static void main(String[] args) {
		RecurDigitSum recur=new RecurDigitSum();
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		System.out.println("The sum of digits of number is:"+recur.Digitsum(s.nextInt()));
	}
}
