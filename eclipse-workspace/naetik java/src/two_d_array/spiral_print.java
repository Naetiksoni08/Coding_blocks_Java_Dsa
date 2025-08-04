package two_d_array;

public class spiral_print {

	public static void main(String[] args) {
		int[][]arr= {{1,2,3,4},
				     {5,6,7,8},
				    {9,10,11,12},
				     {13,14,15,16}};
		
		
    print(arr);
	}
	public static void print(int[][]arr) {
		int minr=0; // minimum row 
		int minc=0; // minimum column
		int maxr = arr.length-1; // maximum row is the last element 
		int maxc= arr[0].length-1; // max column gives column index
		int total = arr.length * arr[0].length; // total number of elements are n*m
		int count = 0; //  we will maintain a count and then we will do count++ total number of elements will be printed
		while(count<total) { 
		for(int i = minc; i<=maxc && count<total;i++) {
			System.out.print(arr[minr][i] + " "); // column is varying row is stop
			count++;
		}
		minr++;
		for(int i = minr; i<=maxr && count<total; i++) { // 4 loops for 4 boundary
			System.out.print(arr[i][maxc]+ " "); // first row then column that is why i maxc
			count++;
		}
		maxc--;
		for(int i = maxc; i>=minc && count<total; i--) {
			System.out.print(arr[maxr][i] + " ");
			count++;
		}
		maxr--;
		for(int i = maxr; i>=minr && count<total; i--) {
			System.out.print(arr[i][minc] + " ");
			count++;
		}
		minc++;
	    }
    }
 }


// while loop earlier was this minr<=maxr &&  minc<=maxc but even after printing the whole atrix the loop was working so that is why we will impromise the code
//pointers should not exceed or cross each other(minr<=maxr &&  minc<=maxc)
