package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class learnArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq=new ArrayDeque<>();
		
		adq.offer(1);// adds element at last(queue method)
		adq.offerFirst(0);// adds element at first
		adq.offerLast(2);//adds element at last
		
		System.out.println(adq);
		System.out.println("------------------------------------------");

		System.out.println("peek");
		System.out.println(adq.peek());// shows first element
		System.out.println(adq.peekFirst());//shows first element
		System.out.println(adq.peekLast());//shows last element
		System.out.println("------------------------------------------");
		
		System.out.println(adq.poll());//removes first element
		System.out.println(adq);
		
		System.out.println(adq.pollFirst());//removes first element
		System.out.println(adq.pollLast());//removes last element
		
		
		
	
	}
	
}
