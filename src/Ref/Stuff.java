package Ref;

public class Stuff {
public static void doStuff() {
	System.out.println("I am doing task");
}

public static void threadTask() {
	for(int i=1;i<10;i++) {
		System.out.println(i*2);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
	
	public  void PrintNum() {
		for(int i=1;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
}
}
