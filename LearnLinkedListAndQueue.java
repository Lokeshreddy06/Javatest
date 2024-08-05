package collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LearnLinkedListAndQueue {
	
	
public static void main(String[] args) {
	
	Queue<Integer> list1=new LinkedList<>();
	
	list1.offer(1);
	list1.offer(2);
	list1.offer(3);
	list1.offer(4);// adding elements
	// similar method add available which throws exception if element is added
	
	System.out.println(list1);
	System.out.println("----------------------------------------------------");
	list1.poll();//removes first inserted element(element at index 0)
	// similar method remove() available which throws exception if stack is empty
	System.out.println(list1);
	System.out.println("----------------------------------------------------");

	System.out.println("next element to remove is "+list1.peek());// returns the next element in queue to remove i.e index 0 element;

}


}
