package lecture39;

public class Stack_using_Queue_Client {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		Stack_using_Queue st = new Stack_using_Queue();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.peek());

	}

}
