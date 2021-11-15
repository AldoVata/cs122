package classSamples.collections.ListAPI;

public class QueueDriver {
	public static void main(String[] args) {
		QueueAPI<String> q = new QueueAPI<String>();
		
		q.enqueue("o");
		q.enqueue("z");
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		System.out.println(q.isEmpty());
	}
}
