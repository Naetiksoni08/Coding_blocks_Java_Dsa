package blind_45_days_sheet;

public class minimum_the_maximum_waiting_time_at_synchronized_traffic_light {

	public static void main(String[] args) {
		int period = 8;
		int[] lights = { 2, 3 };
		int[] arrivalTime = { 2, 5, 8, 11 };
		int biggestGreenLight = 0;
		for (int light : lights) {
			biggestGreenLight = Math.max(light, biggestGreenLight);

		}
		int penalty = 0;
		for (int time : arrivalTime) {
			int reminder = time % period; // 2%8 = 2; , 2,5,0,3

			if (reminder >= biggestGreenLight) {
				penalty = Math.max(penalty, period - reminder); // 8-reminder
			}
		}
		System.out.println(penalty);
	}

}


//Inka remainder r sabse badi green duration G se chhota hai.
//Matlab: r < G → yeh car hamesha green mein hi aayegi agar isse best light pe lagayein.
//Waiting time = 0 

//Cars with r >= G:
//Inka remainder G se bada ya barabar hai.
//Since G hi sabse bada green time hai, koi bhi light inhe green mein nahi pakad sakti.
//Har light ke liye r >= g hoga.
//Waiting time = period - r (fixed, koi bhi light choose karo same wait) bas yehi nikalna hai hume kyuki penalty issi case mai lagegi hume 