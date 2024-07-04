package kalyan;

public class StringPrac {

	public static void main(String[] args) {
		String s = "i am your friend";
//	d ne irfr uoyami
		int len = s.length() - 1;
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				s1 = s1 + s.charAt(i);
			} else {
				if (s.charAt(len) == ' ') {
					len--;
					s1 = s1 + s.charAt(len);
					len--;
				} else {
					s1 = s1 + s.charAt(len);
					len--;
				}
			}
		}

		System.out.println(s1);

	}
}
