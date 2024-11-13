package LinkedList;

public class DeleteMiddleNodeOfLL_2095_BF {

	
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
		
		if(head ==null || head.next==null) return null;
		
		Node temp=head;
		
		int count=0;
		while(temp!=null) {
			
			count++;
			
			temp=temp.next;      // 1 -> 3 -> 4 -> 2 -> 5 -> 6 -> null
			
		}
		
		System.out.println(count);
		temp=head;
		
		
		int middle=count/2;
		
		System.out.println(middle);
		
		while(temp!=null) {
			
			middle--;
//			System.out.println(middle);
//			
			if(middle==0) {
				
//				Node middleNode=temp.next;
				temp.next=temp.next.next;
				
			break;	

			}
			
			
			
			temp=temp.next;
			
		}
		
		
		return head;
		
		

	}
	
}
