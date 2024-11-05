package LinkedList;

public class LinkedListCycle_141_optimal_tortoiseHare_algo {

	public static void main(String[] args) {
	
		Node first=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
		Node fifth=new Node(5);
		
		
		first.next=second;								//1 ->2->3->4->5->null
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=third;
		
		Boolean detectCycle=detectCycleOptimal(first);
		
		if(detectCycle) {
	        System.out.println("Loop detected in the linked list.");

		}
		
		else             System.out.println("Loop not detected in the linked list.");

		

	}
	
	
	private static boolean detectCycleOptimal(Node head) {
		
		Node fast=head;
		Node slow=head;
		
		
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		
			
			if(slow==fast)  return true;
					
			
		}
		
		return false;
		
		
		
	}
}
