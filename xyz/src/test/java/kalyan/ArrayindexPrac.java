package kalyan;

import java.util.ArrayList;

public class ArrayindexPrac {
public static void main(String[] args) {
	
	ArrayList<Integer> al=new ArrayList<Integer>();
	for (int i = 1; i <=10; i++) {
		al.add(i);
	}
	for (int i = 0; i < al.size()-1; i++) {
		for (int j = i+1; j <al.size()-1; j++) {
			if (al.get(i)<al.get(i+1)) {
				Integer x = al.get(i);
				Integer temp = al.get(i+1);
				al.remove(i);
				al.remove(i+1);
				al.set(i+1, x)
				al.add(i, temp);
			}
		}
	}
	System.out.println(al);
	
	
}
}
