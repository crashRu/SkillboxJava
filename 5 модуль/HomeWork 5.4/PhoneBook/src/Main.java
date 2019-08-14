import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		HashMap<String, String> phoneBook = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		Pattern checkNumber = Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");
		Pattern checkName = Pattern.compile("([А-Я][а-яё]{1,23})");
		while (true) {
			System.out.println("Введите пожалуйста данные о абоненте!");
			String text = scanner.nextLine();
			if (text.equalsIgnoreCase("LIST")) {
				PrintBook(phoneBook);

			} else if (checkNumber.matcher(text).find()) {
				if (phoneBook.containsValue(text)) {
					System.out.println("Номер телефона: " + text + " Данные о клиенте: " + phoneBook.get(text));
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
					System.out.println("Номер телефона: " + text + " Данные о клиенте: " + phoneBook.get(text));
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


	private static void PrintBook(Map<String, String> map) {
		for (String key : map.keySet()) {
			System.out.println("Номер телефона :" + key + " Данные о клиенте: " + map.get(key));
		}
	}
}
