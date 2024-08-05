package collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
public static void main(String[] args) {
	
	Queue<Integer> pq=new PriorityQueue<>();
	
	
	//Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
	//to change the priority to the largest number
	
	
	pq.offer(8);
	pq.offer(4);
	pq.offer(3);
	pq.offer(9);
	System.out.println(pq);// after adding the smallest element ia ata inder0(3)
	
	System.out.println("----------------------------------------------");
	
	pq.poll();// removes the smallest element
	System.out.println(pq);
	System.out.println("----------------------------------------------");

	System.out.println(pq.peek());//returns the next removable element i.e index 0
	
}
}
