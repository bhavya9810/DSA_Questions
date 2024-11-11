package LinkedList;

public class ReverseALinkedList_206_Iterative_optimized {
	
	
	public static void main(String[] args) {
		
		Node first=new Node(1);
		Node second=new Node(2);  //1 2 3 4 5  -> 5 4 3 2 1
		Node third=new Node(3);
		Node fourth=new Node(4);
		Node fifth=new Node(5);
		
		
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		printList(first);
		
		Node list=reverseLL(first);
		printList(list);

		System.out.println(list.data); 
		
	}					
//        	   		                      fro
//		   	 	 1 -> 2 -> 3 -> 4 -> 5 -> null

//	null   <- 1  <-   2 <- 3 <- 4 <- 5
//				          	        prev temp	
	private static Node reverseLL(Node head) {
		
		Node temp=head,prev=null;
		
		while(temp!=null) {
			Node front=temp.next;
			temp.next=prev;
			prev=temp;
			temp=front;
			
		}
		
		
		return prev;
		
	}
	
	private static void printList(Node head) {
		
		Node temp=head;
		
		while(temp!=null) {
			
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		
		System.out.println("null");
		
		
	}

}
