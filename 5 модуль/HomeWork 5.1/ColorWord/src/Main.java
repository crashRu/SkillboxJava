public class Main
{
	public static void main(String[] args) {
		String text = "Каждый охотник желает знать, где сидит фазан";
		String[] colors = text.split(",?\\s+");
		for (int i = colors.length - 1; i >= 0; i--) {
			System.out.println(colors[i]);
		}
	}
}
