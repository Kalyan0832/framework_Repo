package kalyan;

import java.util.ArrayList;

public class SortByheight {
	String Structure;
	String country;
	String city;
	int Height;
	int Built;
	int rank;

	public SortByheight(String Structure, String country, String city, int Height, int Built, int rank) {
		this.Structure = Structure;
		this.country = country;
		this.city = city;
		this.Height = Height;
		this.Built = Built;
		this.rank = rank;
	}

	public static void main(String[] args) {
		ArrayList<SortByheight> a = new ArrayList<SortByheight>();
		a.add(new SortByheight("Burj Kalifa", "UAE", "Dubai", 829, 2010, 1));
		a.add(new SortByheight("Clock Tower Hotel", "Saudhi Arabia", "Mecca", 601, 2012, 2));
		a.add(new SortByheight("Talpal 101", "Taiwan", "Taipai", 509, 2004, 3));
		a.add(new SortByheight("Financial Center", "China", "Shangai", 492, 2008, 4));

//		a.add(new SortByheight("Talpal 101", "Taiwan", "Taipai", 509, 2004, 3));
//		a.add(new SortByheight("Financial Center", "China", "Shangai", 492, 2008, 4));
		System.out.println(a);
		System.out.println("==========================");
		for (int i = 0; i < a.size() - 1; i++) {
			for (int j = i+1; j < a.size()-1; j++) {
				if (a.get(j).Height > a.get(j + 1).Height) {
					SortByheight temp = a.get(j);
					a.set(j, a.get(j+1));
					a.set(j+1, temp);
				}
			}
		}
		System.out.println(a);
	}
	public String toString() {
		return  Height+"";
	}
}