package kalyan;

public interface NonStatic {
	public static void main(String[] args) {
		System.out.println("from main()");
		m1();
	}

	public static void m1() {
		System.out.println("from m1()");
	}
	
	default void m2() {
		System.out.println("from m2() from interface");
	}
	public void m3();
}
