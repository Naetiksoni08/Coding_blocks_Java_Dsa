package recursion3;

public class lexicography_number {

	public static void main(String[] args) { // 105<21 because 1-one 2-two so o and t mai t is bigger so 21 is big one 
		// so basically we will be checking the number by dictionary wise 
		// we have to print the number from 0 to 1000 but in lexicographical way 
		int n = 1000;
		lexicography_number(n,0);

	}
	public static void lexicography_number(int n,int curr) {
		if(curr>n) {
			return;
		}
		System.out.println(curr);
		int i = 0;
		if(curr==0) {
			i=1; // we want ki jab 0 hai toh 9 times chale aur jabo 1 h toh 10 times so for that we have written this condition 
		}
		for(; i<=9; i++) {
			lexicography_number(n,curr*10+i); // adding numbers 
			//for example number 3456 and i wanna add 7 at end of the number so what i will do us 3456 * 10 = 34560+7 = 34567
		}
	}

}
