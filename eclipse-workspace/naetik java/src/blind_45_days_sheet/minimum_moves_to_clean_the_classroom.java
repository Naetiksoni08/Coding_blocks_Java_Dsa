package blind_45_days_sheet;

import java.util.*;

public class minimum_moves_to_clean_the_classroom {
	
	static class State {
	    int r, c, e, mask;
	    State(int r, int c, int e, int mask) {
	        this.r = r;
	        this.c = c;
	        this.e = e;
	        this.mask = mask;
	    }
	}

	public static void main(String[] args) {
		String[] classroom = { "S.", "XL" };
		int m = classroom.length;
		int n = classroom[0].length();
		int energy = 2;
		int startrow = -1;
		int startcol = -1;
		List<int[]> litterCells = new ArrayList<>();
		for (int i = 0; i < m; i++) { // roww
			for (int j = 0; j < n; j++) { // col
				char ch = classroom[i].charAt(j);
				if (ch == 'S') {
					startrow = i;
					startcol = j;
				} else if (ch == 'L') {
					litterCells.add(new int[] { i, j });
				}
			}

		}
		Map<String, Integer> litterIndex = new HashMap<>();
		for (int i = 0; i < litterCells.size(); i++) {
			int[] cell = litterCells.get(i);
			 litterIndex.put(cell[0] + "," + cell[1], i); // 1,1 -> 0
		}
		
		int fullMask = (1 << litterCells.size()) - 1;
		
		
		Set<String> visited = new HashSet<>();
		Queue<State> queue = new LinkedList<>();
		State startState = new State(startrow, startcol, energy, 0);
		queue.add(startState);
		visited.add(startrow + "," + startcol + "," + energy + "," + 0);
		int moves = 0;
		
		int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // up, down, left, right

		while (!queue.isEmpty()) {
		    int size = queue.size(); // is level ke saare states

		    for (int k = 0; k < size; k++) {
		        State curr = queue.poll();

		        if (curr.mask == fullMask) {
		            System.out.println(moves);
		            return;
		        }

		        if (curr.e <= 0) continue; // energy khatam, is state se aage move nahi

		        for (int[] d : dirs) {
		            int nr = curr.r + d[0];
		            int nc = curr.c + d[1];

		            if (nr < 0 || nr >= m || nc < 0 || nc >= n) continue; // grid ke bahar

		            char cell = classroom[nr].charAt(nc);
		            if (cell == 'X') continue; // obstacle

		            int newEnergy = curr.e - 1;
		            int newMask = curr.mask;

		            if (cell == 'R') {
		                newEnergy = energy; // full reset
		            } else if (cell == 'L') {
		                String key = nr + "," + nc;
		                if (litterIndex.containsKey(key)) {
		                    int idx = litterIndex.get(key);
		                    newMask = curr.mask | (1 << idx);
		                }
		            }

		            String stateKey = nr + "," + nc + "," + newEnergy + "," + newMask;
		            if (!visited.contains(stateKey)) {
		                visited.add(stateKey);
		                queue.add(new State(nr, nc, newEnergy, newMask));
		            }
		        }
		    }

		    moves++;
		}

		System.out.println(-1);
		

	}

}
