package blind_45_days_sheet;

public class heap_client {
	public static void main(String[] args) {
		Heap_Implementation hp = new Heap_Implementation();
		hp.Add(10);
		hp.Add(20);
		hp.Add(30);
		hp.Add(1);
		hp.Add(5);
		hp.Add(7);
		hp.Add(3);
		hp.Add(2);
		hp.Add(-4);
		hp.Display();
		System.out.println();
		System.out.println(hp.remove());
		hp.Display();
		
		
		
	}

}
