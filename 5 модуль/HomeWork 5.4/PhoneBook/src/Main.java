import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		HashMap<String, String> phoneBook = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		Pattern checkNumber = Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");
		Pattern checkName = Pattern.compile("^([А-ЯA-Z][\\x27а-яa-z]{1,}|[А-ЯA-Z][\\x27а-яa-z]{1,}\\-([А-ЯA-Z][\\x27а-яa-z]{1,}|(оглы)|(кызы)))\\040[А-ЯA-Z][\\x27а-яa-z]{1,}(\\040[А-ЯA-Z][\\x27а-яa-z]{1,})?$");
		while (true) {
			System.out.println("Введите пожалуйста данные о абоненте, в формате: \"Имя фамилия(Имя Фамилия Отчество) или номер телефона\" ");
			String text = scanner.nextLine();
			String formatNumber = "^([7|8])?(\\d{3})(\\d{3})(\\d{2})(\\d{2}$)";
			if (text.equalsIgnoreCase("LIST")) {
				printBook(phoneBook);

			} else if (checkNumber.matcher(text).find()) {
				String number  = text.replaceAll("\\D", "").replaceFirst(formatNumber, "+7 $2 $3-$4-$5");
				if (phoneBook.containsValue(number)) {
					System.out.println("Номер телефона: " + number + " Данные о клиенте: " + searchKey(phoneBook,number));
					continue;
				} else {
					System.out.println("Введите пожалуйста имя абонента, в формате: \"Имя фамилия(Имя Фамилия Отчество) или номер телефона\"  с номером  " + number);
					String name = scanner.nextLine();
					Matcher checkNameMat = checkName.matcher(name);
					if (checkNameMat.find()) {
						phoneBook.put(name, number);
					}
				}
			} else if (checkName.matcher(text).find()) {
				String name = text;
				if (phoneBook.containsKey(name)) {
					System.out.println("Номер телефона: " + phoneBook.get(name) + " Данные о клиенте: " + name);
				} else {
					System.out.println("Введите пожалуйста номер абонента с именем " + name);
					String number = scanner.nextLine();
					if (checkNumber.matcher(number).find()) {
						number = number.replaceAll("\\D", "").replaceFirst(formatNumber, "+7 $2 $3-$4-$5");
						phoneBook.put(name, number);
					}
				}
			} else {
				System.err.println("Вы ввели данные не правильно, ошибка добавления данных \"Принимается формат Имя Фамилия, Имя Фамилия Отчество и номер телефона российского оператора\" ");
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
		return null;
	}
}