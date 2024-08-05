package collections;

import java.util.Stack;

public class LearnStack {
public static void main(String[] args) {
		
	
	Stack<String> animal=new Stack<>();
	
	animal.push("lion");
	animal.push("cat");
	animal.push("dog");
	animal.push("tiger");// adding elements at last
	
	System.out.println("stack: "+animal);
	
	System.out.println("------------------------------------------");
	
	System.out.println("top element "+animal.peek());// shows the top element
	
	System.out.println("------------------------------------------");

	animal.pop();// removes last pushed element
	System.out.println(animal);
	
	animal.remove(String.valueOf("cat"));
	System.out.println(animal);


	
	
	
	
	
	

	
}
}
