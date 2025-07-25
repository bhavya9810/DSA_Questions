package LinkedList;

public class SortLL_Of_0_1_2_Optimal {

	
	
	public static void main(String[] args) {
		
		
		
		Node first=new Node(1);
		Node second=new Node(0);
		Node third=new Node(1);
		Node fourth=new Node(2);
		Node fifth=new Node(0);
		Node sixth=new Node(2);
		Node seventh=new Node(1);
		
		
		
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		sixth.next=seventh;
		
		
		printList(first);

		
		Node sortedNode=Segregate(first);

		printList(sortedNode);
	}
	
	private static void printList(Node head) {
		Node temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
		System.out.println();
		}
	
	
	private static Node Segregate(Node head) {

		
		
	}
	
	
}
