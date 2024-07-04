package kalyan;

/**
 * @author kalyan
 */
public class Laptop {

	String name;
	int ram;

	public Laptop(String name, int ram) {
		this.name = name;
		this.ram = ram;
	}
	public static void main(String[] args) {
		Laptop obj1 = new Laptop("lenovo", 8);
		Laptop obj2 = new Laptop("lenovo", 8);
		
		System.out.println(obj1.compare(obj2));
		
		System.out.println(obj1.equals(obj2));
		
//		boolean b = obj1.equals(obj2);
//		
//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());
//		
//		System.out.println(b);
		
	}
	public boolean equals(Laptop o) {
		return  this.name==o.name &&
				this.ram==o.ram;
	}
	
	public int compare(Laptop o) {
		if (this.name==o.name &&
				this.ram==o.ram) {
			return 1;
		}
		return 0;
	}
	
	
	
}
