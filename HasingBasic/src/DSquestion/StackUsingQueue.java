package DSquestion;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	
Queue<Integer> q1 = new LinkedList<Integer>();
Queue<Integer> q2 = new LinkedList<Integer>(); 

public void push(int val) {
	while(!q1.isEmpty()) {
		q2.add(q1.poll());
	}
	q1.add(val);
	
	while(!q2.isEmpty()) {
		q1.add(q2.poll());
	}
}

public int peek() {
	if(q1.isEmpty()) {
		System.out.println("Is empty");
		return -1;
	}
	return q1.peek();
}

public int pop() {
	if(q1.isEmpty()) {
		System.out.println("Stack is empty");
		return -1;
	}
	return q1.poll();
}
	
public static void main(String[] args) {	
   
	StackUsingQueue st = new StackUsingQueue();
	st.push(1);
	st.push(4);
	st.push(5);
	System.out.println(st.pop());
	System.out.println(st.peek());
	
}
}
