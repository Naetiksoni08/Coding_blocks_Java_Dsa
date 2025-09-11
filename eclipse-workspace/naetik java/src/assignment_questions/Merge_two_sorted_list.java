package assignment_questions;

public class Merge_two_sorted_list {

	class ListNode {
		int val;
		ListNode next;
		
	
		ListNode() {
			this.val = val;
			this.next = null;
		}
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode Dummy = new ListNode(-1); // ek dummy node banaya
		ListNode temp = Dummy; // dummy node ka address temp mai daal dia
		while (l1 != null && l2 != null) { // if dono mai kopi bhi null hota hai toh tab tk loop chalega
			if (l1.val < l2.val) { // agar l1 chota hai l2 sai
				temp.next = l1; // toh dummy ke next mai l1 daaldo
				l1 = l1.next; // aur li ka pointer bhi aahge badahao
				temp = temp.next; // dummy ka bhi pointer aahgai badhao
			} else {
				temp.next = l2;
				l2 = l2.next;
				temp = temp.next;
			}

		}
		if(l1==null) {
			temp.next = l2; // if dono mai sai koi bhi null hui list toh uske dusri wali list ke remaining data or elements ko push kardo dummy ke next mai 
		}
		if(l2==null) {
			temp.next = l1;
		}
		return Dummy.next; // end mai tum bas temp ka next return kardo
		

	}

}
