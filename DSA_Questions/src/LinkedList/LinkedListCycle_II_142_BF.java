package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycle_II_142_BF {
	
	
	public static void main(String[] args) {
		Node first=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
	Node fifth=new Node(5);
		
	Node sixth=new Node(6);
	
	
	first.next=second;
	second.next=third;
	third.next=fourth;
	fourth.next=fifth;
	fifth.next=sixth;
	sixth.next=fifth;
	
	Node node=FindNodeWhereCycleBegins(first);
	
	System.out.println(node.data);
	
	}

	
	private static Node FindNodeWhereCycleBegins(Node head) {
		
		Node temp=head;
		
		Map<Node,Integer> nodeMap=new HashMap<>();
		
		
		while(temp!=null) {
			
			
			if(nodeMap.containsKey(temp)) return temp;
			
			nodeMap.put(temp, 1);
			
			temp=temp.next;
		}
		
		return null;
		
		
	}
	
	
}


	









//
//ListNode slow = head, fast = head;
//while (fast != null && fast.next != null) {
//    slow = slow.next;
//    fast = fast.next.next;
//    if (slow == fast) break;
//}
//if (fast == null || fast.next == null) return null;
//while (head != slow) {
//    head = head.next;
//    slow = slow.next;
//}
//return head;
