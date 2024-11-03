package LinkedList;

public class DeleteNodeInLinkedList {
	
	
	public static void main(String[] args) {
		
		int arr[]= {12,5,8,7};
		
		
		Node head=convertArrToLL(arr);
		
		Node start=deleteFromStart(head);
		
		
		traverseLinkedList(start);
		
//		Node end =deleteFromLast(head);
//		
//		traverseLinkedList(end);

		Node Kthelement=deleteKthElement(head,5);
		
		traverseLinkedList(Kthelement);
		
		Node element=deleteElement(head,11);

		traverseLinkedList(element);
//		System.out.println(head.data);
		
		
	}
	
	private static Node convertArrToLL(int arr[]) {
		
		Node head=new Node(arr[0]);
		
		Node mover=head;
		
		
		for(int i=1;i<arr.length;i++) {
			Node temp=new Node(arr[i]);
			mover.next=temp;
			mover=temp;
			
		}
		
		
		return head;
		
	}
	
	
	private static void traverseLinkedList(Node head) {
		
		Node temp=head;
		
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();

	}
	
	
	private static Node deleteFromStart(Node head) {
		
		if(head==null) return null;
		
		head=head.next;
		
		return head;
		
	}
	
	
private static Node deleteFromLast(Node head) {
	
	if(head==null || head.next==null) return null;
	
	Node temp=head;
	
	while(temp.next.next!=null) {
		temp=temp.next;
		
	}
	
	temp.next=null;
	
	return head;

	
	 
		
	}


private static Node deleteKthElement(Node head,int k) {
	
	if(head==null) return null;
	
	if(k==1) {

		head=head.next;
		return head;
	}
	
	int count=0;
	Node temp=head;
	Node prev=null;
	
	while(temp!=null) {
		count++;
		
		
		if(count==k) {
			prev.next=prev.next.next;
			break;
		}
		
		prev=temp;
		
		temp=temp.next;
	}
	return head;
	
}

private static Node deleteElement(Node head,int element) {
	if(head==null) return null;
	
	if(head.data==element) {
		head=head.next;
		
		return head;
	}
	
	Node temp=head;
	Node prev=null;
	while(temp!=null) {
		
		if(temp.data==element) {
			prev.next=prev.next.next;
			break;
		}
		
		prev=temp;
		temp=temp.next;
		
		
		
	}
	
	return head;
	
	
}

}
