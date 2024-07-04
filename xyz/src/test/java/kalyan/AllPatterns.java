package kalyan;

import java.util.Iterator;

import org.testng.annotations.Test;

public class AllPatterns {
	@Test
	public void m1() {
		int row = 3, star = 1, space = 2;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			space--;
			star += 2;
			System.out.println();
		}
	}

	@Test
	public void m2() {
		int row = 5, star = 1, space = 2;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			if (i < 3) {
				space--;
				star += 2;
			} else {
				space++;
				star -= 2;
			}

			System.out.println();
		}
	}

	@Test
	public void m3() {
		int row = 3, star = 1, space = 2;
		for (int i = 1; i <= row; i++) {
			int n = 1;
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print(n);
				if (j <= star / 2) {
					n++;
				} else {
					n--;
				}
			}
			space--;
			star += 2;
			System.out.println();
		}
	}
	
	@Test
	public void m4() {
		int row = 5, character = 1, space = row-1;
		for (int i = 1; i <= row; i++) {
			char ch='A';
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= character; j++) {
				System.out.print(ch);
				if (j <= character / 2) {
					ch++;
				} else {
					ch--;
				}
			}
			space--;
			character += 2;
			System.out.println();
		}
	}
	@Test
	public void m5() {
		int row=5,space=2,x=1;
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <=space; j++) {
				System.out.print(" ");
			}
			for (int j = 1;j <=x; j++) {
				if (j==1||j==x) {
					System.out.print("1");
				}
				else {
					System.out.print("*");
				}
			}
			if (i<3) {
				space--;
				x=x+2;	
			}
			else {
				space++;
				x=x-2;
			}
			System.out.println();
		}
	}
}
