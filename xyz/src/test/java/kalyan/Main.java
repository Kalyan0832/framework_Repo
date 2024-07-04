package kalyan;

public class Main {
	public static void main(String[] args) {
		String input = "i am your friend";
		String output = rearrange(input);
		System.out.println(output);
	}

	public static String rearrange(String input) {
		StringBuilder output = new StringBuilder();
		String[] words = input.split(" ");

		for (String word : words) {
			output.insert(0, word);
		}

		return output.toString();
	}
}
