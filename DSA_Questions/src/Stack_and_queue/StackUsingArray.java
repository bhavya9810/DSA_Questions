package Stack_and_queue;

public class StackUsingArray {
	
	public static void main(String[] args) {
		
		
		stackImpl stack=new stackImpl();
		
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		
		
		System.out.println("Top of stack "+stack.peek());
		System.out.println("pop operation "+stack.pop());
		System.out.println("pop operation "+stack.pop());
		System.out.println("size of stack "+stack.size());
		
		
		
	}
	
	
	

}


class stackImpl{
	
	int top=-1;
	int stackArr[]=new int[10];
	
	void push(int x) {
		
		if(top>=stackArr.length) {
			System.out.println("stack overflow, cannot add element: "+x);
			return;
		}
		
		top++;
		stackArr[top]=x;
		
	}
	
	int peek() {
		
		if(top ==-1) {
			System.out.println("Stack is Empty, no element to return ");
			return -1;
		}
		return stackArr[top];
	}
	
	int pop() {
		
		
		if(top==-1) {
			System.out.println("Stack is empty, no element to return");
			return -1;
		}
		
		int x= stackArr[top];
		top--;
		return x;
	}
	
	int size() {
		
		return top+1;
	}
	
	
}
