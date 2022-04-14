package basicjava;

public class FindLastTwoCharString {

	
	public void findLasttwo(String str) {
		String str1=str.substring(str.length()-2,str.length());
		System.out.println(str1);
	}
}
