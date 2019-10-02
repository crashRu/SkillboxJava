import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static final String FIRST_NAME_REGEX = "^([А-ЯA-Z][\\x27а-яa-z]+|[А-ЯA-Z][\\x27а-яa-z]+\\-([А-ЯA-Z][\\x27а-яa-z]+|(оглы)|(кызы)))";
    private static final String SECOND_NAME_REGEX = "\\s[А-ЯA-Z][\\x27а-яa-z]+$";
    private static final Pattern FULL_NAME_PATTERN = Pattern.compile(FIRST_NAME_REGEX + "(" + SECOND_NAME_REGEX + ")?");

    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Pattern checkNumber = Pattern.compile("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$");
        while (true) {
            System.out.println(printText());
            String text = scanner.nextLine();
            if (text.equalsIgnoreCase("LIST")) {
                printBook(phoneBook);

            } else if (checkNumber.matcher(text).find()) {
                String number = formatByNumber(text);
                if (phoneBook.containsValue(number)) {
                    System.out.println(printNameAndPhone(number, findNameByNumber(phoneBook, number)));
                } else {
                    System.out.println(printText() + number);
                    String name = scanner.nextLine();

                    if (isName(name)) {
                        phoneBook.put(name, number);
                    }
                }
            } else if (isName(text)) {
                String name = text;
                if (phoneBook.containsKey(name)) {
                    System.out.println(printNameAndPhone(phoneBook.get(name), name));
                } else {
                    System.out.println("Введите пожалуйста номер абонента с именем " + name);
                    String number = scanner.nextLine();
                    if (checkNumber.matcher(number).find()) {
                        number = formatByNumber(number);
                        phoneBook.put(name, number);
                    }
                }
            } else {
                System.err.println("Вы ввели данные не правильно, ошибка добавления данных \"Принимается формат Имя Фамилия, Имя Фамилия Отчество и номер телефона российского оператора\" ");

            }
        }
    }

    private static void printBook(Map<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println("Номер телефона :" + map.get(key) + " Данные о клиенте: " + key);
        }
    }

    private static String findNameByNumber(Map<String, String> map, String text) {
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (text.equals(pair.getValue())) {
                return pair.getKey();
            }
        }
        return null;
    }

    private static String formatByNumber(String number) {
        String formatNumber = "^([7|8])?(\\d{3})(\\d{3})(\\d{2})(\\d{2}$)";
        number = number.replaceAll("\\D", "").replaceFirst(formatNumber, "+7 $2 $3-$4-$5");
        return number;
    }

    private static String printNameAndPhone(String name, String number) {
        return "Номер телефона: " + number + " Данные о клиенте: " + name;
    }

    private static String printText() {
        return "Введите пожалуйста данные о абоненте, в формате: \"Имя, Имя фамилия(Имя Фамилия Отчество) или номер телефона\" ";
    }

    private static boolean isName(String name) {
        Matcher checkNameMat = FULL_NAME_PATTERN.matcher(name);
        if (checkNameMat.find()) {
            return true;
        } else {
            return false;
        }
    }
}