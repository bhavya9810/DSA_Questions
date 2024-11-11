package LinkedList;
import java.util.Stack;
public class ReverseALinkedList_206_BF {

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
		Node reversed =reverseList(first);
		
		System.out.println(reversed.data);
		
		printList(reversed);
	}
	
	
	private static Node reverseList(Node head) {
		
		
		Node temp=head;
		
		Stack<Integer> nodeList=new Stack<>();
		
		while(temp!=null) {
			nodeList.push(temp.data);
			temp=temp.next;
		}
		temp=head;
		
		while(temp!=null) {
		
		temp.data=nodeList.pop();
		temp=temp.next;
			
		}
		
		
		return head;
		
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
