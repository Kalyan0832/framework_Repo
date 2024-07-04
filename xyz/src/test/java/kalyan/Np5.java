package kalyan;

public class Np5 {
	static int a = 20;
	String s = "QSP";

	public void nonStatic() {
		System.out.println("nonStatic() starts");
		System.out.println(a);
		int a = 20;
		System.out.println(Np5.a);
		System.out.println(s);
		String s = "SQL";
		System.out.println(this.s);
		System.out.println(this);
		System.out.println(this.a);
		System.out.println("nonStatic() ends");
	}

	public static void main(String[] args) {
		System.out.println("main begins");

		Np5 obj = new Np5();
		obj.nonStatic();
		System.out.println(obj.toString());
		System.out.println("main ends");
	}
}
