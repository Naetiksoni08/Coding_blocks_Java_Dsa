package blind_45_days_sheet;


public class map_client {
	public static void main(String[] args) {
		map_implementation<String, Integer> map = new map_implementation<>();
		map.put("raj", 89);
		map.put("ankit", 79);
		map.put("kaju", 99);
		map.put("ankita", 59);
		map.put("vishal", 77);
		map.put("pooja", 88);
		map.put("anku", 88);
		map.put("puneet", 73);
		map.put("ankita", 38);
		System.out.println(map.get("ankit"));
		System.out.println(map.get("ankita"));
		System.out.println(map);
	}

}
