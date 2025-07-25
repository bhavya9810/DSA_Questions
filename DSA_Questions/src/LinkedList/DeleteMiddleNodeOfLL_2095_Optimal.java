package LinkedList;

public class DeleteMiddleNodeOfLL_2095_Optimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
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
		Node newHead=deleteMiddle(first);
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
	
	
	private static Node deleteMiddle(Node head) {
	Node fast=head;
	Node slow=head;
	
	while(fast.next!=null || fast.next.next!=null) {
		fast=fast.next.next;
		slow=slow.next;
	}
	
	slow
	
	}

}
