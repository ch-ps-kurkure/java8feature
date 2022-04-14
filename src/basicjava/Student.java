package basicjava;

public class Student {
	//Compile time poly (Overload)
	public void read() {
		System.out.println("Student is reading xyz book");
	}
	
	public void read(String a) {
		System.out.println("Reading"+a);
	}
}

