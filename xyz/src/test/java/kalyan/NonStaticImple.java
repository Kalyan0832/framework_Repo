package kalyan;

public class NonStaticImple implements NonStatic {

	int a=10;
	String s1="pavan";
	public static void main(String[] args) {
		NonStatic obj=new NonStaticImple();
		obj.m2();
		obj.m3();
	}
	public void m3() {
		System.out.println("from m3()");
	}
	public void m2() {
		System.out.println("from m2() from class");
	}
}
