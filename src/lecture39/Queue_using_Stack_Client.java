package lecture39;

public class Queue_using_Stack_Client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Queue_using_Stack qs = new Queue_using_Stack();
		qs.Enqueue(10);
		qs.Enqueue(20);
		qs.Enqueue(30);
		qs.Enqueue(40);
		qs.Enqueue(50);
		System.out.println(qs.Dequeue());
		System.out.println(qs.getFront());

	}

}
