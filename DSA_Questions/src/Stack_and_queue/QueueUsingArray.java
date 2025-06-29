package Stack_and_queue;

public class QueueUsingArray {

	public static void main(String[] args) {
		
		QueueImpl queue=new QueueImpl();
		
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);
		queue.push(6);
		queue.push(7);
		
		
		System.out.println("top element "+queue.peek());
		System.out.println("pop element "+queue.pop());
		System.out.println("pop element "+queue.pop());
		System.out.println("pop element "+queue.pop());
		System.out.println("top element "+queue.peek());
		System.out.println("size of queue "+queue.size());
		
		
	
}
}

class QueueImpl{
	
	private int queue[];
	private int start,end,currSize,maxSize;
	
	
	public QueueImpl(){
		maxSize=7;
		queue=new int[maxSize];
		start=-1;
		end=-1;
		currSize=0;
	}
	
	public QueueImpl(int maxSize) {
		this.maxSize=maxSize;
		queue=new int[maxSize];
		start=-1;
		end=-1;
		currSize=0;
	}
	
	public void push(int x) {
		
		if(currSize==maxSize){
			System.out.println("queue is full..");
			System.exit(1);
		}
		
		if(end==-1) {
			start=0;
			end=0;
		}
		else {
			end=(end+1)%maxSize;
		}
		
		queue[end]=x;
		currSize++;
	}
	
	public int pop() {
	
		if(start==-1) {
			System.out.println("queue is empty..");
			System.exit(1);
		}
		
		int popped=queue[start];
		
		if(currSize==1) {
			start=end=-1;
		}
		else {
			start=(start+1)%maxSize;
		}
		currSize--;
		return popped;
		
		
		
	}
	
	public int peek() {
		
		if(start==-1) {
			System.out.println("queue is empty..");
			System.exit(1);
		}
		
		return queue[start];
	}
	
	public int size() {
		return currSize;
	}
	
	
	
	
}
