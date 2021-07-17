
public class StringMethods {

	public static void main(String[] args) {
		String str = "hello";
		String s = new String("hello");
		System.out.println(str.equals(s));
		
		//use the length() method
		System.out.println(str.length());
		
		//use the indexOf() method
		System.out.println(str.indexOf("h"));
	}
}
