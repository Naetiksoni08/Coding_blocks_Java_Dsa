package blind_45_days_sheet;

public class minimum_no_of_pushes_to_type_word_1 {

	public static void main(String[] args) {
		String word = "abcde";
		int n = word.length(); // 5
		int total = 0;
		for (int i = 0; i < n; i++) { // 0 sai 4 tk chalega 0,1,2,3,4
			total += (i / 8) + 1; // 0/8 = 0+1 = 1 push 1/8 = 0+1 = 1  
		}
		System.out.println(total);
	}

}

// 10 
// 0 sai 9 tk 
// 0,1,2,3,4,5,6,7,8,9
// 9/9 = 1+1 = 2 pushes 

// modulo returns remainder
// division return quotient 9/8 = 8*1 = 8 so it returns 1 cuz 8*1
// 10%2=0 because remainder is 0 

//| i  | i/8         | +1          | total |
//| :- | :---------- | :---------- | :---- |
//| 0  | 0/8 = **0** | 0+1 = **1** | 1     |
//| 1  | 1/8 = **0** | 0+1 = **1** | 2     |
//| 2  | 2/8 = **0** | 0+1 = **1** | 3     |
//| 3  | 3/8 = **0** | 0+1 = **1** | 4     |
//| 4  | 4/8 = **0** | 0+1 = **1** | **5** |

