package heap_and_priority_queue;

import java.util.ArrayList;

public class priority_queue {

	private class Heap {
		private ArrayList<Integer> ll = new ArrayList<>();

		public void add(int item) {
			ll.add(item);
			upheapify(ll.size() - 1);
		}

		private void upheapify(int ci) {
			// TODO Auto-generated method stub
			int pi = (ci - 1) / 2;
			if (ll.get(pi) > ll.get(ci)) {
				swap(pi, ci);
				upheapify(pi);
			}

		}

		public int get() {
			return ll.get(0);

		}

		public int size() {
			return ll.size();
		}

		public void Display() {
			System.out.println(ll);
		}

		public int remove() {
			swap(0, ll.size() - 1);
			int ry = ll.remove(ll.size() - 1);
			downhepify(0);
			return ry;

		}

		private void downhepify(int pi) {
			// TODO Auto-generated method stub
			int lci = 2 * pi + 1;
			int rci = 2 * pi + 2;
			int min = pi;
			if (lci<ll.size() && ll.get(lci) < ll.get(min)) {
				min = lci;

			}
			if (rci<ll.size() && ll.get(rci) < ll.get(min)) {
				min = rci;

			}
			if (min != pi) {
				swap(min, pi);
				downhepify(min);
			}

		}

		private void swap(int i, int j) {
			int ith = ll.get(i);
			int jth = ll.get(j);
			ll.set(i, jth); // this is how we do swapping in array list
			ll.set(j, ith);

		}

	}

}

//priority queue is the inbuilt data structure
// complete binary tree - if tree ka level l hai then last level should be left
// to right filled (cbt)
// heap is of two type 1st min heap and max heap
// parent ka data if both child se small ho then it is a min heap
// and max heap mai if parent ka data is bigger than the two child then it is a
// max heap
// always check data of root
// if min heap then entire data ka min banega root
// left child 2 * parent index + 1
// left child 2 * parent index + 2
// and parent index = ci-1/2(child index)