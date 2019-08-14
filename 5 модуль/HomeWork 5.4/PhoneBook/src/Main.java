import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		HashMap<String, String> phoneBook = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		Pattern checkNumber = Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");
		Pattern checkName = Pattern.compile("^([А-ЯA-Z]|[А-ЯA-Z][\\x27а-яa-z]{1,}|[А-ЯA-Z][\\x27а-яa-z]{1,}\\-([А-ЯA-Z][\\x27а-яa-z]{1,}|(оглы)|(кызы)))\\040[А-ЯA-Z][\\x27а-яa-z]{1,}(\\040[А-ЯA-Z][\\x27а-яa-z]{1,})?$");
		while (true) {
			System.out.println("Введите пожалуйста данные о абоненте!");
			String text = scanner.nextLine();
			if (text.equalsIgnoreCase("LIST")) {
				printBook(phoneBook);

			} else if (checkNumber.matcher(text).find()) {
				String formatNumber = "^([7|8])?(\\d{3})(\\d{3})(\\d{2})(\\d{2}$)";
				text = text.replaceAll("\\D", "").replaceFirst(formatNumber, "+7 $2 $3-$4-$5");
				if (phoneBook.containsValue(text)) {
					System.out.println("Номер телефона: " + text + " Данные о клиенте: " + searchKey(phoneBook,text));
					continue;
				} else {
					System.out.println("Введите пожалуйста имя абонента с номером " + text);
					String name = scanner.nextLine();
					Matcher checkNameMat = checkName.matcher(name);
					if (checkNameMat.find()) {
						phoneBook.put(name, text);
					}
				}
			} else if (checkName.matcher(text).find()) {
				if (phoneBook.containsKey(text)) {
					System.out.println("Номер телефона: " + phoneBook.get(text) + " Данные о клиенте: " + text);
				} else {
					System.out.println("Введите пожалуйста номер абонента с именем " + text);
					String number = scanner.nextLine();
					if (checkNumber.matcher(number).find()) {
						phoneBook.put(text, number);
					}
				}
			} else {
				System.err.println("Вы ввели данные не правильно, ошибка добавления данных ");
				continue;

			}
		}
	}


	private static void printBook(Map<String, String> map) {
		for (String key : map.keySet()) {
			System.out.println("Номер телефона :" + map.get(key) + " Данные о клиенте: " + key);
		}
	}

	private static String searchKey(Map<String, String> map, String text) {
		for (Map.Entry<String, String> pair : map.entrySet()) {
			if (text.equals(pair.getValue())) {
				return pair.getKey();
			}
		}
		return "!";
	}
}