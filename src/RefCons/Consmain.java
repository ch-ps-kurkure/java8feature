package RefCons;

import java.util.Optional;

public class Consmain {

	public static void main(String[] args) {
		System.out.println("learning Constructor ref");
		//Using lambda
		Provider provider=()->{
			return new Student();
		};
		Student student= provider.getstudent();
		student.display();
		
		//Constuctor Reference
		//Constuctor::new
		Provider provider1=Student::new;
		Student student2= provider1.getstudent();
		student2.display();
		
		System.out.println("--------------------");
		System.out.println("Optional class");
		
		String str="I love Java";
		Optional<String> optional=Optional.ofNullable(str);
		System.out.println(optional.isPresent());
	}
	
}
