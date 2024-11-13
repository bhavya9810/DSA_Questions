package LinkedList;

import java.util.List;
import java.util.ArrayList;


public class OddEvenLinkedList_328_BF {

	
	
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
		
		
		
		Node temp=head;
		
		List<Integer> nodeList=new ArrayList<>();
		
		while(temp!=null && temp.next!=null) {
			
			nodeList.add(temp.data);           
			temp=temp.next.next; 					//o(n/2)
			
		}
		
		
		if(temp!=null) nodeList.add(temp.data);
			
		temp=head.next;
		
		
		while(temp!=null && temp.next!=null) {
			
			nodeList.add(temp.data);
			
			temp=temp.next.next;			//o(n/2)
		}
		
		if(temp!=null) nodeList.add(temp.data);
		
		
		int i=0;
		temp=head;
		
		System.out.println("going for adding in the ll");
		
		while(temp!=null) {
			temp.data=nodeList.get(i);
			
			i++;
			temp=temp.next;			//o(n)
		}
		
//		System.out.println(temp.next.data);
		
		return head;
		
		
		
	}
	
	
}
