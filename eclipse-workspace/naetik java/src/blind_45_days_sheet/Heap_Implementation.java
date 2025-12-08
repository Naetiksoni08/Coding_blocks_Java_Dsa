package blind_45_days_sheet;

import java.util.*;

public class Heap_Implementation {
	private ArrayList<Integer> ll = new ArrayList<>();

	public void Add(int item) {
		ll.add(item);
		upheapify(ll.size() - 1);
	}

	private void upheapify(int child) {
		int parent = (child - 1) / 2;
		if (ll.get(parent) > ll.get(child)) {
			Swap(parent, child);
			upheapify(parent);
		}

	}

	private void Swap(int parent, int child) {
		int pith = ll.get(parent);
		int cith = ll.get(child);
		ll.set(parent, cith);
		ll.set(child, pith);
	}

	public int remove() {
		Swap(0, ll.size() - 1);
		int rv = ll.remove(ll.size() - 1);
		DownHeapify(0);
		return rv;

	}

	private void DownHeapify(int pi) {
		int mini = pi; // consider minimum as parent index right now
		int lci = 2 * pi + 1; // left child index
		int rci = 2 * pi + 2; // right child index
		if (lci < ll.size() && ll.get(lci) < ll.get(mini)) {
			mini = lci;
		}
		if (rci < ll.size() && ll.get(rci) < ll.get(mini)) {
			mini = rci;
		}
		if (mini != pi) {
			Swap(pi, mini);
			DownHeapify(mini);
		}

	}

	public int getmin() {
		return ll.get(0);

	}

	public int size() {
		return ll.size();
	}

	public void Display() {
		System.out.println(ll + " ");
	}

}
