package Lecture29;

public class QueueClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.Enqueue(1);
		q.Enqueue(2);
		q.Enqueue(3);
		q.Enqueue(4);
		q.Enqueue(5);
		
		q.display();
		System.out.println();
		
		q.Deque();
		q.Deque();
		q.display();
		System.out.println();
		q.Enqueue(10);
		q.Enqueue(20);
		
		q.display();
		
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
		
	}

}
