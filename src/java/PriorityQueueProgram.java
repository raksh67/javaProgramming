package java;

import java.util.PriorityQueue;

public class PriorityQueueProgram {

	public static void main(String[] args) {
PriorityQueue<Object> q=new PriorityQueue<>();
q.add('A');
q.add('B');
q.add('C');
q.add('D');
System.out.println(q.peek());
System.out.println(q);
System.out.println(q.poll());
System.out.println(q);
	}

}

 