import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.addAll(generateNumber());
		Scanner scaner = new Scanner(System.in);
		String elementToSearch = "X000XX96";
		for (; ; ) {
			System.out.println("Введите номер который вы ищите в формате \"Буква, 3 цифры, 2 Буквы, регион\"");
			scaner.nextLine();
			allSearch(list, elementToSearch);
		}
	}

	public static void allSearch(ArrayList<String> list, String elementToSearch) {
		Long searchStartTime = System.nanoTime();
		binarySearch(list, elementToSearch);
		printText(System.nanoTime(), searchStartTime, "бинарный");
		searchStartTime = System.nanoTime();
		directSearch(list, elementToSearch);
		printText(System.nanoTime(), searchStartTime, "линейный");
		searchStartTime = System.nanoTime();
		treeSetSearch(list, elementToSearch);
		printText(System.nanoTime(), searchStartTime, "TreeSet");
		searchStartTime = System.nanoTime();
		hashSetSearch(list, elementToSearch);
		printText(System.nanoTime(), searchStartTime, "HashSet");


	}

	public static int binarySearch(ArrayList<String> list, String elementToSearch) {
		Collections.sort(list);
		int elementNumber = Collections.binarySearch(list, elementToSearch);
		return elementNumber;
	}

	public static boolean directSearch(ArrayList<String> list, String elementToSearch) {
		return list.contains(elementToSearch);
	}

	public static boolean treeSetSearch(ArrayList<String> list, String elementToSearch) {
		TreeSet<String> searchTreeSet = new TreeSet<>();
		searchTreeSet.addAll(list);
		return searchTreeSet.contains(elementToSearch);

	}

	public static boolean hashSetSearch(ArrayList<String> list, String elementToSearch) {
		HashSet<String> searchHashSet = new HashSet<>();
		searchHashSet.addAll(list);
		return searchHashSet.contains(elementToSearch);
	}

	public static void printText(Long stopSearchTime, Long startSearchTime,String typeSearch) {
		System.out.println("По результатам тестирования " + typeSearch + " поиск нашел элемент за : " + String.valueOf(stopSearchTime - startSearchTime));
	}


	public static ArrayList generateNumber() {
		String[] chars = {"A", "B", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
		ArrayList<String> coolNumbersList = new ArrayList<>();
		String s;
		for (int a = 1; a < 197; a++) {
			for (int i = 0; i < chars.length; i++) {
				for (int j = 0; j < 10; j++) {
					if (a < 10)
						s = chars[i] + j + j + j + chars[i] + chars[i] + 0 + a;
					else
						s = chars[i] + j + j + j + chars[i] + chars[i] + a;
					coolNumbersList.add(s);
				}
			}
		}
		return coolNumbersList;
	}
}
