package hashmap;

import java.util.ArrayList;

public class map_implementation<K, V> {

	class Node {
		K key;
		V value;
		Node next;
	}

	private ArrayList<Node> bukt;
	private int size = 0;

	public map_implementation(int n) {
		// TODO Auto-generated constructor stub
		bukt = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			bukt.add(null);
		}
	}

	public map_implementation() {
		// TODO Auto-generated constructor stub
		this(4);
	}

	public void put(K key, V value) {
		int idx = hashfunction(key); // sab sai phele hasfunction sai humne index mangwa lia say A,34 tha toh 1
										// reminder aah gaya mtlb index
		Node temp = bukt.get(idx); // linked list ka start mangwa lia
		while (temp != null) { // if null hua ll ka start toh kuch nai karenge if null nai hau toh traverse
								// karenge
			if (temp.key.equals(key)) // check kia ki kya joh humari given key thi A,34 voh equal hai humri linked
										// list ki key sai
				temp.value = value; // if yes then value ko update kardo aur yehi sai return kardo
			return;
		}
		temp = temp.next; // otherwise temp ko ek aage bada do

		Node nn = new Node(); // ab agar upar wala kuch nai chala mtlb hume add karna pdega toh hum add first
								// karenge ek node bana lia
		nn.key = key; // key set kardi A set kia
		nn.value = value; // value set kardi 34 set kia
		temp = bukt.get(idx); // vaaps sai temp yani linked list ka starting idx mangwa lia cuz null ho chuka
								// hoga
		nn.next = temp; // ab hume add first(kyuki agar add last karenge toh hume again puri linked list
						// mai end tk traverse karna padega then jaakar add karenge so tc badh
						// jayegi)karna hai toh a,34 so a ke next mai humne linked list ke 1st index ka
						// data put kardia
		bukt.set(idx, nn);// aur humne yeh kaha ki bhai ab joh humare starting index hoga na linked list
							// ka A ke add hone ke baad ab voh A sai start hoga
		size++; // aur size ko bada denge thats it
		// rehashing
		double lf = (1.0 * size) / bukt.size(); // but yeh na integer deh jayega hume double chahiye toh humna 1.0 value
												// sai joh double hai usse * kardenge double \integer = double
		double thf = 2.0;
		if (lf > thf) {
			rehashing();
		}

	}

	private void rehashing() {
		ArrayList<Node> new_bukt = new ArrayList<>(); // dekh ek naya arraylist banaya a name sai
		for (int i = 0; i < 2 * bukt.size(); i++) { // dugne ya double size ka 2* size
			new_bukt.add(null); // aur sab mai by default null fill kardenge
		}
		ArrayList<Node> old_bukt = bukt; // aur kya kia maine ki purane wala joh bucket tha na uske old bucket mai address daal dia  bucket ka
		bukt = new_bukt;
		size = 0; // size zero karna padega cuz ab hum pure data ko old bucket mai joh data hai usko ek ek karke put karenge inside the new bucket 
		for (Node temp : old_bukt) { //fir simply old bukt pr loop laga dia mtlb ki linked list ke start pr loop lagaya hai
			while (temp != null) { // jab tk null nai ho jaata tab tk kaam karenge
				put(temp.key, temp.value); // ab put kardenge key and value
				temp = temp.next; // aur temp ko aage move kardenge 
			}

		}

	}

	public boolean containsKey(K key) {
		int idx = hashfunction(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;

		}
		return false;
	}

	public V get(K key) {
		int idx = hashfunction(key);
		Node temp = bukt.get(idx);
		while (temp != null) {
			if (temp.key.equals(key)) {
				return temp.value;
			}
			temp = temp.next;

		}
		return null;
	}

	public V remove(K key) { // we are removing from linked list not map
		int idx = hashfunction(key); // hume kya delete karna hai voh toh abhi bhi uska index toh chahiye hoga na
		Node curr = bukt.get(idx);
		Node prev = null;
		while (curr != null) {
			if (curr.key.equals(key)) {
				break;
			}
			prev = curr;
			curr = curr.next;
		}

		if (curr == null) { // agar by chance loop chalne ke baad curr null pr hai toh kuch karna hi nai hai
							// hume by by
			return null;
		} else if (prev == null) { // remove first
			bukt.set(idx, curr.next); // array list mai curr ka next hum daal denege kyuki voh humare next node ka
										// address de raha hoga toh save kardia aur fir null kardia toh connection tut
										// gaya current .next sai hume na address milega next wale node ka(set sai hum
										// purani value ko update karte hai)
			curr.next = null;
			size--;
			return curr.value; // joh remove kia voh hume return bhi karna hai
		} else {
			prev.next = curr.next;
			curr.next = null;
			size--; // both for remove last or remove at index same code hoga
			return curr.value;
		}

	}

	public int hashfunction(K key) {
		int n = key.hashCode() % bukt.size(); // some hashcode dega yeh usko bucket ke size sai modulo karlia ek
												// reminder aah gaya hoga
		if (n < 0) { // kyuki hashcode -2^31 sai leke 2^31-1 tk unique no deh sakta hai toh hum
						// negative number ka edge case handle karna pdega
			n += bukt.size(); // if kisi bhi negative no of positive banana ho toh usko ussi sai + kardo
		}
		return n; // aur voh reminder return kardo
	}
	public int size() {
		return size();
		
	}
	
	public String toString() {
		String s = "{";
		for (Node temp : bukt) {
			while (temp != null) { 
				s=s+temp.key+"="+temp.value+", ";
				
				temp = temp.next; 
			}

		}
		s.trim(); // piche ka space delete karta tha
		return s+ "}";

	
	}

}


//	if (temp.key.equals(key)) why .equals and why not == because == in objects and classes address compare karta hai whereas .equals objects and classes mai content ko compare karta hai toh humne given ki ka content compare karnavana hai with the linked list ki key
// and baki == normally content compare karna hai jab object and classes use nai karte 
