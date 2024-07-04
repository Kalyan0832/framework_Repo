package kalyan;

import java.util.ArrayList;

public class Task {
	String country;
	String capital;
	String currency;
	String[] languages;

	public Task(String country, String capital, String currency, String[] languages) {
		this.country = country;
		this.capital = capital;
		this.currency = currency;
		this.languages = languages;
	}
	public static void main(String[] args) {

		ArrayList<Task> al = new ArrayList<Task>();
		String[] s1 = { "lang1", "lang2", "lang3" };
		al.add(new Task("Albania", "Tirane", "Lek", new String[] { "lang1", "lang2", "lang3" }));
		String[] s2 = { "lang1" };
		al.add(new Task("abc", "xyz", "rupee", s2));
		for (Task s : al) {
			if (s.languages.length > 1) {
				System.out.println(s.country);
			}
		}
	}
}