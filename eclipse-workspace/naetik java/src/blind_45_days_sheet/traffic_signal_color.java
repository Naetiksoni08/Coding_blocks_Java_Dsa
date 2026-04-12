package blind_45_days_sheet;

public class traffic_signal_color {
	
	public static void main(String[] args) {
		int timer = 60;
		StringBuilder sb = new StringBuilder();
		if(timer==0) {
//			System.out.println("Green");
			sb.append("Green");
		}else if(timer==30) {
//			System.out.println("Orange");
			sb.append("Orange");
		}else if(timer>30&&timer<=90) {
//			System.out.println("Red");
			sb.append("Red");
		}else {
//			System.out.println("Invalid");
			sb.append("Invalid");
		}
		System.out.println(sb.toString());
	}

}
