package MisysRemainingProblems;
class Node1{
	int data;
	Node1 next;
	Node1(){
		data=0;
		next=null;
	}
}
class LinkedList{
	Node1 head;
	void push(int data) {
		if(this.head==null) {
			this.head=new Node1();
			this.head.data=data;
			this.head.next=null;
		}
		else {
			Node1 newNode=new Node1();
			newNode.data=data;
			newNode.next=null;
			Node1 itr=head;
			while(itr.next!=null) {
				itr=itr.next;
			}
			itr.next=newNode;
		}
	}
	public void display() {
		if(this.head==null) {
			System.out.println("Nothing to Display.");
		}
		else {
			Node1 itr=this.head;
			System.out.println("Contents of the Linked List is:");
			while(itr!=null) {
				System.out.print(itr.data+"---->");
				itr=itr.next;
			}
			System.out.println("\n");
		}
	}
	public Node1 reverseLL(Node1 head) {
		if(head.next==null) {
			return head;
		}
		Node1 node=reverseLL(head.next);
		head.next.next=head;
		head.next=null;
		return node;
	}
	public void reverse() {
		if(this.head==null || this.head.next==null) {
			
		}
		else
		{
			this.head=reverseLL(this.head);
		}
	}
}
public class ReverseALinkedList {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);
		ll.push(6);
		ll.push(7);
		ll.push(8);
		System.out.println("Linked List Before reversal:");
		ll.display();
		ll.reverse();
		System.out.println("Linked List after reversal is:");
		ll.display();
	}

}
