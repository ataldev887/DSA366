package lecture39;

import lecture37.Queue;

public class Stack_using_Queue {
	
	private Queue data;
	
	public Stack_using_Queue() {
		this.data = new Queue();
	}
	
	public boolean isEmpty() {
		return this.data.isEmpty();
	}
	
	public int size() {
		return this.data.size();
	}
//O(N)
	public void push(int item)throws Exception{
		Queue temp = new Queue();
		while(!this.data.isEmpty()) {
			temp.Enqueue(data.Dequeue());
		}
		this.data.Enqueue(item);
		while(!temp.isEmpty()) {
			data.Enqueue(temp.Dequeue());
		}
	}
//O(1)	
	public int pop()throws Exception{
		return this.data.Dequeue();
	}
	
	public int peek()throws Exception{
		return this.data.getfront();
	}
}
