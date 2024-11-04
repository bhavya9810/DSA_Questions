package LinkedList;

public class MiddleOfLinkedList_876_bruteForce {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,7};
		
		Node head=convertArrToLL(arr);		
		Node middleNode=findMiddleNodeElement(head);
		
		System.out.println(middleNode.data);
			
		}
	
	
	private static Node findMiddleNodeElement(Node head) {
		
		if(head==null||head.next==null) return null;
		
		Node temp=head;
		int count=0;
		while(temp!=null) {
			
			count++;
			temp=temp.next;
		}
		
		temp=head;
		int middleNode=count/2+1;
		while(temp!=null) {
			
			middleNode--;
			
			if(middleNode==0) break;
			
			temp=temp.next;
		}
		
		return temp;
		
		
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
	
	
	

}
