package classlab.week12;

public class StacksQueuesDriver {

	public static void main(String[] args) {
		// create a stack of int, push 5 items, pop 3, print at each step
		StacksLL stack = new StacksLL();
		System.out.println("STACK------------");
		stack.push(1);
		System.out.println(stack);
		stack.push(2);
		System.out.println(stack);
		stack.push(3);
		System.out.println(stack);
		stack.push(4);
		System.out.println(stack);
		stack.push(5);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		
		// create a queue of string, enqueue 3 items, dequeue 2, print at each step
		QueuesLL queue = new QueuesLL();
		System.out.println("QUEUE------------");
		queue.enqueue("World");
		System.out.println(queue);
		queue.enqueue("There");
		System.out.println(queue);
		queue.enqueue("Hello");
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
		queue.dequeue();
		System.out.println(queue);
	}
}