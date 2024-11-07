package LinkedList;
import java.util.Stack;
public class PalindromeLinkedList_234_BF {

	
	public static void main(String[] args) {
		

		Node first=new Node(1);
		Node second=new Node(2);
//		Node third=new Node(3);
//		Node fourth=new Node(2);
//	Node fifth=new Node(4);
		
	
	
	first.next=second;
//	second.next=third;
//	third.next=fourth;
//	fourth.next=fifth;
	
	System.out.println(checkPalindrome(first));
		
	}
	
	
	private static boolean checkPalindrome(Node head) {
	
		Node temp=head;
		
		Stack<Integer> nodeStack=new Stack<>();
		
		while(temp!=null) {
			
			nodeStack.push(temp.data);
			
			temp=temp.next;
			
		}
		
		temp=head;
		
		while(temp!=null) {
			if(temp.data!=nodeStack.peek()) return false;
			
			temp=temp.next;
			nodeStack.pop();
		}
		
		
		return true;
		
	}
}
