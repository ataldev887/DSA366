package lecture39;

import lecture37.Stack;

public class Queue_using_Stack {
	
	private Stack data;
	
	public Queue_using_Stack() {
		this.data = new Stack();
	}
	
	public boolean isEmpty() {
		return this.data.isEmpty();
	}
	
	public int size() {
		return this.data.size();
	}
	
	public void Enqueue(int x)throws Exception{
		this.data.push(x);
	}
	
	public int Dequeue()throws Exception {
		Stack temp = new Stack();
		while(this.data.size()!=1) {
			temp.push(this.data.pop());
		}
		int x = this.data.pop();
		while(temp.size()!=0) {
			this.data.push(temp.pop());
		}
		return x;
	}
	
	public int getFront()throws Exception {
		Stack temp = new Stack();
		while(this.data.size()!=1) {
			temp.push(this.data.pop());
		}
		int x = this.data.peek();
		while(temp.size()!=0) {
			this.data.push(temp.pop());
		}
		return x;
	}
	
}
