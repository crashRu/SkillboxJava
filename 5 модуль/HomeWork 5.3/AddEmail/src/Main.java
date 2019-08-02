import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
	public static void main(String[] args) throws IOException {
		final String CHECKMAIL = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"" +
				"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])" +
				"*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]" +
				"|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:" +
				"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";

		HashSet<String> mail = new HashSet<>();
		Pattern pattern = Pattern.compile("^(?ui)(add) (\\w+([.-]?\\w+)*@\\w+([.-]?\\w+)*\\.\\w{2,4})");
		Scanner reader = new Scanner(System.in);
		while (true) {
			System.out.println("Введите пожалуйста свой Mail, доступные команды \"add mail\" , \"list\" , \"exit\". ");
			String text = reader.nextLine();

			Matcher matcher = pattern.matcher(text);
			if (matcher.find()) {
				text = matcher.group(2);
				var checkMail = Pattern.compile(CHECKMAIL).matcher(text);
				if (checkMail.find()) {
					mail.add(text);
				}
			} else if (text.equalsIgnoreCase("list")) {
				for (String timeVariable : mail) {
					System.out.println(timeVariable);
				}
			} else if (text.equalsIgnoreCase("Exit")) {
				System.out.println("Вы завершили выполнение программы");
				return;

			} else {
				System.err.print(" Вы ввели Mail в неправильной форме, введите по форме \"ВашЛогин@Сервис.регионСервиса\" ");
			}
		}
	}

}
