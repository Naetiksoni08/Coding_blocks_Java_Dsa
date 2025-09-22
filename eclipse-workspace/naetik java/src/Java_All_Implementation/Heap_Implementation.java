package Java_All_Implementation;

import java.util.*;

public class Heap_Implementation {
	private ArrayList<Integer> ll = new ArrayList<>(); // min heap implementation

	public void Add(int item) {
		ll.add(item);
		upheapify(ll.size() - 1); // idx bhej dia uss element ka

	}

	private void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		if (ll.get(pi) > ll.get(ci)) {
			swap(pi, ci);
			upheapify(pi);
		}

	}

	private void swap(int pi, int ci) {
		int pith = ll.get(pi);
		int cith = ll.get(ci);
		ll.set(pi, cith);
		ll.set(ci, pith);

	}

	public int remove() {
		swap(0, ll.size() - 1); // swap 0 and last element data
		int rv = ll.remove(ll.size() - 1); // now remove the last element
		downheapify(0); // now we need to maintain the heap
		return rv;
	}

	private void downheapify(int pi) {
		int lci = 2 * pi + 1; // left child index
		int rci = 2 * pi + 2; // right child index
		int mini = pi; // 3 elements mai sai parent ko minimum maan lia
		if (lci < ll.size() && ll.get(lci) < ll.get(mini)) {
			mini = lci; // agar lci chota hai parent sai toh minimum idx is lci

		}
		if (lci < ll.size() && ll.get(rci) < ll.get(mini)) { // aur lci ya fir rci dono size sai chote hone chhaiye
			mini = rci;
			// agar rci chota hai parent sai toh minimum idx is rci

		}
		if (mini != pi) { // joh humnai parent phele set kia tha agar uss parent ki value change hui hai
							// toh that means ki left ya right child mai sai koi ek child chota hai humare
							// parent sai toh hum bas parent ki aur updated minimum value ko swap kardenge
			swap(pi, mini);// pi ki jagah par updated minimum rakhdo
		}

	}

	public int get() {
		return ll.get(0);
	}

	public void display() {
		System.out.println(ll);
	}

	public int size() {
		return ll.size();
	}
}

//public class Heap_Client {
//public static void main(String[] args) {
//Heap_Formation heapFormation = new Heap_Formation();
//heapFormation.add(10);
//heapFormation.add(20);
//heapFormation.add(30);
//heapFormation.add(1);
//heapFormation.add(5);
//heapFormation.add(7);
//heapFormation.add(3);
//heapFormation.add(2);
//heapFormation.add(-4);
//heapFormation.display();
//System.out.println(heapFormation.remove());
//heapFormation.display();
//}
//}
