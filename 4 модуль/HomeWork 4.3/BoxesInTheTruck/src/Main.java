public class Main {
	public static void main(String[] args) {
		Math.abs(5);
		int boxes = 666;
		int truck = 1;
		int container;
		int temporaryBoxes = 1;
		first:
		while (true) {
			System.out.println("Грузовик № " + truck);
			truck++;
			for (container = 1; container <= 12; container++) {
				if (boxes + 1 <= temporaryBoxes) {
					break first;
				}
				System.out.println("   Контейнер № " + container);

				for (int i = 1; i <= 27; i++) {
					if (boxes + 1 <= temporaryBoxes) {
						break first;
					}
					System.out.println("      Ящик № " + temporaryBoxes);
					temporaryBoxes++;
				}
			}
		}

	}


}
