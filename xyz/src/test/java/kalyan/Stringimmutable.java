package kalyan;

public class Stringimmutable {
public static void main(String[] args) {
	
	String s="pavan";
	System.out.println(s.hashCode());
	
	s=" kalyan";
	System.out.println(s.hashCode());
	
	s="pavan";
	System.out.println(s.hashCode());
}
}
