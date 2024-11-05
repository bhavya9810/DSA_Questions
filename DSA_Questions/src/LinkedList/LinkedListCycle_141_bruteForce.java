package LinkedList;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycle_141_bruteForce {

	
	
	public static void main(String[] args) {
	
		Node first=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		Node fourth=new Node(4);
		Node fifth=new Node(5);
		
		
		first.next=second;								//1 ->2->3->4->5->null
		second.next=third;
		third.next=fourth;
		fourth.next=fifth;
		
		
	Boolean detectCycle=hasCycle(first);
	
	
	if(detectCycle) {
        System.out.println("Loop detected in the linked list.");

	}
	
	else             System.out.println("Loop not detected in the linked list.");

	
	
	}
	
	
	private static Boolean hasCycle(Node head) {
		
		Node temp=head;
		
        Map<Node, Integer> nodeMap = new HashMap<>();


while(temp!=null) {
	
	if(nodeMap.containsKey(temp)) {
		
return true;
	}
	
	nodeMap.put(temp, 1);
	
	temp=temp.next;
	
	
	
}


return false;


	}
	
	
	
	
}
