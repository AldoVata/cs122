package classlab.week12;

import java.util.LinkedList;

public class StacksLL <T>{
	public LinkedList<T> stack;
	
	public StacksLL() {
		stack = new LinkedList<T>();
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();		
	}
	
	public void push(T o) {
		stack.addFirst(o);
	}
	
	public T pop() {
		return stack.removeFirst();
	}
	
	public T peek() {
		return stack.peek();
	}
	
	public String toString() {
		return stack.toString();
	}
}
