package DSquestion;

import java.util.Stack;

public class QueqeUsingStack {
	Stack<Integer> stack1=new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	public void enqueue(int val) {
		stack1.push(val);
	}
	
	
	public int dequeue() {
		if(stack1.isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		}
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		int val =stack2.pop();
	
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop()); 
		}
		
		return val;
	}
	

	public int peek() {
		if(stack1.isEmpty()) {
			System.out.println("stack is empty");
			return -1;
		}
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		int val =stack2.peek();
	
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop()); 
		}
		
		return val;
	}
	
	public static void main(String[] args) {
		
		QueqeUsingStack q = new QueqeUsingStack();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		
		
		int ans=q.peek();
		System.out.println(ans);
		System.out.println(q.dequeue());
		System.out.println(q.peek());

	}

}
