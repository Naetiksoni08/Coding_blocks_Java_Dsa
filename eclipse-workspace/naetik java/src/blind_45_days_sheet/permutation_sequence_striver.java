package blind_45_days_sheet;

import java.util.*;

public class permutation_sequence_striver {

	public static void main(String[] args) {
		int n = 3, k = 3;
		int[] fact = new int[n + 1];
		fact[0] = 1;
		for (int i = 1; i <= n; i++) {
			fact[i] = fact[i - 1] * i;
		}
//		for (int i = 1; i < fact.length; i++) {
//			System.out.print(fact[i]+" ");
//		}
//		System.out.println();

		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= n; i++) { // list mai aah gaye 1 2 3 4 5 6 7 8 9 if n = 3 then 1 2 3 kyuki permutation 123
										// sai hi banenge sare
			numbers.add(i);
		}
		k = k - 1;// k ko 0-based banao

		StringBuilder sb = new StringBuilder(); // to make the final permuation
		for (int i = n; i >= 1; i--) {
			int size = fact[i - 1]; // this means ki if n = 3 hai aur no 123 hai toh 1 sai start hone wale 2
									// permutation banenge 2 sai bhi 2 aur 3 sai start hone wale bhi 3 permutaion
									// banenge so phele voh block nikal lete hai
			int index = k/size; // isse paata chalega ki voh block size kis index mai padh raha hai jaise manle block size aya 6 theke toh 1 - 7 1 block 7 12 second so toh k jis bhi bloc mai hoga uska no fixed hoga 
			sb.append(numbers.get(index));
			numbers.remove(index);
			
			  k = k % size; // update k 

		}
		System.out.println(sb.toString());

	}

}
