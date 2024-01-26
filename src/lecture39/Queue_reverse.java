package lecture39;

import lecture37.Queue;

public class Queue_reverse {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		Queue dq = new Queue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		dq.Display();
		System.out.println("**********");
		Reverse(dq);
		dq.Display();
	}	
	private static void Reverse(Queue dq) throws Exception {
		if(dq.isEmpty()) {
			return;
		}
		int x = dq.Dequeue();
		Reverse(dq);
		dq.Enqueue(x);
	}

}
