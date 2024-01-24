package lecture37;

public class Stack {
	int top=0;
	private int []data;
	public Stack() {
		this.data = new int [5];	//agar user info nahi dega toh 5 size ka array ban jaayega			
	}
	
	public Stack(int cap) {
		this.data = new int [cap];	//user agar info dega toh
	}
	
	public boolean isEmpty() {
		return top==0;
	}
	
	public boolean isFull() {
		return this.top==this.data.length;
	}
	
	public void push(int item) throws Exception{
		if(isFull()) {
			throw new Exception("Stack overflow");
		}
		this.data[this.top]=item;
		this.top++;
	}
	
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Stack Empty");
		}
		this.top--;
		return this.data[top];
	}
	
	public int peek() {
		return this.data[top-1];
	}
	
	public int size() {
		return this.top;
	}
	
	public void Display() {
		for(int i=0;i<top;i++) {
			System.out.print(this.data[i]+" ");
		}
		System.out.println();
	}
}
