package LinkedList;

public class AddNodeToLinkedList {

	
	public static void main(String[] args) {
int arr[]= {12,5,8,7};
		
		
		Node head=convertArrToLL(arr);
		
//		Node newLL=insertNodeInStart(head, 11);
//		traverseLinkedList(newLL);
//		
//		
//		Node last=insertNodeInLast(head, 11);
//		traverseLinkedList(last);
		
		Node kthposition=insertAtKthPosiiton(head,11,4);
		traverseLinkedList(kthposition);

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
	private static Node insertNodeInStart(Node head,int val) {
		
		Node temp=new Node(val,head);				//O(1)
		
//		temp.next=head;
		
		return temp;
	}
	
	
	private static Node insertNodeInLast(Node head,int val) {
		Node last=new Node(val);

		if(head==null) return last;
		
		Node temp=head;
		
		
		while(temp.next!=null) {
			
			temp=temp.next;
			
		}
		
		temp.next=last;
		
		return head;
}
	
	
	private static Node insertAtKthPosiiton(Node head,int val,int k) {
		
		Node kthPositionElem=new Node(val);
		
		if(head==null) return kthPositionElem;
		
		if(k==1) {
			kthPositionElem.next=head;
			return kthPositionElem;
		}
		
		int count=0;
		Node temp=head;
		
		Node prev=null;
		while(temp!=null) {
			count++;
			if(count==k) {
			prev.next=kthPositionElem;
			kthPositionElem.next=temp;
				
				
			break;
			}
			
			prev=temp;
			temp=temp.next;
	
		}
		
		return head;
	}
	
	
}
