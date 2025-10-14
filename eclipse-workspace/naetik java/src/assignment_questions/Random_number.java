package assignment_questions;

import java.util.Random;

public class Random_number {
	public static void main(String[] args) {
		int si = 10;
		int ei = 100;
		Random rn = new Random();
		for (int i = 0; i < 1000000; i++) {
			int item = rn.nextInt(ei-si+1)+si; // we want 10 sai 100 ke beech ka no so the bound will be 91 not 90 cuz 100-10+1
			 //but yeh abhi na 0 sai leke 90 tk ka no generate karke dega 10 number kyuki 10 tk chal raha hai loop
			 System.out.print(item+" "); // but the problem is that yeh joh hai hume 0 sai 90 tk ka no generate karke deh raha hai lekin hume chahiye tha ki 10 sai 100 tk so 0 sai 90 tha toh mujhe bas +10 krna padega so tab 0 sai 90 sai 10 sai 100 ho jayega 
			
		}

	}
}
 //joh test case hote hai na array ke voh aise hi generate hote hai ki mujhe 10 sai 10000 tk ke beech mai 10 no chhaiye 20 no chahiye ya fir 10 sai 100 tk ke beech mai 10 ki power 6 no chahiye duplicate no sai problem nai hai easily create kr sakte hai hum test case generate
//bound was 91 so yeh hume 0 sai 90 tk ka no generate karke deta but hume 10 sai 100 tk ka chahiye tha so hum usmai start add kardenge


//Note
//Merge sort:
// Average,Best,Worst case tc - n log n

// Quick sort:
// Average,Best case tc - n log n
// but 
// worst case - n^2 when ur tree is formed skewed that is 
// ex 1,2,3,4,5
// if pivot element sai sare data joh hai voh chote ho toh left mai tree banega ya fir partition ke baad data sara left mai chale jaye that is worst case
// if pivot element sai sare data joh hai voh bade ho toh right mai tree banega ya fir partition ke baad data sara right mai chale jaye that is worst case
// that is skewed tree jab ya toh sirf left ya fir sirf right side tree bane 
// so 1,2,3,4,5 iss case mai na work done natural no ka sum hoga n * n+1/2 which is n ^ 2 only is case mai time complexity will be n sqaure 
// is time complexity ko reduce karne ke liye interviewer bolega isko n log n mai lao for that we have randonmized quick sort