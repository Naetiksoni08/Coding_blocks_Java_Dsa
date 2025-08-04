package Stack_and_queue;

import java.util.Stack;

public class construct_smallest_number_from_DI_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "IIIDIDDD";
		System.out.println(smallest_number(s));

	}

	public static String smallest_number(String s) {
		int n = s.length();
		int[] ans = new int[n + 1];
		Stack<Integer> st = new Stack<>();
		int count = 1;
		for (int i = 0; i <= n; i++) {
			if (i == n || s.charAt(i) == 'I') {
              ans[i] = count;
              count++;
              while(!st.isEmpty()) { // yeh loop tab tk chalega jab tk stack bhara hua hai jaise hi stack khali hua yani ki true toh tabhi sruk jayega loop
            	  ans[st.pop()] = count;
            	  count++;
            	  
              }
			}else {
				st.push(i);
			}

		}
		String str = "";
		for(int i = 0 ; i <ans.length; i++) {
			str+=ans[i];
		}
		return str;
		

	}

}
