package kalyan;

import java.util.ArrayList;

public class Sort {
public static void main(String[] args) {

	ArrayList<Integer> al=new ArrayList<Integer>();
	
	al.add(10);
	al.add(20);
	al.add(40);
	al.add(50);
	al.add(30);
	System.out.println(al);
//	al.set(0, 15);
	System.out.println(al);

	for (int i = 0; i < al.size()-1; i++) {
		for (int j = i+1; j <  al.size()-1; j++) {
			if (al.get(j)>al.get(j+1)) {
				Integer temp = al.get(j+1);
				al.set(j+1, al.get(j));
				al.set(j, temp);			
			}
		}
	}
	System.out.println(al);	
}
}
