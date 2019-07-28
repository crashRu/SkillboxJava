public class Main
{
	public static void main(String[] args) {
		double[] temperatures = new double[30];
		double temp;
		double middleTemp = 0;
		int count = 0;

		for (int i = 0; i < temperatures.length; i++) {
			temp = (Math.random() * 12.13) + 30;
			temperatures[i] = (double) Math.round(temp * 10d) / 10d;
			System.out.println(temperatures[i]);
		}
		for (int i = 0; i < temperatures.length; i++) {
			middleTemp += temperatures[i];
			if (i == temperatures.length - 1) {
				middleTemp = middleTemp / temperatures.length;
				System.out.printf("Стредняя теипература по больнице: %.2f ", middleTemp);
			}
		}
		for (int j = 0; j <temperatures.length ; j++) {
			if (temperatures[j] >= 36.2 && temperatures[j] <= 36.9) {
				count++;
			}
		}
		System.out.println();
		System.out.println("В больнице здоровых людей: " + count);

	}
}