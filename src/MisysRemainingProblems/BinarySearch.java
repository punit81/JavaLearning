package MisysRemainingProblems;

import java.util.Scanner;

public class BinarySearch {
public static int findIndex(int[] arr,int element,int startpos,int lastpos) {
	int index=-1,mid=(startpos+lastpos)/2;
	if(startpos>lastpos) {
		return index;
	}
	if(arr[mid]==element)
		return mid;
	if(arr[mid]>element)
		index=findIndex(arr,element,startpos,mid-1);
	else if(arr[mid]<element) {
		index=findIndex(arr,element,mid+1,lastpos);
	}
	return index;
	
}
	public static void search(int[] arr,int element) {
		int index=findIndex(arr,element,0,arr.length-1);
		if(index==-1) {
			System.out.println("Element not Found in the array !");
		}
		else {
			System.out.println("Element found at index:"+index);
		}
	}
public static void main(String[] args) {
	int[] arr= {2,4,7,8,9,11,15,18,54,78,105};
	System.out.println("Enter the number to be searched:");
	Scanner s=new Scanner(System.in);
	search(arr, s.nextInt());
}
}
