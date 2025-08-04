package array_list;

import java.util.ArrayList;
import java.util.Collections;

public class array_list_demo {

	public static void main(String[] args) {
		// <give the data you want to keep in between>
		//ll name ka variable bana hoga 
		//you can write anything at the place of ll t can be list your name anything
		    ArrayList<Integer> ll=new ArrayList<>();//this how we initialize a array list
		    // array list is dynamic in nature 
	          // add
		    System.out.println(ll);
		    ll.add(10);
		    ll.add(1);
		    ll.add(11);
		    ll.add(12);
		    ll.add(13);
		    ll.add(14);
		    ll.add(15);
		    ll.add(17);
		    ll.add(19);
		    System.out.println(ll); 
		    // shift one element ahead and print the new element at a given index here print 7 at 1st index 
		    ll.add(1, 7); // first index and then element
		    System.out.println(ll);
		    // get 
		    // basically if we want a specific element then we will use get and we will pass the index of the number 
		    System.out.println(ll.get(3));
		    //remove
		    // if we want to remove a specific element then we can use remove method and we will again pass the index of the number we want to remove 
		    System.out.println(ll.remove(2));
		    System.out.println(ll);
		    //update
		    //if we want that 2nd index should have 19 rather than 1 then we will use update method
		    ll.set(2, 19); // first index then element 
		    System.out.println(ll);
		    
		    //size
		    //tells the size of the array
		    System.out.println(ll.size());
		    //sort in increasing order
		    Collections.sort(ll);
		    System.out.println(ll);
		    //reverse sort in decreasing order
		    Collections.reverse(ll);
		    System.out.println(ll);
		


	}

}
