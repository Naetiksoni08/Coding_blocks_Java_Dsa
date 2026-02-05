package blind_45_days_sheet;

import java.util.Arrays;

public class Stone_game_4 {

    public static void main(String[] args) {

        int[] aliceValues = {1, 3};
        int[] bobValues = {2, 1};

        Integer[] idx = new Integer[aliceValues.length]; 

        for (int i = 0; i < aliceValues.length; i++) {//these are basically stone number stone 0 ,1 ..so on
            idx[i] = i;
        }

        // sort by combined value
        Arrays.sort(idx, (a, b) ->
            (aliceValues[b] + bobValues[b]) -  // we are doing descending order sorting so sum(b)-sum(a)
            (aliceValues[a] + bobValues[a]) // after sum we will have index-0=3 index-1=10 and index-2=10 fir bas 0 and 1 ko compare karenge b-1 karke so 10-3=+7 so positive hai toh fir b phele fir a fir 1 and 2 ka comaprision so10-10 = 0 so final index order will be 1,2,0 ie, 10,10,3
        );//stone 0 → 1 + 2 = 3
        //stone 1 → 3 + 1 = 4 after sorting the order becomes {1,0} this is the idx so the value willl be {4,3} actually we needed to did sorting so we could not direclty sort alice array becuase if we did that then idx ordering change ho jati thats why we sorted the idx 

        int alice = 0;
        int bob = 0;

        for (int turn = 0; turn < aliceValues.length; turn++) {

            int i = idx[turn];
 // alice picks even and bob picks odd
            if (turn % 2 == 0)
                alice += aliceValues[i];
            else
                bob += bobValues[i];
        }

        if (alice > bob) System.out.println(1);
        else if (bob > alice) System.out.println(-1);
        else System.out.println(0);
    } // tc will be n log n
}
