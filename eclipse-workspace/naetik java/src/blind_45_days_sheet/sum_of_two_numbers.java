package blind_45_days_sheet;

public class sum_of_two_numbers {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		while (b != 0) {
			int carry = a & b; // carry nikalo
			a = a ^ b; // sum without carry
			b = carry << 1;
		}
		System.out.println(a);

	}

}

//Dono bits 1 hone par hi 1 aata hai: -> &
//Dono bits alag hone par 1 aata hai: -> ^
// why a!=0 and why b!=0  b stores carry a stores the current sum theke so b!=0 stores sum jab b==0 hoga mtlb carry =0 toh sum complete 
// a!=0 loop chalta rahega sum zero hi nai hoga 