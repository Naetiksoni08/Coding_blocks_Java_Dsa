package Stack_and_queue;

import java.util.Stack;

public class celebrity_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 0, 1, 1, 1 }, { 1, 0, 1, 1 }, { 0, 0, 0, 0 }, { 1, 1, 1, 0 } };
		System.out.println(celebs(arr));

	}
	public static int celebs(int[][]arr) {
		Stack<Integer> st= new Stack<>();
		for(int  i = 0 ; i<arr.length; i++) {
			st.push(i);
			
		}
		while(st.size()>1) {//stack ka size jab tk 1 sai bada hai tab tk loop chalega jaise hi 1 hua toh end wala celebrity ban sakta hai 
			int a = st.pop();
			int b = st.pop();
			if(arr[a][b]==1) {//that means a b ko janta hai aur a celeb nai banega 
				st.push(b);
			}else {
				st.push(a);//that means  b a ko janta hai aur b celeb nai banega 
			}
		}
		int candidate = st.pop();//last candidate ko pop kia nikal lia 
		//now we have to check that candidate if row mai 1 toh nai hai kahi par aur column mai 0 toh nai hai kahi par then voh paaka celebrity hai
		for(int i = 0 ; i<arr.length; i++) {
			if(i==candidate) { // yeh isliye llikha kyuki humme apne aap sai check nai karna ki 2,2 par 1 hai ya 0 isliye agar candidate 2 hai aur i bhi 2 hai toh skip hoga iteration 
				continue;
			}
			if(arr [candidate][i] ==1|| arr[i][candidate]==0) { //first ka mtlb hai for row mtlb row mai galti hai ek 1 hua toh that means candidate kssi ko janta hia 
				//aur 2nd or is for column aagr galti sai tujhe 0 mil gaya toh voh celeb nai hai mtlb 0,canditate  = 0 hai toh voh candiate celeb nai h 
				return -1;
				//basically humne kaha ki candidate i ko toh nai janta ya fir i candidate ko toh nai janta 
				
			}
			
			
		}
		return candidate;
		
	}
//	3 of n ban raha hai tc but kehenge usse order of n hi 

}
