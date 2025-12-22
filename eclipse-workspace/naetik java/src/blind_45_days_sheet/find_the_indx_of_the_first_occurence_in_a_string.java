package blind_45_days_sheet;

public class find_the_indx_of_the_first_occurence_in_a_string {

	class Solution {
		public int strStr(String haystack, String needle) {
			int n = haystack.length();
			int m = needle.length();
			if (m > n) {
				return -1; // needle length can never be greater than haystack
			}
			for (int i = 0; i <= n - m; i++) { 
				int j = 0;
				while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
					j++;
				}
				if (j == m) {
					return i;
				}

			}
			return -1;
		}

	}

}
//hum basically joh needle string hai na usse slide karva rahe hai on the haystack string theke so i+j isliye kyuki hum har character ke starting point sai yeh check karna chahte hai ki bhai needle string ka character match ho raha hai ya nai  and n-m becuase n - m → last possible start index