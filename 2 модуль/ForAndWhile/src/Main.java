public class Main {
	public static void main(String[] args) {
//        for (int i = 200000; i < 210000 ; i++) {
//            System.out.println(i);
//        }
//        for (int i = 220000; i < 235000 ; i++) {
//            System.out.println(i);
//        }
//		int i = 200000;
//		int j = 220000;
//
//        while (i <= 210000) {
//            System.out.println(i);
//            i++;
//        }
//        while (j <= 210000) {
//            System.out.println(i);
//            j++;
//        }
		int i = 200000;
		do {
			System.out.println(i);
			if (i == 210000) {
				break;
			}
			i++;
		} while (true);

		int j = 220000;
		do {
			System.out.println(j);
			if (j == 235000) {
				break;
			}
			j++;
		} while (true);
	}
}
