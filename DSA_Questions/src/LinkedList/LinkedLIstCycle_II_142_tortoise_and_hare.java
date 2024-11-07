package LinkedList;

public class LinkedLIstCycle_II_142_tortoise_and_hare {

	
	
	public static void main(String[] args) {
		
		
		Node first=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
	Node fifth=new Node(5);
		
	Node sixth=new Node(6);
	
	
	first.next=second;
	second.next=third;
	third.next=fourth;
	fourth.next=fifth;
	fifth.next=sixth;
	sixth.next=third;
	
Node node=findFirstNodeInLoop(first);
	System.out.println(node.data);
	
	}


private static Node findFirstNodeInLoop(Node head) {
	
	
	Node slow=head;
	Node fast=head;
	
	boolean foundCycle=false;
	
	while(fast!=null && fast.next!=null) {
		
		slow=slow.next;
		fast=fast.next.next;
		
		if(slow==fast) {
			foundCycle=true;
			break;
		}
		
	}
	
	if(!foundCycle) return null;
	
	fast=head;
	
	while(slow!=fast) {
		fast=fast.next;
		slow=slow.next;
	}
	return slow;

}

}
