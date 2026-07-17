package blind_45_days_sheet;

import java.util.*;

public class pascal_triangle {

	public static void main(String[] args) {
		int numrows = 5;
		List<List<Integer>> result = new ArrayList<>(); // this will store our final answer theke
		for (int i = 0; i < numrows; i++) { // 5 tk chalaya 0 sai 4 mtlb 
			List<Integer> row = new ArrayList<>(); // har ek numrow ke liye ek individual row banao joh store karegi 1 4 6 4 1 
			for (int j = 0; j <= i; j++) { //because zero based indexing hai agar row 4 hai toh voh store karega 4+1 = 5 elements ko so isliye loop chalega 0,1 2 3 4 tk <= that why 
				if (j == 0 || j == i) { // agar first aur last element hai toh fir 1 daal do 
					row.add(1); // daal diya 1 
				}else {
					int val = result.get(i-1).get(j-1)+result.get(i-1).get(j); // center wale values ko calc karo from this formula val milegi jaise niche samjhaya hai 
					row.add(val); // ab uss particular i par rakhdo element bas jaise last row ke 1st 4 ke liye karnege 
				}
				
			}
			result.add(row); // bas jab 1 4 6 4 1 ban gai hai toh fir result mai add kardo thats it 
		}
		System.out.println(result);
	}

}


// 1 // 0 row
//1 1 // 1 row
//1 2 1 // 2 row
//1 3 3 1 //3 row 
//1 4 6 4 1 // 4 row
// ab dekh mai baat kar raha hu row 4 ki last row ki last row ke 1st 4 ki so that is 4,1 theke sb dekh 
// yeh joh 4 hai yeh kese bana kin 2 elements ko plus karke 1 and 3  = 4 right so ab 1 and 3 ka index nikal 
// 3rd row ka 0 element and 3rd row ka 1 st element so t[3][0]+t[3][1] right ab dekh if j==0 then 1 rakh do rakdia 1+3 = 4 theke ab 
// isko formula mai convert karte hai hume jaan na hai 4 kese bana (4th row ka) result.get(4-1).(1-1) + result.get(4-1).(1) thats it simple 