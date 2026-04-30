package blind_45_days_sheet;

public class can_place_flower {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 0, 1 };
		int n = 1;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				// So basically the logic is that if we are currently standing on index 0 then
				// we can assume that there will be no element behind 0. That means that we
				// don't need to worry about the previous element because in order to plot a
				// flower bed we need to make sure that its left and right are going to be 0.
				// This is because in the question it is mentioned that you cannot place
				// adjacent flower beds. We are simply checking that if that is equal to 0. That
				// means we are currently standing on the 0th index so we don't need to worry
				// about the i-1 index because it's always going to be empty. Again we are also
				// handling another case that if i-1 = 0 then also we don't need to worry about
				// anything
				boolean leftempty = (arr[i] == 0) || (arr[i - 1] == 0);
				// Same as the above statement, we are basically checking for the right end this
				// time. We are saying that if we are currently standing on the last element,
				// then again we can assume that the i+1 element is going to be zero because
				// there will be no plotted plant at i+1. If we are currently standing on
				// array.length - 1, which is the last value, then we can assume that we don't
				// need to worry about the right i+1 element, just like that. We are also
				// checking whether the i+1 index is equal to zero. This one is again an edge
				// case that we need to handle. It simply means that, for example, if I'm
				// currently standing on index 1 (considering or assuming that the flow part
				// starts from 0 with index), then I'm checking left from the above statement
				// whether the left is empty or not. Also I'm checking the right, that is this
				// statement that i+1 is equal to zero or not. That is, the second index is
				// equal to zero or not. That's it
				boolean rightempty = (i == arr.length - 1) || (arr[i + 1] == 0);
				if (leftempty && rightempty) {
					arr[i] = 1;
					count++;

					if (count >= n) {
						System.out.println(true);
					}
				}
			}
		}
		System.out.println(count >= n);
// Think of it like this: If I ask you, "Can you fit 2 people in your car?" and
// your car has 5 seats, the answer is True.
//If you only check count == n, and you find 5 spots, you might accidentally return false just because you found too much space.
//By checking count >= n, you are saying: "I found at least enough spots to satisfy the requirement."

	}
}
