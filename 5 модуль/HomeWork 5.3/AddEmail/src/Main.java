import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.regex.*;

public class Main {
	public static void main(String[] args) throws IOException {
		HashSet<String> mail = new HashSet<>();
		Pattern pattern = Pattern.compile("^(?ui)([add]{1,})\\s\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\w{2,4}");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("\n Введите пожалуйста свой Mail, доступные команды \"add mail\" , \"list\" , \"exit\". ");
			String text = reader.readLine();
			Matcher matcher = pattern.matcher(text);
			if (text.equalsIgnoreCase("list")) {
				for (String timeVariable : mail) {
					System.out.println(timeVariable);
				}
			} else if (matcher.find()) {
				text = text.replaceAll("^(?ui)([add]{1,})\\s", "");
				mail.add(text);
			} else if (text.equalsIgnoreCase("Exit")) {
				System.out.println("Вы завершили выполнение программы");
				System.exit(0);

			} else {
				System.err.print(" Вы ввели Mail в неправильной форме, введите по форме \"ВашЛогин@Сервис.регионСервиса\" ");
			}
		}
	}

}
