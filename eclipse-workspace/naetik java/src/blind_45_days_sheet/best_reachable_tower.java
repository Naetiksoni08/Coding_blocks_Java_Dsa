package blind_45_days_sheet;

public class best_reachable_tower {
	public static void main(String[] args) {
		int[][] towers = { { 1, 2, 5 }, { 2, 1, 7 }, { 3, 1, 9 } }; // lets understand how to read this data
		// position 1,2 with quality 5. same position 2,1 with equality 7 and position
		// 3,1 with quality 9.
		int[] center = { 1, 1 }; // we are standing at 1,1
		int radius = 2; // my range
		// "Teri range ke andar kaun se towers hain aur unme se sabse best quality wala
		// kaun sa hai?"
		int [] ans = reachable_tower(towers, center, radius);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}

	}

	public static int[] reachable_tower(int[][] towers, int[] center, int r) {
		int maxquality = -1;
		int [] bestower = {-1,-1};
		for (int[] t : towers) {
			int distance = Math.abs(t[0]-center[0])+Math.abs(t[1]-center[1]);
			if (distance <= r) {
				if (t[2] > maxquality) {
					maxquality = t[2];
					bestower[0] = t[0]; // x coordinate
					bestower[1] = t[1];  // y coordinate
				} else if(t[2]==maxquality) {
					if(t[0]<bestower[0] || (t[0]==bestower[0] && t[1]<bestower[1])) {
						bestower[0] = t[0];
						bestower[1] = t[1];
					}
				}
			}

		}
		return bestower;
		

	}

}
