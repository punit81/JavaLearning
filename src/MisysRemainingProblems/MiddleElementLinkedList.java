package MisysRemainingProblems;

import java.util.Scanner;

class Node{
	private int data;
	private Node next;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node(){
		next=null;
	}
}
class ll{
	Node head;
	ll(){
		head=null;
	}
	void insert(int data) {
		if(head==null) {
			head=new Node();
			head.setData(data);
		}
		else {
			Node n1=new Node();
			n1.setData(data);
			n1.setNext(null);
			Node c=head;
			while(c.getNext()!=null) {
				c=c.getNext();
			}
			c.setNext(n1);
		}
	}
	void delete() {
		if(head==null) {
			System.out.println("Empty List...!");
		}
		else if(head.getNext()==null){
			head=null;
		}
		else{
			Node ch=head;
			while(ch.getNext().getNext()!=null) {
				ch=ch.getNext();
			}
			ch.setNext(null);
		}
	}
	void displayList() {
		if(head==null)
			System.out.println("List is Empty....Nothing to Show..!");
		else{
			Node ch=head;
			while(ch!=null) {
				System.out.print(ch.getData()+"------>");
				ch=ch.getNext();
			}
			System.out.print("\n");
		}
	}
	void findMiddle() {
		if(head==null) {
			System.out.println("EmptyList....No Middle !");
		}
		else {
			Node slowch=head,fastch=head,prev=null;
			while(fastch!=null && fastch.getNext()!=null) {
				prev=slowch;
				slowch=slowch.getNext();
				fastch=fastch.getNext().getNext();
			}
			if(fastch==null)
			{
				System.out.println("Middle elements are:"+prev.getData()+" "+slowch.getData());
			}
			else {
				System.out.println("Middle element is:"+slowch.getData());
			}
		}
	}
}

public class MiddleElementLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ll l1=new ll();
		char ch;
		do {
			System.out.println("\n1:Insert\n2:Delete\n3:Display\n4:Find Middle\n0:Exit\nEnter your choice:");
			Scanner s=new Scanner(System.in);
			ch=s.nextLine().charAt(0);
			switch(ch) {
			case '1':System.out.println("Enter the element to be inserted:");
						l1.insert(s.nextInt());
						l1.displayList();
						break;
			case '2': l1.delete();
						l1.displayList();
						break;
			case '3': l1.displayList();
						break;
			case '4':l1.findMiddle();
						break;
			case '0':System.out.println("Thank You....!");
						break;
			default:System.out.println("Please provide a valid input...!");
			}
		}while(ch!='0');
	}

}
