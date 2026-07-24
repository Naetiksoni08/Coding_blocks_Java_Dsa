package blind_45_days_sheet;

public class Delete_Node_in_a_linked_list_striver {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	class Solution {
		public void deleteNode(ListNode node) {
			node.val = node.next.val;
			node.next = node.next.next;

		}
	}
}

//
//Given:
//Linked List ka koi bhi node (head nahi diya!)
//Woh node last node nahi hai
//Karna kya hai:
//Uss node ko delete karo
//But head nahi mila tumhe!
//
//
//Normal Delete vs Yeh Question:
//Normal Delete (Head mila hai):
//
//List: 4 → 5 → 1 → 9 → null
//↑
//delete 5
//
//Step 1: 4 ke next mein 1 daalo
//4 → 1 → 9 → null
//
//Step 2: 5 ko memory se hatao (garbage)
//
//Done! 
//
//
//
//Yeh Question mein kya hai:
//	
//	
//	Tumhe sirf yeh node diya hai:
//        5 → 1 → 9 → null
//        ↑
//       node (head nahi hai, bas yeh node!)
//
//Tumhe 5 delete karna hai
//But 4 ka access nahi hai (kyunki head nahi hai)
//
//
//
//Trick: Copy Next Node's Value!
//
//
//node = 5 → 1 → 9 → null
//
//Step 1: Next node ki value copy karo
//        node.val = node.next.val
//        5 ki jagah 1 aa gaya!
//        
//        1 → 1 → 9 → null
//        ↑
//       node
//
//Step 2: Next node ko skip karo
//        node.next = node.next.next
//        1 → 9 → null
//        ↑
//       node
//
//Result: 1 → 9 → null
//
//But original list kahan gayi?
//4 → 1 → 9 → null  (5 ki jagah 1 aa gaya!)
//
//
//
//Original:  4 → 5 → 1 → 9 → null
//↑
//node (given)
//
//Step 1: Copy next value
//node.val = node.next.val
//5 becomes 1!
//
//4 → 1 → 1 → 9 → null
//↑
//node
//
//Step 2: Skip next node
//node.next = node.next.next
//
//4 → 1 ──→ 9 → null
//↑
//node (1 wala)
//
//1 → 9 → null (jo 1 tha woh delete ho gaya!)
//
//Final:  4 → 1 → 9 → null 
//
//
//
//Hum 5 ko delete nahi kar rahe!
//Hum 5 ko 1 bana rahe hain!
//Phir 1 (original) ko delete kar rahe hain!
//
//Effect: 5 gayab ho gaya! 

//
//
//BEFORE:
//4 → 5 → 1 → 9 → null
//    ↑
//   node (5 pe point kar raha hai)
//
//Step 1: node.val = node.next.val
//        5 ki jagah 1 aa gaya!
//        
//        4 → 1 → 1 → 9 → null
//            ↑
//           node (ab yeh 1st wale 1 pe hai)
//
//Step 2: node.next = node.next.next
//        // node = 1st wala 1
//        // node.next = 2nd wala 1
//        // node.next.next = 9
//        
//        node.next = 9
//        
//        4 → 1 ────────→ 9 → null
//            ↑    ↑      ↑
//           node  X    node.next
//                 |
//              2nd 1 (orphan!)
//
//Final: 4 → 1 → 9 → null 
