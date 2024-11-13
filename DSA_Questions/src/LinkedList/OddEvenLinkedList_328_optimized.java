package LinkedList;

public class OddEvenLinkedList_328_optimized {

	
	
	public static void main(String[] args) {
		Node first=new Node(1);
		Node second=new Node(3);
		Node third=new Node(4);
		Node fourth=new Node(2);
		Node fifth=new Node(5);
//		Node sixth=new Node(6);
		
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
//		fifth.next=sixth;
		printList(first);
		Node newHead=oddEvenList(first);
//		System.out.println(modified);
		printList(newHead);
	}
	
	private static void printList(Node head) {
		Node temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
		System.out.println();
		}
	
	private static Node oddEvenList(Node head) {
		
		if(head==null || head.next==null) return head;
	
	Node temp=head;
	Node odd=head;
	Node even=head.next;
	Node evenHead=head.next;
	
	while(even!=null && even.next!=null) {
		odd.next=odd.next.next;
		odd=odd.next;						//TC-o(N)  
		even.next=even.next.next;			//SC-o(1)		
		
		even=even.next;
	}
	
	odd.next=evenHead;
	
	return head;
	
	}
}
