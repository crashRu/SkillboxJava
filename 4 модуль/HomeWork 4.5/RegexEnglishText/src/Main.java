public class Main
{
	public static void main(String[] args) {
		String s = "Below are a couple lines of text, notice how the text changes to highlight the matching characters " +
				"on each line as you type in the input field below. To continue to the next lesson, you will need to " +
				"use the new syntax and concept introduced in each lesson to write a pattern that matches all the lines " +
				"provided.";
		s = s.replaceAll("[^A-Za-z'А-Яа-я]+", " ");
		String fragments[] = s.split("\\s");

		for (String a : fragments) {
			System.out.println(a);
		}

	}
}
