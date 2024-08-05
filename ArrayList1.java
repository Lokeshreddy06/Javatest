package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
public static void main(String[] args) {
	ArrayList<String> arraylist=new ArrayList<>();
	
	arraylist.add("lokesh");
	//System.out.println(arraylist);
	
	ArrayList<Integer> num=new ArrayList<Integer>();
	
	num.add(1);
	num.add(2);
	num.add(3);
	System.out.println(num);
	num.add(4);
	
	num.add(1, 5);// adding at specific index
	System.out.println(num);
	
	System.out.println("---------------------------------------------");
	
	List<Integer> num1=new ArrayList<>();
	num1.add(10);
	num1.add(20);
	
	num.addAll(num1); // added num1 list to num list
	System.out.println("added another list "+num);
	
	
	num.addAll(1,num1);// added num1 list at index1 of num list
	System.out.println("added num1 list at index1 of num list"+ num);
	
	System.out.println("---------------------------------------------");
	
	System.out.println("get at index 2 - "+num.get(2));// element at index 2
	
	System.out.println("---------------------------------------------");
	
	System.out.println("before remove"+num);
	num.remove(1);// remove element at index 1
	System.out.println("after remove"+num);
	
	
	System.out.println("---------------------------------------------");
	
	 num.remove(Integer.valueOf(20));// remove 20 from the list
	 System.out.println("after removing value 20 from the list"+num);
	 
	 // num.clear();
	 // System.out.println(num);
	 System.out.println("---------------------------------------------");
	 
	 num.set(5, 15);// change element at index 5 to 15
	 System.out.println("change element at index 5 to 15 "+num);
	 
	 System.out.println("---------------------------------------------");
	 
	 System.out.println("contains "+num.contains(15));// checking weather 15 is present in list
	 
	 
	 System.out.println("---------------------------------------------");
	 
	 
	 for(int i=0;i<num.size();i++) {
		 System.out.println("for loop elemet at index"+i+" is "+num.get(i));
	 }
	 
	 System.out.println("---------------------------------------------");
	 
	 
	 for(int a:num) {
		 System.out.println("foreach element "+a);
	 }
	 
	 
	 System.out.println("---------------------------------------------");
	 
	 
	 Iterator<Integer> iterator=num.iterator();
	 
	 while(iterator.hasNext()) {
		 System.out.println("Iterator elements "+iterator.next());
	 }
}
}
