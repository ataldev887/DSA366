package lecture37;

public class Queue{
	private int []data;
	private int front =0;
	private int size =0;
	
	public Queue() {
		this.data = new int[5];
	}
	
	public Queue(int cap) {
		this.data = new int[cap];
	}
	
	public boolean isEmpty() {
		return this.size==0;
	}
	
	public boolean isFull() {
		return this.size==this.data.length;
	}
	
	public int size() {
		return this.size;
	}
	
	public void Enqueue(int item) throws Exception{
		if(isFull()) {
			throw new Exception("Queue full hai");
		}
		int i=(this.size+this.front)%this.data.length;
		this.data[i]=item;
		this.size++;
	}
	
	public int Dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue khaali hai");
		}
		int rv = this.data[this.front];
		this.front=(this.front+1)%this.data.length;
		this.size--;
		return rv;
	}
	
	public int getfront() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue khaali hai");
		}
		return this.data[this.front];
	}
	
	public void Display() {
		for(int i=0;i<size;i++) {
			int idx = (this.front+i)%this.data.length;
			System.out.print(this.data[idx]+" ");
		}
		System.out.println();
	}
	
}