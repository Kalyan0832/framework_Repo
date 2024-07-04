package kalyan;

public class ReverseAString {
public static void main(String[] args) {
	String s="java is a wonderful language";
	
	for (int i = s.length()-1; i>=0; i--) {
		System.out.print(s.charAt(i));
	}
	
}
}
