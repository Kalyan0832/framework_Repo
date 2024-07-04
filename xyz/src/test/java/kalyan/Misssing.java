package kalyan;

public class Misssing {
	public static void main(String[] args) {
		int a[]= {11, 13, 2, 15, 5, 7, 9, 10, 16, 19};
		for (int i = 1; i <=20; i++) {
			boolean b=true;
			for (int j = 0; j < a.length; j++) {
				if (i==a[j]) {
					b=false;
					break;
				}
			}
			if (b) {
				System.out.println(i);
			}
		}
//		for (int i = 0; i <=20; i++) {
//			if (!al.contains(a[i]))
//			{
//				System.out.println(i);
//			}
//		}
	}
}
