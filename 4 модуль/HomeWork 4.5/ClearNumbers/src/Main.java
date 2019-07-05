import java.util.Scanner;

public class Main
{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String clearNumber = scanner.nextLine().replaceAll("\\D", "");
		String regex = "^([7|8])?(\\d{3})(\\d{3})(\\d{2})(\\d{2}$)";
		String result;
		if (clearNumber.matches(regex)) {
			 result = clearNumber.replaceFirst(regex, "+7 $2 $3-$4-$5");
		}else{
			 result = "Неверный формат - Введите пожалуйста правильный номер телефона";
		}

		System.out.println(result);
	}
}
