package heap_and_priority_queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class merge_k_sorted_lists {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	class Solution {
		public ListNode mergeKLists(ListNode[] lists) {
			PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {

				@Override
				public int compare(ListNode o1, ListNode o2) {
					//the reaseon why error was coming is cuz hum address ko compare nai kr sakte isliye
					return o1.val-o2.val; //vaise hona ulta chhaiye tha but hum ulta likhenge basically hume chahiye tha high to low toh o2-o1 homa chhaiye tha lekin hum ulta likhenge kyuki priority queue is the implementation of min heap and min heap says ki smaller value high priority lekin hume kehe rahe hai high value more priority 
				}
				
				
			});
			for (int i = 0; i < lists.length; i++) {
				if(lists[i]!=null) { // agar lists null nai hai tabhi hume har node ka 1st element ko push karna hai add karna hai queue mai
					pq.add(lists[i]);
				}
				

			}
			ListNode dummy = new ListNode(); // ek dummy node banai by defualt o and null hoga usmai 
			ListNode temp = dummy; // temp mai dummy node ka address save karlia mtlb root node
			while(!pq.isEmpty()) { // jab tk kaam krna hai jab tk pq empty nai ho jata 
				ListNode rv = pq.poll(); // first element ko remove kardia
				dummy.next = rv; // dummy ke next mai removed ka data attach kardenge
				dummy = dummy.next; // dummy ko ek aage bada denge this line is just like dummy++
				if(rv.next!=null) { // agar remove joh kia hai data uska next null nahi hai mtlb uske baad bhi list mai data hai 
					pq.add(rv.next); // toh add kardega tu rv.next ko 
				}
			}
			return temp.next; // at the end temp ka next return kardenge
			

		}
	}

}
