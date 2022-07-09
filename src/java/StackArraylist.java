package java;

import java.util.Stack;

public class StackArraylist {
public static void main(String[]args) {
	Stack<Object> s=new Stack<>();
	s.push(10);
	s.push(20);
	System.out.println(s.pop());
	System.out.println(s.pop());
}
}
