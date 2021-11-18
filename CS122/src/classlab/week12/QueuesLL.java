package classlab.week12;

import java.util.LinkedList;

public class QueuesLL<T> {
	
	LinkedList<T> queue;
	
	public QueuesLL() {
		queue = new LinkedList();
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public void enqueue(T o) {
		if(queue.isEmpty())
			queue.add(o);
		else
			queue.addFirst(o);
	}
		
	public T dequeue() {
		return queue.removeLast();
	}
	
	public String toString() {
		return queue.toString();
	}
}
