package LECTURE_7;

public class gas_station {

	public int canCompleteCircuit(int[] gas, int[] cost) {
     	int position = 0 ;
        int  sum = 0 ;
        int total = 0;

		for(int i = 0 ; i < gas.length; i++) {
			sum = sum + gas[i] - cost[i];
			total = total+(gas[i]-cost[i]);
			if(sum<0) {
		
				position = i+1;
				sum=0;
			}
		}
		return total < 0 ? -1: position ;

	}
}



