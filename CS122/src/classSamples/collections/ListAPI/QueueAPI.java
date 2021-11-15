package classSamples.collections.ListAPI;

import java.util.LinkedList;

public class QueueAPI<T> {
	
	public LinkedList<T> queue;
	
	public QueueAPI() {
		queue = new LinkedList<T>();
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
